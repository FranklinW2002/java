package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas = new ArrayList<Celda>();
	private double saldo;

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {

		celdas.add(celda);
	}

	public void mostrarConfiguracion() {

		Celda cObtenida = null;

		for (int i = 0; i < celdas.size(); i++) {
			cObtenida = celdas.get(i);
			System.out.println("Celda: " + cObtenida.getCodigo());
		}

	}

	public Celda buscarCelda(String codigo) {

		Celda cObtenida = null;

		for (int i = 0; i < celdas.size(); i++) {
			cObtenida = celdas.get(i);
			if (codigo.equals(cObtenida.getCodigo())) {
				return cObtenida;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String celda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(celda);

		celdaRecuperada.ingresarProducto(producto, cantidad);

	}

	public void mostrarProductos() {

		Celda cObtenida = null;

		for (int i = 0; i < celdas.size(); i++) {
			cObtenida = celdas.get(i);
			if (cObtenida.getProducto() != null) {
				System.out.println("Celda:" + cObtenida.getCodigo() + " Stock: " + cObtenida.getStock() + " Producto: "
						+ cObtenida.getProducto().getCodigo() + " Precio: " + cObtenida.getProducto().getPrecio());
			} else {
				System.out.println("Celda:" + cObtenida.getCodigo() + " Stock: " + cObtenida.getStock()
						+ " Sin producto asignado");
			}

		}
		System.out.println("Saldo:" + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda cObtenida = null;
		for (int i = 0; i < celdas.size(); i++) {
			cObtenida = celdas.get(i);
			if (codigo.equals(cObtenida.getCodigo())) {
				return cObtenida.getProducto();
			}
		}
		return null;
	}

	public double consultarPrecio(String codigo) {

		Producto productoE = buscarProductoEnCelda(codigo);

		if (productoE != null) {
			return productoE.getPrecio();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda cObtenida;

		for (int i = 0; i < celdas.size(); i++) {
			cObtenida = celdas.get(i);
			if (cObtenida.getProducto() != null) {
				if (codigo.equals(cObtenida.getProducto().getCodigo())) {
					return cObtenida;
				}
			}

		}

		return null;
	}

	public void incrementarProductos(String codigo, int cantidad) {

		Celda celdaEncontrada = buscarCeldaProducto(codigo);

		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);

	}

	public void vender(String codigo) {

		Celda celdaEncontrada = buscarCelda(codigo);

		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
	}

	public double venderConCambio(String codigo, double valor) {

		Celda celdaEncontrada = buscarCelda(codigo);

		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();

		return valor - celdaEncontrada.getProducto().getPrecio();
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		Celda c;
		ArrayList<Producto> productos = new ArrayList<Producto>();

		for (int i = 0; i < celdas.size(); i++) {
			c = celdas.get(i);
			if (limite >= c.getProducto().getPrecio()) {
				productos.add(c.getProducto());
			}

		}
		return productos;
	}
}
