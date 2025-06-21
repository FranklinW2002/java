package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	//constructores
	public Producto(String codigo, String nombre, double precio ) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	//getesr y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
//metodos
	public void incrementarPrecio(int porcentageIncremento) {
		precio = precio + (precio * porcentageIncremento/100);
	}
	
	public void disminuirPrecio(double precioD) {
		precio = precio - precioD;
	}
}
