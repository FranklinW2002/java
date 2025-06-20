package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item();
		
		item1.setNombre("sal");
		item1.setProductosActuales(20);
		item1.setProductosVendidos(10);
		item1.imprimir();
		item1.devolver(5);
		item1.imprimir();
		

	}

}
