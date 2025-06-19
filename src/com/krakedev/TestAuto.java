package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		
		Auto auto1;
		Auto auto2;
		
		auto1 = new Auto("Audi r8",2025,28000);
		auto2 = new Auto("La ferrari",2025,60000);
		
		/*auto1.setNombre("Audi r8");
		auto1.setAnio(2025);
		auto1.setPrecio(28000);*/
		
		/*auto2.setNombre("La ferrari");
		auto2.setAnio(2025);
		auto2.setPrecio(60000);*/
		
		System.out.println("Nombre: " + auto1.getNombre());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		
		System.out.println("*************");
		
		System.out.println("Nombre: " + auto2.getNombre());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}

}
