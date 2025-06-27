package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.entidades.Cuota;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double cuota = 0;

		double co=prestamo.getMonto();
		double i =prestamo.getInteres();
		int plazo = prestamo.getPlazo();
		
		cuota = (co*(i/12)/100)/(1-Math.pow((1+(i/12)/100), (-plazo)));
		
		return cuota;
		
		
	}
	
	public static void generarTabla(Prestamo prestamo) {
		double cuotaValorFijo = calcularCuota(prestamo);
		ArrayList<Cuota> cuotas = prestamo.getCuotas();
		Cuota cuotaI = new Cuota(1);
		cuotaI.setCuota(cuotaValorFijo);
		cuotaI.setCapital(prestamo.getMonto());
		double interes =  prestamo.getMonto()* prestamo.getInteres()/1200;
		cuotaI.setInteres(interes);
		cuotaI.setAbonoCapital(cuotaValorFijo-interes);
		cuotaI.setSaldo(prestamo.getMonto()-cuotaI.getAbonoCapital());	
			
		cuotas.add(cuotaI);
		
		for(int i =2;i<=prestamo.getPlazo();i++) {
			
			Cuota A = cuotas.get(i-2);
			Cuota cuotaS = new Cuota(i);
			cuotaS.setCuota(A.getCuota());
			cuotaS.setCapital(A.getSaldo());
			calcularValoresCuota(prestamo.getInteres()/(1200),A,cuotaS);
			cuotas.add(cuotaS);
		}
	
		
				
		
		
	}
	
	public static void calcularValoresCuota(double interes,Cuota cuotaA,Cuota cuotaN) {
		cuotaN.setInteres(cuotaN.getCapital()*interes);
		cuotaN.setAbonoCapital(cuotaN.getCuota()-cuotaN.getInteres());
		cuotaN.setSaldo(cuotaA.getSaldo()-cuotaN.getAbonoCapital());
		
		
		
		
	}
	
	public static void mostrarTabla(Prestamo prestamo) {
		ArrayList<Cuota> cuotasO = prestamo.getCuotas();
		
		for(int i = 0;i<cuotasO.size();i++) {
			Cuota cuotaO =cuotasO.get(i);
			cuotaO.mostrarPrestamo();
		}
	}
}
