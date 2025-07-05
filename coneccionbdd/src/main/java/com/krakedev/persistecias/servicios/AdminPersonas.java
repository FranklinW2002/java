package com.krakedev.persistecias.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistecias.entidades.Persona;
import com.krakedev.persistecias.utils.ConeccionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);;
	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps=null;

		LOGGER.trace("Persona  a insertar >>>"+persona);
			
		try {
			con = ConeccionBDD.conctar();
			ps=con.prepareStatement("insert into personas1(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorro,fecha_nacimiento,hora_nacimiento)"
					+ "	values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7,persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiendo().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate(); 
			
		} catch (Exception e) {
			
			LOGGER.error("Al insertar");
			throw new Exception("Error al insertar");
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura");
				throw new Exception("Error de infraestructura");
			}
		}
	}
	
	
	public static void actualizar(Persona p) throws Exception {
		String sql = "UPDATE personas1 SET nombre=?, apellido=?, estado_civil_codigo=?, numero_hijos=?,  estatura=? , cantidad_ahorro=?, fecha_nacimiento=?, hora_nacimiento=? WHERE cedula=?";
		Connection conecion = null;
		PreparedStatement stmt = null;

		try {
			conecion = ConeccionBDD.conctar();
			stmt = conecion.prepareStatement(sql);

			stmt.setString(1, p.getNombre());
			stmt.setString(2, p.getApellido());
			stmt.setString(3, p.getEstadoCivil().getCodigo());
			stmt.setInt(4, p.getNumeroHijos());
			stmt.setDouble(5, p.getEstatura());
			stmt.setBigDecimal(6, p.getCantidadAhorrada());
			stmt.setDate(7, new java.sql.Date(p.getFechaNacimiendo().getTime()));
			stmt.setTime(8, new java.sql.Time(p.getHoraNacimiento().getTime()));
			stmt.setString(9, p.getCedula());
			
			stmt.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("no se encomtro la persona con la cedula " + p.getCedula(), e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				conecion.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void eliminar (String cedula) throws Exception {
		String sql = "delete from  personas1 where cedula=?";
		Connection conecion = null;
		PreparedStatement stmt = null;
		
		
		try {
			conecion = ConeccionBDD.conctar();
			stmt = conecion.prepareStatement(sql);
			
			stmt.setString(1,cedula);
			
			stmt.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error en el eliminar", e);
			throw new Exception("Error en el eliminar");
		}
		
	}
	
	
	public static ArrayList<Persona> buscarPorNombre(String busqueda) throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		
		Connection conecion = null;
		PreparedStatement sp = null;
		ResultSet rs = null;
		try {
			conecion = ConeccionBDD.conctar();
			sp = conecion.prepareStatement("select *from personas1 where nombre like ?");
		    
			sp.setString(1, "%" + busqueda + "%");
		    
		    rs = sp.executeQuery();
		    
		    while(rs.next()) {
		    	String nombre = rs.getString("nombre");
		    	String cedula = rs.getString("cedula");
		    	Persona p = new Persona();
		    	p.setCedula(cedula);
		    	p.setNombre(nombre);
		    	personas.add(p);
		    }
		    
		} catch (Exception e) {
			LOGGER.error("Error con la base de datos",e);
			throw new Exception("Error con la base de datos");
		}finally {

			try {
				conecion.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura");
				throw new Exception("Error de infraestructura");
			}}
		
		return personas;
	}
	
	public static ArrayList<Persona> buscarPorApellido(String apellido) throws Exception{
		ArrayList<Persona> per = new ArrayList<Persona>();
		Connection conecion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conecion = ConeccionBDD.conctar();
			ps = conecion.prepareStatement("select * from personas where apellido like ? ");
			ps.setString(1,"%"+ apellido+"%");

			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula=rs.getString("cedula");
				Persona p=new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				per.add(p);
			}
			
		} catch (Exception e) {
			LOGGER.error("error al consultar por apellido", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			try {
				// cerrar la coneccion
				conecion.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return per;
	}

	public static ArrayList<Persona> buscarPorCedula(String cedula) throws Exception{
		
		ArrayList<Persona> per = new ArrayList<Persona>();
		Connection conecion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		

		try {
			conecion = ConeccionBDD.conctar();
			ps = conecion.prepareStatement("select * from personas where cedula = ? ");
			ps.setString(1,cedula);

			rs=ps.executeQuery();
			
			if(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedulaE=rs.getString("cedula");
				Persona p=new Persona();
				p.setCedula(cedulaE);
				p.setNombre(nombre);
				per.add(p);
			}	
		
			
		} catch (Exception e) {
			LOGGER.error("error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			try {
				// cerrar la coneccion
				conecion.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		return per;

	}
}
