package com.cmc.directori.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono(20,"movi","098234234");
		
		AdminTelefono admin = new AdminTelefono();
		
		admin.activarMensageria(tel1);
		
		tel1.imprimir();

	}

}
