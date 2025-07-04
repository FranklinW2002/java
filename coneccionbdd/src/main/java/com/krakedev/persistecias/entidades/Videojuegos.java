package com.krakedev.persistecias.entidades;

public class Videojuegos {
	private int	 codigo;
	private String nombre;
	private String descripcion;
	private int valiracion;
	private Plataformas plataforma;
	
	public Videojuegos() {}
	public Videojuegos(int codigo, String nombre, int valiracion, Plataformas plataforma) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.valiracion = valiracion;
		this.plataforma = plataforma;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getValiracion() {
		return valiracion;
	}
	public void setValiracion(int valiracion) {
		this.valiracion = valiracion;
	}
	public Plataformas getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataformas plataforma) {
		this.plataforma = plataforma;
	}
	@Override
	public String toString() {
		return "Videojuegos [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", valiracion="
				+ valiracion + ", plataforma=" + plataforma + "]";
	}
	
	
}
