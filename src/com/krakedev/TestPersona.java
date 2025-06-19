package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		Persona p3 = new Persona("Joel");
		Persona p4 = new Persona("Andres",22,1.75);
		
		
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

		System.out.println("**************");
		
		System.out.println("Nombre: " + p3.getNombre() );
		System.out.println("Edad: " + p3.getEdad() );
		System.out.println("Estatura: " + p3.getEstatura());
		
		System.out.println("**************");
		
		System.out.println("Nombre: " + p4.getNombre() );
		System.out.println("Edad: " + p4.getEdad() );
		System.out.println("Estatura: " + p4.getEstatura());
		
	}

}
