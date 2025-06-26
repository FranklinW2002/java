package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	public Naipe() {
		
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();
		Numero n ;
		Carta c1;
		Carta c2;
		Carta c3;
		Carta c4;
		Palos p = new Palos();
		
		Numero numeroA = new Numero("A",11);
		Numero numero2 = new Numero("2",2);
		Numero numero3 = new Numero("3",3);
		Numero numero4 = new Numero("4",4);
		Numero numero5 = new Numero("5",5);
		Numero numero6 = new Numero("6",6);
		Numero numero7 = new Numero("7",7);
		Numero numero8 = new Numero("8",8);
		Numero numero9 = new Numero("9",9);
		Numero numero10 = new Numero("10",10);
		Numero numeroJ = new Numero("10",10);
		Numero numeroQ = new Numero("10",10);
		Numero numeroK = new Numero("10",10);
		
		numerosPosibles.add(numeroA);
		numerosPosibles.add(numero2);
		numerosPosibles.add(numero3);
		numerosPosibles.add(numero4);
		numerosPosibles.add(numero5);
		numerosPosibles.add(numero6);
		numerosPosibles.add(numero7);
		numerosPosibles.add(numero8);
		numerosPosibles.add(numero9);
		numerosPosibles.add(numero10);
		numerosPosibles.add(numeroJ);
		numerosPosibles.add(numeroQ);
		numerosPosibles.add(numeroK);
		for(int i = 0; i<numerosPosibles.size(); i++) {
			n = numerosPosibles.get(i);
			c1 = new Carta(n, p.getCorazonNegro());
			c2 = new Carta(n, p.getCorazonNegro());
			c3 = new Carta(n, p.getDiamante());
			c4 = new Carta(n, p.getTrebol());
			cartas.add(c1);
			cartas.add(c2);
			cartas.add(c3);
			cartas.add(c4);
		}
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public ArrayList<Carta> barajear() {
		
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		int pos;
		Carta carta;
		for(int i = 0; i>=100;i++) {
			pos = Random.obtenerPosicion();
			carta = cartas.get(pos);
			if("N".equals(carta.getEstado())){
				carta.setEstado("C");
				auxiliar.add(carta);
			}
		}
		
		for(int j = 0; j < cartas.size();j++) {
			carta = cartas.get(j);
			if("N".equals(carta.getEstado())) {
				carta.setEstado("C");
				auxiliar.add(carta);
			}
		}
		return auxiliar;
	}
	
	
}
