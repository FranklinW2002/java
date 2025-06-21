package com.cmc.directorio.entidades;

public class AdminContactos {
	
	public Contacto buscarMasPesado(Contacto c1,Contacto c2) {
		
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else {
			return c2;
		}
		
	}
	
	public boolean compararOperadoras(Contacto c1,Contacto c2) {
		Telefono tel1 = c1.getTelefono();
		Telefono tel2 = c2.getTelefono();
		
		
		if(tel1.getOperadora() == tel2.getOperadora()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void activarUsuario(Contacto c1) {
		Telefono tel1 = c1.getTelefono();
		
		if(!tel1.getTieneWhatsapp()) {
			c1.setActivo(true);
		}
	}
}