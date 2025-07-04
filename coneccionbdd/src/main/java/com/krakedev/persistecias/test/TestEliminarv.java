package com.krakedev.persistecias.test;

import com.krakedev.persistecias.servicios.TestVideojuegos;

public class TestEliminarv {
	public static void main(String[] args) {
		try {
			TestVideojuegos.eliminar(22222);
		} catch (Exception e) {
			System.out.println("error en el sisitema: "+e.getMessage());
		};
	}
}
