package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona("1727047712","Franklin");
		System.out.println(p.toString());
		System.out.println(p);
		
		Cuenta c = new Cuenta("0012",20.50);
		System.out.println(c.toString());
	}

}
