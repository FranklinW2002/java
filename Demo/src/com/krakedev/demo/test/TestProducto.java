package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(015,"Sal");
		producto1.setDescripcion("sal de mesa");
		producto1.setPeso(500.5);
		
		System.out.println("Codigo: " + producto1.getCodigo());
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Descripcion: " + producto1.getDescripcion());
		System.out.println("peso: " + producto1.getPeso());
		
	}

}
