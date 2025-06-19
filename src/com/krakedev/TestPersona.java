package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		
		
		p1.setNombre("Mario");
		p1.setEdad(45);
		p1.setEstatura(1.45);
				
		System.out.println("Nombre: " + p1.getNombre() );
		System.out.println("Edad: " + p1.getEdad());
		System.out.println("Estatura: " + p1.getEstatura());
		
		System.out.println("**************");
		
		p2.setNombre("Angelina");
		p2.setEdad(25);
		p2.setEstatura(1.55); 
		
		System.out.println("Nombre: " + p2.getNombre() );
		System.out.println("Edad: " + p2.getEdad() );
		System.out.println("Estatura: " + p2.getEstatura());

	}

}
