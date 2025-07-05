package com.krakedev.persistecias.test;

import java.util.ArrayList;

import com.krakedev.persistecias.entidades.Persona;
import com.krakedev.persistecias.servicios.AdminPersonas;

public class TestConsultaPersonas {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorNombre("a");
			
			
			System.out.println(personas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
