package com.krakedev.herencia;

public class Gato extends Animal {
	public void maullar() {
		System.out.println("Gato maullando");
	}
	public void maullar(String adjetivo) {
		System.out.println("Gato maullando " + adjetivo);
	}
	@Override
	public void dormir() {
		
		super.dormir();
		System.out.println("Gato durminedo");
	}
}
