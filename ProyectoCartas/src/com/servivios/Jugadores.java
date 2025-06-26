package com.servivios;

import java.util.ArrayList;


import com.entidades.Carta;

public class Jugadores {
	private ArrayList<String> jugadores;
	private Juego juego;
	
	private ArrayList<Integer> totalJ = new ArrayList<Integer>();
	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void jugar() {
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Jose");
		nombres.add("Mateo");
		nombres.add("Jenny");
		
		jugadores = nombres;
	    juego = new Juego(nombres);
		juego.entregarCartas(5);
		
		for(int i = 0; i>juego.getCartasJugadores().size();i++) {
			
            ArrayList<Carta> cartasJugador = juego.getCartasJugadores().get(i);
			String jugador = jugadores.get(i);
			
			
			
			int total=0;
			for(int j = 0 ; j<cartasJugador.size();j++) {
				Carta c = cartasJugador.get(j);
				total =total + c.getNumero().getValor();
				totalJ.add(total);
			}
			System.out.println(jugador + " " + total);
			
		}
			
	}
	
	
}
