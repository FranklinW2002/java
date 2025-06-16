package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		calcu = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		
		resultadoSuma = calcu.sumar(5,3);
		
		System.out.println("Resultado: " + resultadoSuma);
		
		resultadoResta = calcu.restar(10,3);
		
		System.out.println("Resultado: " + resultadoResta);

	}

}
