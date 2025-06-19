package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		int area1;
		int area2;
		double perimetro1;
		double perimetro2;
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(3);
		
		area1 = r1.calcularArea();
		area2 = r2.calcularArea();
		perimetro1 = r1.calcularPerimetro();
		perimetro2 = r2.calcularPerimetro();
		
		System.out.println("Area 1:" + area1);
		System.out.println("Perimetro 1:" + perimetro1);
		System.out.println("Area 2:" + area2);
		System.out.println("Perimetro 2:" + perimetro2);
	}

}
