package com.cmc.directori.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono(10,"movi","0987562658");
		Telefono tel2 = new Telefono(10,"claro","0245963274");
		Telefono tel3 = new Telefono(10,"movi","0985674136");
		Telefono tel4 = new Telefono(10,"claro","0985678136");
		
		AdminTelefono admin = new AdminTelefono();
		
		int num = admin.contarClaro(tel1, tel2, tel3, tel4);
		
		System.out.println("Telefonos con movi: " + num);
	}

}
