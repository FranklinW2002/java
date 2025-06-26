package com.servivios;

import java.util.ArrayList;
import java.util.Collections;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {

	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Integer> total = new ArrayList<Integer>();
	
	
	public Juego(ArrayList<String> id) {
		
		
		
		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		naipe = new Naipe();

		for (int i = 0; i < id.size(); i++) {
			ArrayList<Carta> cartas = new ArrayList<Carta>();
			cartasJugadores.add(cartas);

		}
		naipeBarajado = naipe.barajear();
	}

	
	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		ArrayList<Carta> cartasJ;
		
		for (int j = 0; j < cartasJugadores.size(); j++) {
			cartasJ = cartasJugadores.get(j);
			
			for(int i =1;i<=cartasPorJugador;i++) {
				int co = j*i;
				cartasJ.add(naipeBarajado.get(co));

			}
			
		}

	}
	
	public int devolverTotal(int i) {
		int total=0;
		ArrayList<Carta> cartas = cartasJugadores.get(i);
		
		for(int m =0; m <cartas.size();m++) {
			Carta c = cartas.get(m);
			total = total + c.getNumero().getValor();
			this.total.add(total);
		}
		return total;
	}
	
	public String determinarGanador(ArrayList<String> id) {
		
		
		int maximo = Collections.max(total);
		 int posicion = total.indexOf(maximo);
		 posicion =posicion-4;
		 ArrayList<String> nom=id;
		 String nombre = nom.get(posicion);
		return nombre;
	}


	public ArrayList<Integer> getTotal() {
		return total;
	}


	public void setTotal(ArrayList<Integer> total) {
		this.total = total;
	}

}
