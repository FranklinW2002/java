package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Direccion dir = new Direccion();
		
		dir.setCallePrincipal("Avn.Inca");
		dir.setCalleSecundaria("joaquin sumaita");
		dir.setNumero("No=05");
		p1.setDireccion(dir);
		
		p1.setNombre("Franklin");
		p1.setApellido("Lema");
		
		
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		
		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());
		
		p1.imprimir();
		
		Persona p2 = new Persona();
		Direccion d2 = new Direccion("Av.Inca","Joaquin Sumaita","No-05");
		p2.setNombre("Joel");
		p1.setDireccion(d2);
		p2.imprimir();
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("xx","yy","05"));
		p3.imprimir();
	}

}
