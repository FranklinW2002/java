package com.krakedev.persistecias.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;

	private EstadoCivil estadoCivil;
	
	private int numeroHijos;
	private double estatura;
	private BigDecimal cantidadAhorrada;
	private Date fechaNacimiendo;
	private Date HoraNacimiento;
	

	public Persona() {
		
	}
	
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
	}

	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, int numeroHijos,
			double estatura, BigDecimal cantidadAhorrada, Date fechaNacimiendo, Date horaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.numeroHijos = numeroHijos;
		this.estatura = estatura;
		this.cantidadAhorrada = cantidadAhorrada;
		this.fechaNacimiendo = fechaNacimiendo;
		HoraNacimiento = horaNacimiento;
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
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getNumeroHijos() {
		return numeroHijos;
	}
	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}
	public void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
	}
	public Date getFechaNacimiendo() {
		return fechaNacimiendo;
	}
	public void setFechaNacimiendo(Date fechaNacimiendo) {
		this.fechaNacimiendo = fechaNacimiendo;
	}
	public Date getHoraNacimiento() {
		return HoraNacimiento;
	}
	public void setHoraNacimiento(Date horaNacimiento) {
		HoraNacimiento = horaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil="
				+ estadoCivil + ", numeroHijos=" + numeroHijos + ", estatura=" + estatura + ", cantidadAhorrada="
				+ cantidadAhorrada + ", fechaNacimiendo=" + fechaNacimiendo + ", HoraNacimiento=" + HoraNacimiento
				+ "]";
	}
	
	
}	
