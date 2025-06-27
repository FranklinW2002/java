package com.cmc.entidades;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double interes;
	private double abonoCapital;
	private double saldo;
	
	public Cuota(int numero) {
		this.numero =numero;
		
	}
	
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cupota) {
		this.cuota = cupota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void mostrarPrestamo() {
		System.out.println(numero + "\t |"+Utilitario.redondear(cuota)+
				"\t |" + Utilitario.redondear(capital) +
				"\t |" + Utilitario.redondear(interes) +	
				"\t |" + Utilitario.redondear(abonoCapital) +
				"\t |" + Utilitario.redondear(saldo));
	}
	
	
}
