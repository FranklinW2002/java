package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1;
		Producto producto2;
		Producto producto3;
		
		producto1 = new Producto();
		producto2 = new Producto();
		producto3 = new Producto();
		
		producto1.setNombre("sal");
		producto1.setDescripcion("de mesa");
		producto1.setPrecio(5.25);
		producto1.setStockActual(10);
		
		producto2.setNombre("azucae");
		producto2.setDescripcion("morena");
		producto2.setPrecio(7.25);
		producto2.setStockActual(20);
		
		producto3.setNombre( "arroz");
		producto3.setDescripcion("arroba");
		producto3.setPrecio(16.50);
		producto3.setStockActual( 5);
		
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Descripcion: " + producto1.getDescripcion());
		System.out.println("Precio: " + producto1.getPrecio());
		System.out.println("Stock: " + producto1.getStockActual());
		
		System.out.println("***************");
		
		System.out.println("Nombre: " + producto2.getNombre());
		System.out.println("Descripcion: " + producto2.getDescripcion());
		System.out.println("Precio: " + producto2.getPrecio());
		System.out.println("Stock: " + producto2.getStockActual());
		
		System.out.println("***************");
		
		System.out.println("Nombre: " + producto3.getNombre());
		System.out.println("Descripcion: " + producto3.getDescripcion());
		System.out.println("Precio: " + producto3.getPrecio());
		System.out.println("Stock: " + producto3.getStockActual());
		
		
	}
	
}
