package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;	
	private int codigo;
	private boolean tieneWhatsapp;
	
	public Telefono(int codigo, String operadora,String numero) {
		
		this.codigo = codigo;
		this.operadora = operadora;
		this.numero = numero;
		tieneWhatsapp = false;
	}
	

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean getTieneWhatsapp() {
		return tieneWhatsapp;
	}

	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}
	
	public void imprimir() {
		System.out.println("Operadora: " + operadora);
		System.out.println("Numero: " + "+" + codigo + " " +numero);
		if(tieneWhatsapp) {
			System.out.println("Tiene Whatsapp");
		}else {
			System.out.println("No tiene Whatsapp");
		}
	}
}
