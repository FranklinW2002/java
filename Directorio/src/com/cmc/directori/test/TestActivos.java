package com.cmc.directori.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		AdminContactos admin = new AdminContactos();
		
		Telefono telf1 = new Telefono(10,"movi","0987562658");
		Contacto c1 = new Contacto("Lema", telf1, 54.5);
		
		System.out.println(c1.isActivo());
		
		admin.activarUsuario(c1);
		
		System.out.println(c1.isActivo());
	}

}
