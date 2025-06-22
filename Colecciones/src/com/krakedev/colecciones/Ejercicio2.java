package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		
		
		personas.add(new Persona("Franklin", "Munoz"));
		personas.add(new Persona("Mateo", "Lema"));
		personas.add(new Persona("Jenny", "Lema"));
		
		System.out.println(personas.size());
		Persona elementoPersona;
		
		for(int i = 0; i < personas.size();i++) {
			elementoPersona = personas.get(i);
			
			System.out.println(elementoPersona.getNombre() + " " + elementoPersona.getApellido());
		}
	}

}
