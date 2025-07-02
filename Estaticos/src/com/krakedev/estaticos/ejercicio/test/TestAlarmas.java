package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemanas;
import com.krakedev.estaticos.ejercicio.utils.Util;

public class TestAlarmas {
	public static void main(String[] args) {
		Alarma a1=new Alarma(DiasSemanas.LUNES,5,45);
		Alarma a2=new Alarma(DiasSemanas.JUEVES,7,10);
		Alarma a3=new Alarma(DiasSemanas.DOMINGO,10,30);
		Alarma a4=new Alarma(DiasSemanas.MIERCOLES,8,10);
		Alarma a5=new Alarma(DiasSemanas.SABADO,9,25);
		
		AdminAlarmas ada=new AdminAlarmas();
		ada.agregarAlarma(a1);
		ada.agregarAlarma(a2);
		ada.agregarAlarma(a3);
		ada.agregarAlarma(a4);
		ada.agregarAlarma(a5);
		
		
		ArrayList<Alarma> alarmasActuales= ada.getAlarma();
		
		for(int i=0;i<alarmasActuales.size();i++) {
			Alarma a=alarmasActuales.get(i);
			String dia=Util.formatearDia(a.getDia()-1);
			String hora=Util.formatearHora(a.getHora());
			System.out.println(dia+", "+hora+":"+a.getMinuto());
		}
	}
}
