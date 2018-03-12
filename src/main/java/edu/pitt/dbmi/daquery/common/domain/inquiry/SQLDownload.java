package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.EmailContents;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.DataExporter;
import edu.pitt.dbmi.daquery.common.util.EmailUtil;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

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
	}
	
	@Override
	public DaqueryResponse run(DaqueryResponse response, DataModel model)
	{
		Session sess = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			String sql = this.getCode();
			if(StringHelper.isEmpty(sql))
			{
				response.setStatusEnum(ResponseStatus.ERROR);
				response.setErrorMessage("No query provided to gather case identifiers for download.");
				return(response);
			}

			//get the list of identifiers			
			List<String> pList = new ArrayList<String>();			
			try
			{
				sql = sql.trim();
				if(sql.endsWith(";"))
					sql = sql.substring(0, sql.length() - 1);
				org.hibernate.SQLQuery q = sess.createSQLQuery(sql);
				List<?> vals = q.list();
				for(Object val : vals)
				{
					if(val == null)
						continue;

					if(val instanceof String)
						pList.add((String) val);
					else
					{
						response.setStatusEnum(ResponseStatus.ERROR);
						response.setErrorMessage("An invalid case identifier " + val.toString() + " of type " + val.getClass().getName() + " was found.");
						return(response);
					}
				}
			}
			catch(Throwable t)
			{
				response.setStatusEnum(ResponseStatus.ERROR);
				response.setErrorMessage("Unexpected error while gathering case ids.");
				response.setStackTrace(StringHelper.stackToString(t));
				return(response);
			}

			Network net = response.getRequest().getNetwork();
			DataExporter dataExporter = new DataExporter(response.getRequest(), model.getExportConfig(), AppProperties.getDBProperty("output.path"), pList);
			int totalFiles = dataExporter.getNumFiles();
			int fileCount = 1;
			while(dataExporter.hasNextExport())
			{
				response.setStatus("Exporting file " + fileCount + " of " + totalFiles + ".");
				Transaction t2 = sess.beginTransaction();
				sess.saveOrUpdate(response);
				t2.commit();
				dataExporter.exportNext();
				fileCount++;
			}
			
			boolean deliverData = AppProperties.getDeliverData();
			
			EmailContents emailContents = new EmailContents();
			DaqueryRequest req = response.getRequest();
			String inqName = "";
			String dt = "";
			String siteName = "";
			String requesterEmail = null;
			if(req != null)
			{
				if(req.getRequester() != null && !StringHelper.isEmpty(req.getRequester().getEmail()))
					requesterEmail = req.getRequester().getEmail();
				if(req.getInquiry() != null && ! StringHelper.isEmpty(req.getInquiry().getInquiryName()))
					inqName = req.getInquiry().getInquiryName();
				if(req.getSentTimestamp() != null)
					dt = StringHelper.formatDate(req.getSentTimestamp());
				if(req.getRequestSite() != null && ! StringHelper.isEmpty(req.getRequestSite().getName()))
					siteName = req.getRequestSite().getName();
			}
			
			if(deliverData)
			{
				emailContents.subject = "Data Request Delivered";
				emailContents.message = "The data that you requested has been uploaded to your Daquery server.<br \\><br \\>";
				response.setStatusEnum(ResponseStatus.COMPLETED);
			}
			else
			{
				emailContents.subject = "Data Request Delivered Locally";
				emailContents.message = "The data that you requested has not been sent to your server.  It has been uploaded locally to the responding site's server.<br \\><br \\>";				
				response.setStatusEnum(ResponseStatus.COMPLETED_LOCAL);
			}
			if(requesterEmail != null)
			{
				emailContents.message += "&nbsp;&nbsp;&nbsp;&nbsp;<b>Delivered From:</b>" + siteName;
				emailContents.message += "&nbsp;&nbsp;&nbsp;&nbsp;<b>Requested Date:</b>" + dt;
				emailContents.message += "&nbsp;&nbsp;&nbsp;&nbsp;<b>Query Name:</b>" + inqName;
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
		catch (Throwable e)
		{
			log.log(Level.SEVERE, "Unhandled error while exporting", e);
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage("An unhandled error occured during file export.");
			response.setStackTrace(StringHelper.stackToString(e));
			return(response);			
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
}
