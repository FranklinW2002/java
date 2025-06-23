package karkedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	
	
	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public String buscarEstudiantePorCelda(Estudiante estudiante) {
		Estudiante estudianteR;
		boolean encontrado = false;
		for(int i = 0; i<estudiantes.size(); i++) {
			estudianteR = estudiantes.get(i);
			if(estudiante.getCedula().equals(estudianteR.getCedula())) {
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			return null;
		}else {
			return "Encontrado";
		}
	
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		String resultado;
		
		resultado = buscarEstudiantePorCelda(estudiante);
		
		if(resultado==null) {
			estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		int conteo = 0;
		double sumaNotas = 0;
		double promedio = 0;
		Estudiante estudianteR;
		for(int i = 0; i<estudiantes.size();i++) {
			estudianteR = estudiantes.get(i);
			conteo +=1;
			sumaNotas += estudianteR.calcularPromedioNotasEstudiante();
			
		}
		promedio = sumaNotas/conteo;
		
		return promedio;
	}
	
	public void mostrar() {
		
		System.out.println("Info Clase*************");
		for(int i = 0; i<estudiantes.size();i++) {
			
			Estudiante estudianteR = estudiantes.get(i);
			System.out.println("\nEstudiante " + (i+1));
			estudianteR.mostrar();
			;
		}
	}
}
