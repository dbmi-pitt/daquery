package edu.pitt.dbmi.daquery.common.util;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;
import javax.xml.bind.DatatypeConverter;


public class PasswordUtils {

	public static void main(String [] args)
	{
		for(int i = 0; i < 100; i++)
			System.out.println(randomPassword());
	}
    public static String digestPassword(String plainTextPassword) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(plainTextPassword.getBytes("UTF-8"));
            byte[] passwordDigest = md.digest();
            //Java 8 line: return new String(Base64.getEncoder().encode(passwordDigest));
            return new String(DatatypeConverter.printBase64Binary(passwordDigest));
        } catch (Exception e) {
            throw new RuntimeException("Exception encoding password", e);
        }
    }
    public static final String validPwdCharsStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$#%^*&!";
    public static String randomPassword() {
    	int length = 8;
    	Random rng = new SecureRandom();
        rng = Objects.requireNonNull(rng);
        char [] validPwdChars = validPwdCharsStr.toCharArray();
        char [] tempPwdBuffer = new char[length];
        for (int idx = 0; idx < tempPwdBuffer.length; ++idx)
            tempPwdBuffer[idx] = validPwdChars[rng.nextInt(validPwdChars.length)];
        return new String(tempPwdBuffer);
    }
}