package edu.pitt.dbmi.daquery.common.util;

import java.security.Key;

import javax.crypto.spec.SecretKeySpec;


public class KeyGenerator {

	//TODO: improve the keyString, make it stronger or base it off a 
	//database setting
    public static Key generateKey() {
        String keyString = "simplekey";
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
        return key;
    }
}
