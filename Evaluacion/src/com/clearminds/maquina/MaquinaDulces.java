package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	
	public void configurarMaquina(String codigo1, String codigo2, String codigo3,String codigo4) {
		Celda c1 = new Celda(codigo1);
		Celda c2 = new Celda(codigo2);
		Celda c3 = new Celda(codigo3);
		Celda c4 = new Celda(codigo4);
		
		celda1 = c1; 
		celda2 = c2; 
		celda3 = c3; 
		celda4 = c4; 
	}
	
	public void mostrarConfiguracion() {
		System.out.println("Codigo 1: " + celda1.getCodigo());
		System.out.println("Codigo 2: " + celda2.getCodigo());
		System.out.println("Codigo 3: " + celda3.getCodigo());
		System.out.println("Codigo 4: " + celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		
		if(codigo == celda1.getCodigo()) {
			return celda1;
		}else if(codigo == celda2.getCodigo()) {
			return celda2;
		}else if(codigo == celda3.getCodigo()) {
			return celda3;
		}else if(codigo == celda4.getCodigo()){
			return celda4;
		}else {
			return null;
		}
		
	}
	
	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
		
		
	}
	
	public void mostrarProductos() {
		System.out.println("*** Producto1******");
		System.out.println("Celda: " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		
		if(celda1.getProducto()!=null) {
			System.out.println("Nombre: " + celda1.getProducto().getNombre());
			System.out.println("Precio: " + celda1.getProducto().getPrecio());
			System.out.println("Codigo producto: " + celda1.getProducto().getCodigo());
		}else {
			System.out.println("La celda no contiene producto!!!");
		}
		
		
		System.out.println("*** Producto2******");
		System.out.println("Celda: " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if(celda2.getProducto()!=null) {
			System.out.println("Nombre: " + celda2.getProducto().getNombre());
			System.out.println("Precio: " + celda2.getProducto().getPrecio());
			System.out.println("Codigo producto: " + celda2.getProducto().getCodigo());
		}else {
			System.out.println("La celda no contiene producto!!!");
		}
		
		System.out.println("*** Producto3******");
		System.out.println("Celda: " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if(celda3.getProducto()!=null) {
			System.out.println("Nombre: " + celda3.getProducto().getNombre());
			System.out.println("Precio: " + celda3.getProducto().getPrecio());
			System.out.println("Codigo producto: " + celda3.getProducto().getCodigo());
		}else {
			System.out.println("La celda no contiene producto!!!");
		}
		
		System.out.println("*** Producto4******");
		System.out.println("Celda: " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if(celda4.getProducto()!=null) {
			System.out.println("Nombre: " + celda4.getProducto().getNombre());
			System.out.println("Precio: " + celda4.getProducto().getPrecio());
			System.out.println("Codigo producto: " + celda4.getProducto().getCodigo());
		}else {
			System.out.println("La celda no contiene producto!!!");
		}

		System.out.println("***SALDO: " + saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Celda celda = buscarCelda(codigo);
		if(celda.getProducto()!=null) {
			return celda.getProducto();
		}else {
			return null;
		}
	}
	
	public double consultarPrecio(String codigo) {
		Celda celda = buscarCelda(codigo);
		
		if(celda.getProducto()!=null) {
			Producto p = celda.getProducto();
			return p.getPrecio();
		}else {
			return 0.0;
		}
	}
	public Celda buscarCeldaProducto(String codigoP) {
		
		
		if(celda1.getProducto() != null) {
			if(codigoP == celda1.getProducto().getCodigo()) {
				return celda1;
			}
		}else if(celda2.getProducto() != null) {
			if(codigoP == celda2.getProducto().getCodigo()) {
				return celda2;
			}
		}else if(celda3.getProducto() != null) {
			if(codigoP == celda3.getProducto().getCodigo()) {
				return celda3;
			}
		}else if(celda4.getProducto() != null) {
			if(codigoP == celda4.getProducto().getCodigo()) {
				return celda4;
			}
		}else{
			return null;
		}
		return null;
		
		

		
	}
	
	public void incrementarProductos(String codigoP, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoP);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
	}
	
	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		mostrarProductos();
		
	}
	
	public double venderConCambio(String codigo,double saldoI) {
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		double cambio = saldoI - celdaEncontrada.getProducto().getPrecio();
		mostrarProductos();
		return cambio;
		
	}
}
