package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {
	public static void main(String[] args) {
		
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("A3"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("B3"));
        
        Producto producto1=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto1, "A1", 10);
		
		Producto producto2=new Producto("KE35","Galletas",1.85);
		maquina.cargarProducto(producto2, "A2", 15);
		
		Producto producto3=new Producto("KE36","Cola",5.85);
		maquina.cargarProducto(producto3, "A3", 8);
		
		Producto producto4=new Producto("KE37","Cheto",0.55);
		maquina.cargarProducto(producto4, "B1", 5);
		
		Producto producto5=new Producto("KE38","Chiles",0.15);
		maquina.cargarProducto(producto5, "B2", 7);
		
		Producto producto6=new Producto("KE39","Hamburguesa",10.50);
		maquina.cargarProducto(producto6, "B3", 9);
		
		double precio = 4;
		
		ArrayList<Producto> productosM = maquina.buscarMenores(precio);
		System.out.println("Productos menores a " + precio);
		for(int i = 0; i < productosM.size();i++) {
			Producto productoR = productosM.get(i);
			
			System.out.println("Nombre:" + productoR.getNombre() + " Precio: " + productoR.getPrecio());
		}
		
	}
}
