package edu.pitt.dbmi.daquery.common.util;

import java.security.SecureRandom;
import java.util.Random;

import edu.pitt.dbmi.daquery.common.domain.Network;

public class RngHelper
{
	private static final Random rng = new SecureRandom();
	
	public static void main(String [] args)
	{
		Network net = new Network();
		net.setAggregateObfuscateType("percentage");
		System.out.println(obfuscateAggregateResult(100L, net));
	}
	
	public static int nextIntInRange(int min, int max)
	{
		int lMin;
		int lMax;
		
		//Check to make sure the min and max were passed in correctly
		if(min > max)
		{
			lMin = max;
			lMax = min;
		}
		else
		{
			lMin = min;
			lMax = max;
		}
		
		return rng.nextInt((lMax - lMin) + 1) + lMin;
		
	}

	public static float nextFloatInRange(float min, float max)
	{
		float lMin;
		float lMax;
		
		//Check to make sure the min and max were passed in correctly
		if(min > max)
		{
			lMin = max;
			lMax = min;
		}
		else
		{
			lMin = min;
			lMax = max;
		}
		
		return nextFloat(lMax - lMin) + lMin;
		
	}
	
	public static float nextFloat(float max)
	{
		float rn = rng.nextFloat();
		return(max * rn);
	}
	
	public static Long obfuscateAggregateResult(Long val, Network net)
	{
		Long rval = val;
		if(net.getObfuscateAggregateResults())
		{
			if(val.longValue() <= ((long) net.getAggregateObfuscateThreshold().intValue()))
				return(new Long(0));
			if(net.getAggregateObfuscateType().toUpperCase().equals("RANGE"))
			{
				int range = net.getAggregateObfuscateRange();
				int obf = nextIntInRange(range * -1, range);
				rval = val + obf;
			}
			else
			{
				float maxPrct = net.getAggregateObfuscatePercent();
				float obfPrct = nextFloatInRange(maxPrct * -1f, maxPrct);
				rval = val + (int) Math.round(val * obfPrct);
			}
		}
		return(rval);
		
	}
}
