package com.cmc.directori.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono(10,"movi","0987562658");
		Contacto c1 = new Contacto("Lema", telf1, 74.5);
		
		Telefono telf2 = new Telefono(11,"claro","0986562658");
		Contacto c2 = new Contacto("Pacheco", telf2, 60.5);
		
		AdminContactos admin = new AdminContactos();
		
		Contacto c = admin.buscarMasPesado(c1, c2);
		Telefono telf = c.getTelefono();

		System.out.println("***Contacto***");
		System.out.println("Apellido:" + c.getApellido());
		System.out.println("Peso:" + c.getPeso());
		System.out.println("Operadora:" + telf.getOperadora());
		System.out.println("Numero:" + telf.getNumero());
		System.out.println("******************");
		
		boolean comparar = admin.compararOperadoras(c1, c2);
		
		System.out.println(comparar);

	}

}
