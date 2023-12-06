package com.jsp.hms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverToDate {
	
	public static Date getDate(String sDate) {
		SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {
			date = d.parse(sDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date ;
	}

}
