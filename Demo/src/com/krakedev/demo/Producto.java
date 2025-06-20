package com.krakedev.demo;

public class Producto {

	private int codigo;
	private String nombre;
	private String descripcion;
	private Double peso;
	
	public Producto(int codigo,String nombre) {
		this.nombre =  nombre;
		this.codigo = codigo;
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
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
}
