package edu.pitt.dbmi.daquery.queue;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.ResponseStatus;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.dao.ResponseDAO;


public class ResponseTask extends AbstractTask implements Task
{
	private final static Logger log = Logger.getLogger(ResponseTask.class.getName());
	
	private DaqueryResponse response;
	private Inquiry inquiry;
	private DataModel model;
	
	
	
	public ResponseTask(DaqueryRequest request, UserInfo responder, DataModel dm) throws DaqueryException
	{
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

	@Override
	public void startup() {
		
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
		ResponseDAO.saveOrUpdate(response);
		
	}

	@Override
	public void shutdown() throws DaqueryException{
		// TODO Auto-generated method stub
		if(response.getStatusEnum() != ResponseStatus.DENIED && response.getStatusEnum() != ResponseStatus.ERROR)
			response.setStatusEnum(ResponseStatus.COMPLETED);
		ResponseDAO.saveOrUpdate(response);
	}
	
	public void errorState(Task.ErrorPeriod period, Throwable cause)
	{
		response.setStatusEnum(ResponseStatus.ERROR);
		log.log(Level.SEVERE, "Unexpected error while executing query for response with id: " + response.getResponseId(), cause);
		response.setErrorMessage("Unexpected error while executing.  Check executing site server logs for more information.");
		
		try{ResponseDAO.saveOrUpdate(response);}
		catch(Throwable t){log.log(Level.SEVERE, "Error while trying to save response error state or response with id: " + response.getResponseId(), t);}
	}	
}
