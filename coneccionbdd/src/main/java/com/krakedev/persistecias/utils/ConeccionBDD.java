package com.krakedev.persistecias.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConeccionBDD {
	
	
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USER = "postgres";
	private static final String PASSWORD = "Puko@2002";
	
	private static final Logger LOGGER = LogManager.getLogger(ConeccionBDD.class);;
	
	public static Connection conctar() throws Exception {
		
		Connection connection=null;
		try {
			Class.forName(DRIVER);
			connection=DriverManager.getConnection(URL,USER,PASSWORD);
			LOGGER.debug("CONECCION EXITOSA");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error de infraestractura",e );
			e.printStackTrace();
			e.printStackTrace();
			throw new Exception("Error de infraestractura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse, revise USSER y PASSWORD",e );
			e.printStackTrace();
			e.printStackTrace();
			throw new Exception("Error al conectarse, revise USSER y PASSWORD");
		}
			
		
		return connection;
	}
}
