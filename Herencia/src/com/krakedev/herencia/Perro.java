package com.krakedev.herencia;

public class Perro extends Animal{
	public Perro() {
		System.out.println("ejecuta el constructor de perro");
	}
	public void ladar() {
		System.out.println("Perro ladrando");
	}
	@Override
	public void dormir() {
		
		super.dormir();
		System.out.println("Perro durminedo");
	}
	
}
