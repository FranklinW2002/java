package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		Producto producto = celda.getProducto();
		
		if(producto!=null) {
			System.out.println(celda.getProducto().getNombre());//EN ESTA LINEA ES EL ERROR
			//".getProducto" esta null, por esta razon da NullPointerException
			
			System.out.println("CELDA:"+celda.getProducto());
			System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
			System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
			System.out.println("Codigo Producto:"+celda.getProducto().getCodigo());
		}else {
			System.out.println("No contiene producto esta celda");
		}
		
		
		
		
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}
