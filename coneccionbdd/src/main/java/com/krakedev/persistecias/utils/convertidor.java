package com.krakedev.persistecias.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class convertidor {
	private final static String FORMATO_FECHA = "yyyy/MM/dd";
	private final static String FORMATO_HORA = "hh:mm:ss";
	private static final Logger LOGGER = LogManager.getLogger(convertidor.class); 

	public static Date convertidorfecha(String fechaS) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaD = null;
		try {
			LOGGER.trace("Convirtiendo la feehca "+fechaS);
			fechaD = sf.parse(fechaS);
			LOGGER.trace("fecha convertida "+fechaD);
		} catch (ParseException e) {
			LOGGER.error("la fecha no tiene un formato correcto "+fechaS,e);
			throw new Exception("la fecha no tiene un formato correcto "+fechaS);
		}
		return fechaD;
	}
	
	public static Date convertidorHora(String hora) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat(FORMATO_HORA);
		Date horaD = null;
		try {
			horaD = sf.parse(hora);
		} catch (ParseException e) {
			LOGGER.error("la hora no tiene un formato correcto "+hora,e);
			throw new Exception("la hora no tiene un formato correcto "+hora);
		}
		return horaD;
	}
}
