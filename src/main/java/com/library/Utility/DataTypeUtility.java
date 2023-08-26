package com.library.Utility;

import com.library.AllConstant.Constant;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
        if (value != null)
            {
                if((value.equals("") || value == "" || value.toString().equalsIgnoreCase("undefined") || value.toString().equalsIgnoreCase("null"))){
                    return "";
                }
            }else{
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
    
    public static String getCurrentDateInIndianFormat() {
    	Date d = new Date();
    	return new SimpleDateFormat(Constant.INDIAN_DATE_FORMAT.getValue()).format(d);
    }
    
    public static String getCurrentDateTimeInIndianFormat() {
    	Date d = new Date();
    	return new SimpleDateFormat(Constant.INDIAN_DATE_FORMAT_WITH_TIME.getValue()).format(d);
    }
    
    public static String getCurrentDateTimeInSQLFormat() {
    	Date d = new Date();
    	return new SimpleDateFormat(Constant.SQL_FORMAT_DATE_TIME.getValue()).format(d);
    }

    public static String getCurrentDateTimeInUSFormatWithTime() {
        Date d = new Date();
        return new SimpleDateFormat(Constant.US_DATE_FORMAT_WITH_TIME.getValue()).format(d);
    }
    
    public static String getCurrentDateInSQLFormat() {
    	Date d = new Date();
    	return new SimpleDateFormat(Constant.SQL_FORMAT_DATE.getValue()).format(d);
    }

    public static Date getCurrentDateTimeInSQLFormatOfDateType(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constant.SQL_FORMAT_DATE_TIME.getValue());
        String formattedDateTime = currentDateTime.format(formatter);
        Date date = null;
        try {
            date = new SimpleDateFormat(Constant.SQL_FORMAT_DATE_TIME.getValue()).parse(formattedDateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date getIndianDateFormat(String d){
        Date date = null;
        try{
        date = new SimpleDateFormat(Constant.INDIAN_DATE_FORMAT.getValue()).parse(d);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return date;
    }

    public static Date getSQLDateFormat(String d){
        Date date = null;
        try{
            date = new SimpleDateFormat(Constant.SQL_FORMAT_DATE.getValue()).parse(d);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return date;
    }
}
