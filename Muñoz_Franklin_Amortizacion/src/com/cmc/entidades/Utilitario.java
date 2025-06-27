package com.cmc.entidades;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utilitario {
	public static double redondear(double n) {
		
		BigDecimal redondeado = new BigDecimal(n).setScale(2, RoundingMode.HALF_UP);
        double r = redondeado.doubleValue();
		
		return r;
	}
}
