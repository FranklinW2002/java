package com.krakedev.persistecias.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistecias.entidades.EstadoCivil;
import com.krakedev.persistecias.entidades.Persona;
import com.krakedev.persistecias.servicios.AdminPersonas;
import com.krakedev.persistecias.utils.convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		
				EstadoCivil cv = new EstadoCivil("U", "union libre");
				Persona p = new Persona("1727259720", "Hola", "Rodriguez  ", cv);
				try {
					Date fechaC = convertidor.convertidorfecha("2000/02/23");
					Date horaC = convertidor.convertidorHora("02:23:45");
					p.setFechaNacimiendo(fechaC);
					p.setHoraNacimiento(horaC);
					p.setCantidadAhorrada(new BigDecimal(1200.45));
					p.setNumeroHijos(50);
					AdminPersonas.actualizar(p);
				} catch (Exception e) {
					System.out.println("error en el sisitema: "+e.getMessage());
				}
				
			
		

	}

}
