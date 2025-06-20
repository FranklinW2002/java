package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		calcu = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadoMulti;
		double resultadoDiv;
		double promedio;
		
		resultadoSuma = calcu.sumar(5,3);
		
		System.out.println("Resultado: " + resultadoSuma);
		
		resultadoResta = calcu.restar(10,3);
		
		System.out.println("Resultado: " + resultadoResta);
		
		resultadoMulti = calcu.mutiplicar(2.5, 3.8);
		
		System.out.println("Resultado: " + resultadoMulti);
		
		resultadoDiv = calcu.dividir(9.5, 2.2);
		
		System.out.println("Resultado: " + resultadoDiv);
		
		promedio = calcu.promediar(9, 8.5, 7.5);
		
		System.out.println("Resultado: " + promedio);
		
		calcu.mostraResulado();
		
	}
}
