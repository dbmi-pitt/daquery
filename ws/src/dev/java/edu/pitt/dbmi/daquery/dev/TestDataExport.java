package edu.pitt.dbmi.daquery.dev;

import java.util.Date;
import java.util.HashSet;

import edu.pitt.dbmi.daquery.common.dao.ResponseDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.InquiryType;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDownload;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.queue.QueueManager;
import edu.pitt.dbmi.daquery.queue.ResponseTask;
import edu.pitt.dbmi.daquery.queue.TaskQueue;
import edu.pitt.dbmi.daquery.rest.DaqueryEndpoint;

public class TestDataExport
{
	public static void main(String [] args) throws Exception
	{
		AppProperties.setDevHomeDir("/home/devuser/daquery-data");
		
		DaqueryResponse aggResponse = ResponseDAO.getResponseById("e03d5c39-7a89-410e-bdcb-ec937122b7d0");
		if(aggResponse.isDownloadAvailable())
		{
			DaqueryRequest aggReq = aggResponse.getRequest();

			Inquiry inq = aggResponse.getDownloadDirective();
			inq.setAggregate(false);
			inq.setAuthor((DaqueryUser) aggReq.getRequester());
			inq.setInquiryDescription(aggReq.getInquiry().getInquiryDescription() + " [DOWNLOAD]");
			inq.setInquiryName(aggReq.getInquiry().getInquiryName());
			inq.setNetwork(aggReq.getNetwork());
			
			DaqueryRequest req = new DaqueryRequest();
			req.setDirection(aggReq.getDirection());
			req.setInquiry(inq);
			req.setNetwork(aggReq.getNetwork());
			req.setRequester(aggReq.getRequester());
			req.setRequestGroup(aggReq.getRequestGroup());
			req.setRequestSite(aggReq.getRequestSite());
			req.setSentTimestamp(new Date());

			HashSet<DaqueryRequest> rqsts = new HashSet<DaqueryRequest>();
			rqsts.add(req);
			inq.setRequests(rqsts);
			
			TaskQueue queue = QueueManager.getNamedQueue(DaqueryEndpoint.EXPORT_QUEUE);
			ResponseTask task = new ResponseTask(req, DaqueryUserDAO.getSysUser(), req.getNetwork().getDataModel());
			queue.addTask(task);
		}
	}
}
