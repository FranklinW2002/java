package com.krakedev.persistecias.test;



import java.util.Date;

import com.krakedev.persistecias.entidades.EstadoCivil;
import com.krakedev.persistecias.entidades.Persona;
import com.krakedev.persistecias.servicios.AdminPersonas;
import com.krakedev.persistecias.utils.convertidor;

public class TestAdminPersona {

	public static void main(String[] args)  {
		EstadoCivil ec = new EstadoCivil("U","Union Libre");
		Persona p = new Persona("1231231230","Franklin","Muñoz",ec);
		try {
			Date fechaC = convertidor.convertidorfecha("2000/02/23");
			Date horaC = convertidor.convertidorHora("02:23:45"); 
			p.setFechaNacimiendo(fechaC);
			p.setHoraNacimiento(horaC);
			
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
			
		}
		
		
	}

}
