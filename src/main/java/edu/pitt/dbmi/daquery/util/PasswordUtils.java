package edu.pitt.dbmi.daquery.util;

import java.security.MessageDigest;
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
}