package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto();
		 
		producto1.setNombre("sal");
		producto1.setPrecio(-5.25);
		System.out.println(producto1.getPrecio());
		producto1.calcularPrecioPromo(20.5);
		System.out.println(producto1.getPrecio());
	}

}
