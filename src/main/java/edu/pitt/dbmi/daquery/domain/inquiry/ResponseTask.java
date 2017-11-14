package edu.pitt.dbmi.daquery.domain.inquiry;

import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.dao.ResponseDAO;
import edu.pitt.dbmi.daquery.domain.DataModel;
import edu.pitt.dbmi.daquery.domain.UserInfo;
import edu.pitt.dbmi.daquery.queue.AbstractTask;
import edu.pitt.dbmi.daquery.queue.Task;

public class ResponseTask extends AbstractTask implements Task
{
	private DaqueryResponse response;
	private Inquiry inquiry;
	private DaqueryRequest request;
	private DataModel model;
	
	public ResponseTask(DaqueryRequest request, UserInfo responder, DataModel dm) throws DaqueryException
	{
		this.request = request;
		this.inquiry = request.getInquiry();
		response = new DaqueryResponse(true);
		this.setQueueId(response.getResponseId());
		this.model = dm;
		response.setRequest(request);
		response.setResponder(responder);
		//response.setSite(getMySite());
		response.setStatusEnum(ResponseStatus.QUEUED);
		ResponseDAO.saveOrUpdate(response);
	}
	
	@Override
	public String getQueueId() {
		return(response.getResponseId());
	}

	public DaqueryResponse getResponse(){return(response);}
/*
	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isQueued() {
		// TODO Auto-generated method stub
		return false;
	} */

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getProgress() {
		return -1;
	}
	
	@Override
	public void execute() throws DaqueryException {
		response.setStatusEnum(ResponseStatus.EXECUTING);
		ResponseDAO.saveOrUpdate(response);
		response = inquiry.run(response, model);
		
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		if(response.getStatusEnum() != ResponseStatus.DENIED && response.getStatusEnum() != ResponseStatus.ERROR)
			response.setStatusEnum(ResponseStatus.COMPLETED);
	}
}
