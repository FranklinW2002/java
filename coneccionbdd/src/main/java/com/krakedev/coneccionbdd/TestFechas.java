package com.krakedev.coneccionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss"); 
		String fecha = "2002/05/22 10:05:04" ;
		try {
			Date fechaD= sf.parse(fecha);
			System.out.println(fechaD);
			long fechamli = fechaD.getTime();
			System.out.println(fechamli);
			
			java.sql.Date fechaSQL = new java.sql.Date(fechamli);
			
			System.out.println(fechaSQL);
			
			
			Time t = new Time(fechamli);
			
			System.out.println(t);
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

}
