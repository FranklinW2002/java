package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private Double nota;
	private String resultado;
	
	
	
	public void calificar(Double nota) {
		this.nota=nota;
		
		if(nota<8) {
			resultado = "F";
		}else{
			resultado = "A";
		}
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
	
}
