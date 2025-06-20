package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante();
		Estudiante estudiante2 = new Estudiante();
		
		estudiante1.setNombre("Mateo");
		estudiante1.calificar(7.5);

		estudiante2.setNombre("Franklin");
		estudiante2.calificar(9.0);
		
	}

}
