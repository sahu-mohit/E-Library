package com.library.Utility;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DataTypeUtility {

    public static String getEncryption(String input)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String stringvlue(Object value) {
        if ((value.equals("") || value == "" || value == null || value.toString().equalsIgnoreCase("undefined") || value.toString().equalsIgnoreCase("null"))) {
            return "";
        }
        return (value.toString()).trim();
    }
    public static Long longvalue(Object value) {
        if(value instanceof String){
            String stringvalue = value.toString();
        }
        if ((value.equals("") || value == "" ||value == "0" || value == null || value.toString().equalsIgnoreCase("undefined") || value.toString().equalsIgnoreCase("null"))) {
            return 0l;
        }
        return (long)(int)(Integer)value;
    }

    public static Boolean booleanvalue(Object value){
        if(!(value.toString().equals("") || value == null || value.toString().equalsIgnoreCase("null") || !(Boolean)value)){
            return true;
        }else{
            return false;
        }
    }
}
