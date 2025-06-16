package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1;
		Persona p2;
		p1 = new Persona();
		p2 = new Persona();
		
		p1.nombre = "Mario";
		p1.edad = 45;
		p1.estatura= 1.45;
				
		System.out.println("Nombre: " + p1.nombre );
		System.out.println("Edad: " + p1.edad );
		System.out.println("Estatura: " + p1.estatura);
		
		System.out.println("**************");
		
		p2.nombre = "Angelina";
		p2.edad = 25;
		p2.estatura= 1.55; 
		
		System.out.println("Nombre: " + p2.nombre );
		System.out.println("Edad: " + p2.edad );
		System.out.println("Estatura: " + p2.estatura);
		
	}

}
