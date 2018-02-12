package edu.pitt.dbmi.daquery.update;

import java.util.List;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.domain.Network;

public class CDM31
{
	public static void main(String args)
	{
		List<Network> nets = NetworkDAO.getAllNetworks();
		Network net = nets.get(0);
		
	}
	private static void updateSchema()
	{
		
	}
}
