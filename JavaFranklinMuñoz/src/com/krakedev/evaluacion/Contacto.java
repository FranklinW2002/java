package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {
		telefonos = new ArrayList<Telefono>();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void imprimir() {

		System.out.println("***" + nombre + " " + apellido + "***");
		System.out.println("Cedula: " + cedula);

		if (direccion != null) {

			System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());

		}

	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		Telefono r = null;
		System.out.println("Telefonos con estado 'C':");
		for (int i = 0; i < telefonos.size(); i++) {
			r = telefonos.get(i);
			if (r.getEstado().equals("C")) {
				System.out.println("Numero: " + r.getNumero() + ", Tipo: " + r.getTipo());

			}
		}

	}


	public ArrayList<Telefono> recuperarIncorrectos() {
		Telefono r = null;
		ArrayList<Telefono> Ti = new ArrayList<Telefono>();
		for (int i = 0; i < telefonos.size(); i++) {
			r = telefonos.get(i);
			if (r.getEstado().equals("E")) {
				Ti.add(r);

			}
		}
		
		return Ti;
	}

}
