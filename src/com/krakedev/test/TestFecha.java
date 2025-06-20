package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha();
		fecha1.setAnio(2025);
		fecha1.setDia(28);
		fecha1.setMes(6);

			System.out.println(fecha1.getAnio() + " " +fecha1.getMes() + " " + fecha1.getDia());
	} 

}
