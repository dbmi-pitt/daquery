package edu.pitt.dbmi.daquery.common.util;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

//Java 8 import statement
//import java.util.Base64;
import javax.xml.bind.DatatypeConverter;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

public class PasswordUtils {

    // ======================================
    // =          Business methods          =
    // ======================================

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
    public static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public static String randomPassword() {
    	int length = 8;
    	Random random = new SecureRandom();
        random = Objects.requireNonNull(random);
        char [] symbols = chars.toCharArray();
        char [] buf = new char[length];
        for (int idx = 0; idx < buf.length; ++idx)
            buf[idx] = symbols[random.nextInt(symbols.length)];
        return new String(buf);
    }
}