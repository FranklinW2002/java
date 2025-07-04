package com.krakedev.persistecias.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistecias.entidades.Videojuegos;
import com.krakedev.persistecias.utils.ConeccionBDD;

public class TestVideojuegos {
	private static final Logger LOGGER = LogManager.getLogger(TestVideojuegos.class);

	public static void insertar(Videojuegos videojuego) throws Exception {
		Connection conecion = null;
		PreparedStatement ps = null;
		LOGGER.trace("videojuego a insertar>>>> " + videojuego);
		// abrir la conexion
		try {
			conecion = ConeccionBDD.conctar();

			ps = conecion.prepareStatement(
					"insert into videojuegos(idP,codigo,nombre,valoracion)"
							+ "			values(?,?,?,?)");
			ps.setInt(1, videojuego.getPlataforma().getId_plataforma());
			ps.setInt(2, videojuego.getCodigo());
			ps.setString(3, videojuego.getNombre());
			ps.setInt(4, videojuego.getValiracion());

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				// cerrar la coneccion
				conecion.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Videojuegos v) throws Exception {
		String sql = "UPDATE videojuegos SET idP=?, nombre=?, valoracion=? WHERE codigo=?";
		Connection conecion = null;
		PreparedStatement stmt = null;

		try {
			conecion = ConeccionBDD.conctar();
			stmt = conecion.prepareStatement(sql);
			
			stmt.setInt(1, v.getPlataforma().getId_plataforma());
			stmt.setString(2, v.getNombre());
			stmt.setInt(3, v.getValiracion());
			stmt.setInt(4, v.getCodigo());

			
			
			stmt.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("no se encomtro la un videojuego con este codigo " + v.getCodigo(), e);
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
	public static void eliminar (int codigo) throws Exception {
		String sql = "delete from  videojuegos where codigo=?";
		Connection conecion = null;
		PreparedStatement stmt = null;
		
		
		try {
			conecion = ConeccionBDD.conctar();
			stmt = conecion.prepareStatement(sql);
			
			stmt.setInt(1,codigo);
			
			stmt.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error en el eliminar", e);
			throw new Exception("Error en el eliminar");
		}
		
	}
}
