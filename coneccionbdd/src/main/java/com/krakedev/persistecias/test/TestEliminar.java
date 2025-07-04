package com.krakedev.persistecias.test;

import com.krakedev.persistecias.servicios.AdminPersonas;

public class TestEliminar {
	public static void main(String[] args) {
		
		try {
			AdminPersonas.eliminar("1727047720");
		} catch (Exception e) {
			System.out.println("error en el sisitema: "+e.getMessage());
		};
	
}

}
