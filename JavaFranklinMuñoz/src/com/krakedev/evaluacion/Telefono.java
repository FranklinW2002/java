package com.krakedev.evaluacion;

public class Telefono {

	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {

		this.numero = numero;
		this.tipo = tipo;

		if (tipo != null && numero != null) {
			if (tipo.equals("Movil")) {

				if (numero.length() == 10) {
					estado = "C";
				} else {
					estado = "E";
				}
			} else if (tipo.equals("Convencional")) {
				if (numero.length() == 7) {
					estado = "C";
				} else {
					estado = "E";
				}
			} else {
				estado = "E";
			}
		} else {
			estado = "E";
		}

	}
	
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
