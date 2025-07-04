package com.krakedev.persistecias.test;

import com.krakedev.persistecias.entidades.Plataformas;
import com.krakedev.persistecias.entidades.Videojuegos;
import com.krakedev.persistecias.servicios.TestVideojuegos;

public class TestVideojuegosA {
	public static void main(String[] args) {
		Plataformas p = new Plataformas(1,"claro");
		Videojuegos v = new Videojuegos(22222,"ana",3567,p);
		try {
						// p.setCantidadA(new BigDecimal(1200.45));
			// p.setNumeroH(50);
			TestVideojuegos.actualizar(v);
		} catch (Exception e) {
			System.out.println("error en el sisitema: " + e.getMessage());
		}

	}
}
