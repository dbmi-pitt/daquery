package edu.pitt.dbmi.daquery.common.domain.inquiry;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import edu.pitt.dbmi.daquery.common.domain.DataModel;

@Entity
@Table(name = "SQL_DOWNLOAD")
@DiscriminatorValue(value = InquiryType.TYPES.SQL_DOWNALOAD)
@PrimaryKeyJoinColumn(name = "inq_id", referencedColumnName = "inq_id")
public class SQLDownload extends SQLQuery implements Download
{
	private static final long serialVersionUID = 99923842342l;
	
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
		return null;
	}
}
