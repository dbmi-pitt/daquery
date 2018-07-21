package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.EmailContents;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.DataExportConfig;
import edu.pitt.dbmi.daquery.common.util.DataExporter;
import edu.pitt.dbmi.daquery.common.util.CaseExporter;
import edu.pitt.dbmi.daquery.common.util.EmailUtil;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.TableExporter;

@Entity
@Table(name = "SQL_DOWNLOAD")
@DiscriminatorValue(value = InquiryType.TYPES.SQL_DOWNALOAD)
@PrimaryKeyJoinColumn(name = "inq_id", referencedColumnName = "inq_id")
public class SQLDownload extends SQLQuery implements Download
{
	private static final long serialVersionUID = 99923842342l;
	private final static Logger log = Logger.getLogger(SQLDownload.class.getName());
	
	public SQLDownload()
	{
		dataType = InquiryType.TYPES.SQL_DOWNALOAD;
	}
	
	public SQLDownload(boolean generateUUID)
	{
		super(generateUUID);
		dataType = InquiryType.TYPES.SQL_DOWNALOAD;
	}
	
	@Override
	public DaqueryResponse run(DaqueryResponse response, DataModel model)
	{
		SQLDataSource ds = null;
		String errorMessage = null;
		if(model == null) errorMessage = "No data model found.";
		else if((ds = (SQLDataSource) model.getDataSource(SourceType.SQL)) == null) errorMessage = "No SQL data source found attached to model " + model.getName();
		
		if(errorMessage != null)
		{
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage(errorMessage);
			return(response);			
		}
		
		SQLDialect dialect = model.getDataSource(SourceType.SQL).getDialectEnum();
		String lclCode = getCode(dialect);
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		Session sess = null;
		DataExporter dataExporter = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			conn = ds.getConnection();
			if(StringHelper.isEmpty(lclCode))
			{
				response.setStatusEnum(ResponseStatus.ERROR);
				response.setErrorMessage("No query provided to gather case identifiers for download.");
				return(response);
			}
			
			if(this.isData())
				dataExporter = new CaseExporter(response, model.getExportConfig(), AppProperties.getDBProperty("output.path"));
			else
				dataExporter = new TableExporter(response, AppProperties.getDBProperty("output.path"));
			
			dataExporter.init(conn, st, rs, lclCode);

			int totalFiles = dataExporter.getNumFiles();
			int fileCount = 1;
			List<String> filenames = new ArrayList<String>();
			while(dataExporter.hasNextExport())
			{
				response.setStatusMessage("Exporting file " + fileCount + " of " + totalFiles + ".");
				Transaction t2 = sess.beginTransaction();
				sess.saveOrUpdate(response);
				t2.commit();
				String fn = dataExporter.exportNext();
				if(fn != null)
					filenames.add(fn);
				fileCount++;
			}
			dataExporter.writeTrackingFile();
			dataExporter.close();
			
			boolean deliverData = AppProperties.getDeliverData();
			
			EmailContents emailContents = new EmailContents();
			DaqueryRequest req = response.getRequest();
			String inqName = "";
			String dt = "";
			String siteName = "";
			String requesterEmail = null;
			DaqueryUser requester = null;
			if(req != null)
			{
				if(req.getRequester() != null && !StringHelper.isEmpty(req.getRequester().getEmail())) {
					requesterEmail = req.getRequester().getEmail();
					requester = DaqueryUserDAO.queryUserByEmail(requesterEmail);
				}
				if(req.getInquiry() != null && ! StringHelper.isEmpty(req.getInquiry().getInquiryName()))
					inqName = req.getInquiry().getInquiryName();
				if(req.getSentTimestamp() != null)
					dt = StringHelper.displayDateFormat(req.getSentTimestamp());
				if(req.getRequestSite() != null && ! StringHelper.isEmpty(req.getRequestSite().getName()))
					siteName = req.getRequestSite().getName();
			}
			
			String filePrefix = "";
			String emailEnd = "";
			String ft = " file";
			if(totalFiles > 1) ft += "s";
			int casesPerFile = dataExporter.getCasesPerFile();
			
			String networkName = "";
			String queryName = "";
			String requesterName = "";
			if (req.getNetwork() != null)
				networkName = req.getNetwork().getName();
			if (req.getInquiry() != null)
				queryName = req.getInquiry().getInquiryName();
			if (requester != null)
				requesterName = requester.getRealName();
			String emailHeader = EmailUtil.generateEmailHeader(networkName, siteName, queryName); 


			if(deliverData)
			{
				emailContents.subject = "Data Request Delivered";
				emailContents.message = emailHeader;
				emailContents.message += "The data that you requested has been uploaded to your Daquery server.<br \\><br \\>";
				response.setStatusEnum(ResponseStatus.COMPLETED);
				if (totalFiles > 1) {
					emailContents.message += "You requested data for more than " + casesPerFile + " cases.<br \\>" 
							+ "Therefore, your data request is split across " + totalFiles + ft + ".<br \\>"
							+ "Each file contains up to " + casesPerFile + " cases.<br \\>";
				}
				emailEnd = "<br \\>The following file(s) were delivered to your Daquery server " + req.getRequesterSite().getName() + " " + req.getRequestSite().getUrl() + ":<br \\>";
				response.setStatusMessage( (new Integer(totalFiles)).toString() + ft + " delivered");
			}
			else
			{
				Site mySite = SiteDAO.getLocalSite();
				emailContents.subject = "Data Request Delivered Locally";
				emailContents.message = emailHeader;
				emailContents.message += "The data that you requested has not been sent to your server.  It has been uploaded locally to the responding site's server.<br \\><br \\>";				
				response.setStatusEnum(ResponseStatus.COMPLETED);
				if (totalFiles > 1) {
					emailContents.message += "You requested data for more than " + casesPerFile + " cases.<br \\>" 
							+ "Therefore, your data request is split across " + totalFiles + ft + ".<br \\>"
							+ "Each file contains up to " + casesPerFile + " cases.<br \\>";
				}
				response.setStatusMessage( (new Integer(totalFiles)).toString() + ft + " delivered locally to " + mySite.getName());
				filePrefix = "locally@" + mySite.getName() + "://";
				emailEnd = "<br \\>The following file(s) were delivered <b>LOCALLY</b> to the responding site at " + mySite.getName() + ":<br \\>";
			}
			
			if(response.getFiles() == null) response.setFiles(new Fileset());
			if(response.getFiles().getFilepaths() == null) response.getFiles().setFilepaths(new HashSet<String>());
			for(String fName : filenames)
			{
				response.getFiles().getFilepaths().add(filePrefix + fName);
			}
			
			if(requesterEmail != null)
			{
				emailContents.toAddresses.add(requesterEmail);
				emailContents.message += emailEnd;
				for(String fName : filenames)
					emailContents.message += "&nbsp;&nbsp;&nbsp;&nbsp;" + filePrefix + fName + "<br //>";
				try{EmailUtil.sendEmail(emailContents);}
				catch(Throwable t)
				{
					if(t instanceof DaqueryErrorException)
					{
						DaqueryErrorException dee = (DaqueryErrorException) t;
						if(dee.getErrorInfo() != null)
						{
							log.log(Level.SEVERE, "\n\t" + dee.getErrorInfo().displayMessage + "\n\t" + dee.getErrorInfo().getLongMessage() + "\n\t" + dee.getErrorInfo().getStackTrace());
						}
					}
					log.log(Level.SEVERE, "Unable to send an email for request with id: " + req.getRequestId() + " because an error occurred.", t);
				}
			}
			else
				log.log(Level.SEVERE, "Unable to send an email for request with id: " + req.getRequestId() + " because the requester or requester's email was not set.");


			
			return(response);
		}
		catch (DaqueryException de)
		{
			log.log(Level.SEVERE, "Can't load the data export configuration", de);
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage("An applicatin error occured during file export.");
			response.setStackTrace(StringHelper.stackToString(de));
			return(response);			
		}
		catch (IOException ioe)
		{
			log.log(Level.SEVERE, "Can't load the data export configuration", ioe);
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage("A network or disk access error occured during file export.");
			response.setStackTrace(StringHelper.stackToString(ioe));
			return(response);
		}
		catch (Exception e) 
		{
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage(e.getMessage());
			return(response);
		}
		catch (Throwable e)
		{
			log.log(Level.SEVERE, "Unhandled error while exporting", e);
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage("An unhandled error occured during file export.  Check the server log files.");
			response.setStackTrace(StringHelper.stackToString(e));
			return(response);			
		}
		finally
		{
			if(sess != null) sess.close();
			try{if(rs != null) rs.close();}catch(SQLException ioe){}
			try{if(st != null) st.close();}catch(SQLException ioe){}
			try{if(conn != null) conn.close();}catch(SQLException ioe){}
			try{if(dataExporter != null) dataExporter.close();}catch(IOException ioe){}
		}
	}
}
