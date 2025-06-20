package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private Double precio;
	
	public void calcularPrecioPromo(Double porcentageDescuento) {
		precio = precio*(porcentageDescuento/100);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		
		if(precio>0) {
			this.precio = precio;
		}else {
			precio = precio * (-1);
			this.precio = precio;
		}
		
	}
	
	
}
