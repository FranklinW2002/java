package com.entidades;

public class Random {
	public static int obtenerPosicion() {
		double num;
		int pos;
		num = Math.random();
		num = num *52;
		pos = (int) num; 
		return pos;
		
	}
}
