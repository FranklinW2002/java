package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	
	
	public Banco() {
		prestamos = new ArrayList<Prestamo>();
		clientes= new ArrayList<Cliente>();
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public Cliente buscarCliente(String cedula) {
		Cliente clienteB =null;
		
		for(int i=0;i<clientes.size();i++) {
			Cliente r = clientes.get(i);
			
			if(r!=null) {
				if(cedula.equals(r.getCedula())) {
					return r;
				}
			}
			
				
			
		}
		return clienteB;
	}
	
	public void registrarCliente(Cliente clienteN) {
		Cliente clienteB = buscarCliente(clienteN.getCedula());
		if(clienteB==null) {
			
			clientes.add(clienteB);
			
		}else {
			System.out.println("Cliente ya existe");
		}
		
	}
	
	public void asignarPrestamo(String cedula,Prestamo prestamo1) {
		Cliente B = buscarCliente(cedula);
		if(B==null) {
			System.out.println("no es cliente del baco");
		}else {
			B.getPrestamos().add(prestamo1);
			CalculadoraAmortizacion.generarTabla(prestamo1);
		}
		
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		Cliente B = buscarCliente(cedula);
		ArrayList<Prestamo> P = null;
		if(B.getPrestamos()==null) {
			return P;
		}else {
			P = B.getPrestamos();
			return P;
		}
	}
}
