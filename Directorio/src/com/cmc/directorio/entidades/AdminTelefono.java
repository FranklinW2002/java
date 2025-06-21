package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensageria(Telefono telefono) {
		if("movi" == telefono.getOperadora()) {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	
	public int contarMovi(Telefono tel1,Telefono tel2,Telefono tel3) {
		int num = 0;
		
		if("movi" == tel1.getOperadora()) {
			num+=1;
		}
		
		if("movi" == tel2.getOperadora()) {
			num+=1;
		}
		if("movi" == tel3.getOperadora()) {
			num+=1;
		}
	
		return num;
	}
	
	public int contarClaro(Telefono tel1,Telefono tel2,Telefono tel3,Telefono tel4) {
		int num = 0;
		
		if("claro" == tel1.getOperadora()) {
			num+=1;
		}
		
		if("claro" == tel2.getOperadora()) {
			num+=1;
		}
		if("claro" == tel3.getOperadora()) {
			num+=1;
		}
		
		if("claro" == tel4.getOperadora()) {
			num+=1;
		}

		return num;
	}
}
