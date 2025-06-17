package com.krakedev;

public class Cuadrado {
	
	public int lado;
	
	public int calcularArea() {
		int area;
		area = lado*lado;
		return area;
	}
	
	public int calcularPerimetro() {
		int perimetro;
		perimetro = lado*4;
		return perimetro;
	}
}
