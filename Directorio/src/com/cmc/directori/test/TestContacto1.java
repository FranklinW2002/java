package com.cmc.directori.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono(10,"movi","0987562658");
		Contacto c = new Contacto("Lema", telf, 54.5);
		
		System.out.println("***Contacto***");
		System.out.println("Apellido:" + c.getApellido());
		System.out.println("Peso:" + c.getPeso());
		System.out.println("Operadora:" + telf.getOperadora());
		System.out.println("Numero:" + telf.getNumero());
	}

}
