package com.krakedev.herencia;

public class TestHerencia {

	public static void main(String[] args) {
		Perro p = new Perro();
		p.dormir();
		Animal a = new Animal();
		a.dormir();
		System.out.println(a.hashCode());
		p.ladar();
	}

}
