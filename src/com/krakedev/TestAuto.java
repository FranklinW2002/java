package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		
		Auto auto1;
		Auto auto2;
		
		auto1 = new Auto();
		auto2 = new Auto();
		
		auto1.nombre = "Audi r8";
		auto1.anio = 2025;
		auto1.precio = 28000;
		
		auto2.nombre = "La ferrari";
		auto2.anio = 2025;
		auto2.precio = 60000;
		
		System.out.println("Nombre: " + auto1.nombre);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		
		System.out.println("*************");
		
		System.out.println("Nombre: " + auto2.nombre);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}

}
