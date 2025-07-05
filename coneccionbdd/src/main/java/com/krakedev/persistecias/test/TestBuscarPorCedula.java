package com.krakedev.persistecias.test;

import java.util.ArrayList;

import com.krakedev.persistecias.entidades.Persona;
import com.krakedev.persistecias.servicios.AdminPersonas;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		
		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorCedula("1234567890");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
