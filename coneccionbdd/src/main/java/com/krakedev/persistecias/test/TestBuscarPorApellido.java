package com.krakedev.persistecias.test;

import java.util.ArrayList;

import com.krakedev.persistecias.entidades.Persona;
import com.krakedev.persistecias.servicios.AdminPersonas;

public class TestBuscarPorApellido {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorApellido("o");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}


