package clearminds.cuentas;

public class Cuenta {
	
	private String id;
	private String tipo;
	private Double saldo;
	
	public Cuenta(String id){
		this.id = id;
		tipo = "A";
	}
	
	public Cuenta(String id,String tipo,Double saldo){
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	public void imprimir() {
		
		System.out.println("***************");
		System.out.println("CUENTA");
		System.out.println("***************");
		System.out.println("Numero de cuenta: " + id );
		System.out.println("Tipo: " + tipo );
		System.out.println("Saldo: " + saldo );
		System.out.println("***************");
		
	}
	
	
public void imprimirConMiEstilo() {
		
		System.out.println("***************\n");
		System.out.println("Informacion de cuenta\n");
		System.out.println("***************\n");
		System.out.println("Numero de cuenta: " + id );
		System.out.println("Tipo: " + tipo );
		System.out.println("Saldo: " + saldo );
		System.out.println("\n***************");
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
