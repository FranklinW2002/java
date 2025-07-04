package com.krakedev.coneccionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement ps;
		try {
			
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Puko@2002");
			System.out.println("coneccion exitosa");
			
			ps = connection.prepareStatement("insert into personas (cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)" + 
					"values (?,?,?,?,?,?,?,?)");
			ps.setString(1, "0123456789");
			ps.setString(2, "Franklin");
			ps.setString(3, "Muñoz");
			ps.setDouble(4, 1.75);
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss"); 
			String fechaStr = "2002/05/29 10:05:04" ;
			try {
				Date fechaD= sdf.parse(fechaStr);
				long fechamili = fechaD.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechamili);
				Time timeSQl = new Time(fechamili);
				ps.setDate(5,fechaSQL);
				ps.setTime(6, timeSQl);
			} catch (ParseException e) {

				e.printStackTrace();
			}
			ps.setBigDecimal(7, new BigDecimal (100.25));
			ps.setInt(8, 0);
			ps.executeUpdate();
			System.out.println("ejecuta insert1");
			
			
			ps = connection.prepareStatement("insert into prestamo (cedula, nonto, fecha_prestamo, hora_prestamo, gerente)" + 
					"values (?,?,?,?,?)");
			ps.setString(1, "0123456789");
			ps.setBigDecimal(2, new BigDecimal(1000.50));
			
			try {
				fechaStr = "2025/07/04 10:35:04" ;
				Date fechaD= sdf.parse(fechaStr);
				long fechamili = fechaD.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechamili);
				Time timeSQl = new Time(fechamili);
				ps.setDate(3,fechaSQL);
				ps.setTime(4, timeSQl);
			} catch (ParseException e) {

				e.printStackTrace();
			}
			
			ps.setString(5, "Mateo Muñoz");
			ps.executeUpdate();
			System.out.println("ejecuta insert2");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			
		}
		

	}

}
