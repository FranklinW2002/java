package com.krakedev.persistecias.entidades;

public class Plataformas {
	private int id_plataforma;
	private String nombre_plataforma;
	private int coodigo_vidiojuego;
	public Plataformas() {}
	public Plataformas(int id_plataforma, String nombre_plataforma, int coodigo_vidiojuego) {
		super();
		this.id_plataforma = id_plataforma;
		this.nombre_plataforma = nombre_plataforma;
		this.coodigo_vidiojuego = coodigo_vidiojuego;
	}

	public Plataformas(int id_plataforma, String nombre_plataforma) {
		super();
		this.id_plataforma = id_plataforma;
		this.nombre_plataforma = nombre_plataforma;
	}

	public int getId_plataforma() {
		return id_plataforma;
	}

	public void setId_plataforma(int id_plataforma) {
		this.id_plataforma = id_plataforma;
	}

	public String getNombre_plataforma() {
		return nombre_plataforma;
	}

	public void setNombre_plataforma(String nombre_plataforma) {
		this.nombre_plataforma = nombre_plataforma;
	}

	public int getCoodigo_vidiojuego() {
		return coodigo_vidiojuego;
	}

	public void setCoodigo_vidiojuego(int coodigo_vidiojuego) {
		this.coodigo_vidiojuego = coodigo_vidiojuego;
	}

	@Override
	public String toString() {
		return "Plataformas [id_plataforma=" + id_plataforma + ", nombre_plataforma=" + nombre_plataforma
				+ ", coodigo_vidiojuego=" + coodigo_vidiojuego + "]";
	}
	
	
}
