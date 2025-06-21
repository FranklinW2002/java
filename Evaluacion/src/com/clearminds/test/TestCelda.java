package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestCelda {
	public static void main(String[] args) {
		
		Celda celda=new Celda("A1");
		
		Producto producto = celda.getProducto();
		
		if(producto==null){
			System.out.println("null");
		}else {
			System.out.println(producto.getNombre());
		}
		
		
		
		System.out.println("CELDA:"+celda.getProducto());
		
		if(producto==null){
			System.out.println("Nombre Producto: null");
			System.out.println("Precio Producto: null");
			System.out.println("C�digo Producto: null");
		}else {
			System.out.println("Nombre Producto:"+producto.getNombre());
			System.out.println("Precio Producto:"+producto.getPrecio());
			System.out.println("C�digo Producto:"+producto.getCodigo());
		}
		
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}
