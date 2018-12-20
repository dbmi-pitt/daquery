package edu.pitt.dbmi.daquery.common.util;

import java.security.Key;
import java.util.UUID;
import javax.crypto.spec.SecretKeySpec;


public class KeyGenerator {

    public static Key generateKey() {
    	String keyString = UUID.randomUUID().toString();
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
        return key;
    }
}
