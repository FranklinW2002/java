package karkedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Nota> notas;

	
	
	public Estudiante(String cedula, String nombre, String apellido) {
		notas = new ArrayList<Nota>();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nota) {
		Nota notaRecuperada;
		boolean encontrada = false;

		for (int i = 0; i < notas.size(); i++) {
			
			notaRecuperada = notas.get(i);
			if (nota.getMateria().getCodigo().equals(notaRecuperada.getMateria().getCodigo())) {
				encontrada = true;
			}
			

		}

		if (!encontrada) {

			if (nota.getNota() >= 0 && nota.getNota() <= 10) {
				
				notas.add(nota);
				System.out.println("NOTA GUARDADA");
			}else {
				System.out.println("LA NOTA DEBE ESTAR ENTRE 0 Y 10");
			}

		}else {
			System.out.println("La materia " + nota.getMateria().getCodigo() + " ya tiene nota");
		}

	}
	
	public void modificarNota(String codigo,double nuevaNota) {
		
		Nota notaRecuperada;
		boolean encontro = false;
		for (int i = 0; i < notas.size(); i++) {
			
			notaRecuperada = notas.get(i);
			if (codigo.equals(notaRecuperada.getMateria().getCodigo())) {
				encontro = true;
				if (nuevaNota >= 0 && nuevaNota <= 10) {
				notaRecuperada.setNota(nuevaNota);
				}else {
					System.out.println("LA NOTA DEBE ESTAR ENTRE 0 Y 10");
				}
			}
			

		}
		
		if(!encontro) {
			System.out.println("La codigo de la materia ");
		}


	}
	
	public double calcularPromedioNotasEstudiante() {
		int conteo = 0;
		double sumaNotas = 0;
		Nota notaR;
		double promedio = 0;
		
		for(int i = 0; i < notas.size(); i++) {
			
			notaR = notas.get(i);
			sumaNotas = sumaNotas + notaR.getNota();
			conteo += 1;
		}
			
			
		promedio = sumaNotas/conteo;
		return promedio;
		
	}
	
	public void mostrar() {
		Nota notaR;
		
		System.out.println("********Info Estudiante*****\n");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Cedula: " + cedula);
		System.out.println("\n********Info Notas**********");
		
		for(int i = 0;i < notas.size();i++) {
			notaR = notas.get(i);
			
			System.out.println("\nMateria: " + notaR.getMateria().getNombre());
			System.out.println("Codigo: " + notaR.getMateria().getCodigo());
			System.out.println("Nota: " + notaR.getNota());
			
		}
		System.out.println("\n****************************");
	}
}
