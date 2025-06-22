package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		
		admin.agrgar(new Persona("Franklin", "Lema",23));
		admin.agrgar(new Persona("Mario", "Pacheco",35));
		admin.agrgar(new Persona("Mateo", "Cumbal",12));
		
		admin.imprimir();
		
		Persona p1 = admin.buscarPorNombre("jose");
		if(p1!=null) {
			System.out.println("Encontrado: " + p1.getApellido() + " " + p1.getEdad());
		}else {
			System.out.println("No existe la persona con el nombre ");
		}
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(30);
		
		System.out.println("Mayores: " + personasMayores.size());
	}
	
	

}
