package edu.pitt.dbmi.daquery.dev;

import java.util.Calendar;
import java.util.Date;

import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTTest
{
	public static void main(String [] args) throws Exception
	{
		long t=Calendar.getInstance().getTimeInMillis();
        Date fifteenMinuteExpiry = new Date(t + (15 * 60000));
        String jwtToken = Jwts.builder()
                .setSubject("41050780-5a8a-4a24-af00-f635cb9d90e1")
                .setIssuer("20b23b5c-61ad-44eb-8eef-886adcced18e")
                .setIssuedAt(new Date())
                .setExpiration(fifteenMinuteExpiry)
                .signWith(SignatureAlgorithm.HS512, "Secret".getBytes("UTF-8"))
                .compact();		
		
		Jws<Claims> claims = Jwts.parser().setSigningKey("Secret".getBytes("UTF-8"))
		.parseClaimsJws(jwtToken);
		System.out.println("NAME: " + claims.getBody().getSubject());
		System.out.println("ISSUER: " + claims.getBody().getIssuer());		
	}
}
