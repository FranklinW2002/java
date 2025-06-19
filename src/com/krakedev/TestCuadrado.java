package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado(10);
		Cuadrado c2 = new Cuadrado(5);
		Cuadrado c3 = new Cuadrado(6);
		
		int area1;
		int area2;
		int area3;
		int perimetro1;
		int perimetro2;
		int perimetro3;
		
		/*c1.setLado(10);;
		c2.setLado(5);
		c3.setLado(6);*/
		
		perimetro1 = c1.calcularPerimetro();
		perimetro2 = c2.calcularPerimetro();
		perimetro3 = c3.calcularPerimetro();
		
		area1 = c1.calcularArea();
		area2 = c2.calcularArea();
		area3 = c3.calcularArea();
		
		System.out.println("Perimetro 1: " + perimetro1);
		System.out.println("Perimetro 2: " + perimetro2);
		System.out.println("Perimetro 3: " + perimetro3);
		System.out.println("Area 1: " + area1);
		System.out.println("Area 1: " + area2);
		System.out.println("Area 1: " + area3);
	}	
}
