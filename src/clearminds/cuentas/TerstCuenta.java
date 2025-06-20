package clearminds.cuentas;

public class TerstCuenta {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("03476");
		Cuenta cuenta2 = new Cuenta("03476", "C", 98.00);
		Cuenta cuenta3 = new Cuenta("03476");
		Cuenta cuenta4 = new Cuenta("0987");
		Cuenta cuenta5 = new Cuenta("0567","C",10.00);
		Cuenta cuenta6 = new Cuenta("0666","A",0.00);
		
		cuenta1.setSaldo(675.00);
		cuenta3.setTipo("C");
		
		System.out.println("----------Valores Iniciales----------");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("----------Valores modificados----------");
		
		cuenta1.setSaldo(444.00);
		cuenta3.setSaldo(567.00);
		cuenta1.setTipo("C");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10.00);
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
	}

}
