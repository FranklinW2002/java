package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("Nombre:" + nombre );
		System.out.println("Producto Actual:" + productosActuales );
		System.out.println("Producto Devuelto:" + productosDevueltos );
		System.out.println("Producto Vendido:" + productosVendidos );
		
	}
	
	public void devolver (int productosDevueltos) {
		 this.productosDevueltos =  this.productosDevueltos + productosDevueltos;
		 productosActuales = productosActuales+productosDevueltos;
		 productosVendidos = productosVendidos-productosDevueltos;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	
}
