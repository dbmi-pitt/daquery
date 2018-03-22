package edu.pitt.dbmi.daquery.dev;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.EncryptionType;

public class TEncType {

	public static void main(String [] args)
	{
		TEncType tet = new TEncType();
		tet.setEncType(EncryptionType.PRIVATE_PUBLIC);
		System.out.println(tet.type);
		EncryptionType et = tet.getEncType();
		System.out.println(et);
		
	}
	
	@Expose
	private String type;
	
	void setEncType(EncryptionType type)
	{
		this.type = type.toString();
	}
	EncryptionType getEncType()
	{
		return(EncryptionType.valueOf(type));
	}
	
	
}
