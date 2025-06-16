package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1;
		Producto producto2;
		Producto producto3;
		
		producto1 = new Producto();
		producto2 = new Producto();
		producto3 = new Producto();
		
		producto1.nombre = "sal";
		producto1.descripcion = "de mesa";
		producto1.precio = 5.25;
		producto1.stockActual = 10;
		
		producto2.nombre = "azucae";
		producto2.descripcion = "morena";
		producto2.precio = 7.25;
		producto2.stockActual = 20;
		
		producto3.nombre = "arroz";
		producto3.descripcion = "arroba";
		producto3.precio = 16.50;
		producto3.stockActual = 5;
		
		System.out.println("Nombre: " + producto1.nombre);
		System.out.println("Descripcion: " + producto1.descripcion);
		System.out.println("Precio: " + producto1.precio);
		System.out.println("Stock: " + producto1.stockActual);
		
		System.out.println("***************");
		
		System.out.println("Nombre: " + producto2.nombre);
		System.out.println("Descripcion: " + producto2.descripcion);
		System.out.println("Precio: " + producto2.precio);
		System.out.println("Stock: " + producto2.stockActual);
		
		System.out.println("***************");
		
		System.out.println("Nombre: " + producto3.nombre);
		System.out.println("Descripcion: " + producto3.descripcion);
		System.out.println("Precio: " + producto3.precio);
		System.out.println("Stock: " + producto3.stockActual);
		
		
	}
	
}
