package karkedev.entidades;

public class Nota {
	private Materia materia;
	private double nota;
	
	public Nota() {
		
	}
	
	public Nota(Materia materia, double nota) {
		super();
		this.materia = materia;
		this.nota = nota;
	}
	
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void mostar() {
		
		System.out.println("Materia: " + materia + " Nota: " + nota);
		
		
	}
}
