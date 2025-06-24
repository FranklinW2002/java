package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
		
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}



	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}



	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}



	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public boolean agregarContacto(Contacto contacto) {
		Contacto contactoO;
		contactoO = buscarPorCedula(contacto.getCedula());

		Date fechaActual = new Date();

		if (contactoO == null) {
			contactos.add(contacto);
			fechaModificacion = fechaActual;
			return true;
		} else {
			return false;
		}

	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto r = null;
		for (int i = 0; i < contactos.size(); i++) {
			r = contactos.get(i);
			if (cedula.equals(r.getCedula())) {
				return r;
			}

		}
		return null;
	}

	public String consultarUltimaModificacion() {

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String fechaFormateada = formato.format(fechaModificacion);

		return fechaFormateada;
	}

	public int contarPerdidos() {
		Contacto r;
		int conteo = 0;
		for (int i = 0; i < contactos.size(); i++) {

			r = contactos.get(i);
			if (r.getDireccion() == null) {
				conteo = conteo + 1;
				;
			}

		}
		return conteo;

	}

	public int contarFijos() {

		Contacto r;
		int conteo = 0;
		Telefono t;

		for (int i = 0; i < contactos.size(); i++) {

			r = contactos.get(i);
			ArrayList<Telefono> telefonos = r.getTelefonos();

			for (int j = 0; j < telefonos.size(); j++) {
				t = telefonos.get(j);

				if (t.getTipo().equals("Convencional")) {
					if (t.getEstado().equals("C")) {
						conteo = conteo + 1;

					}

				}

			}

		}
		return conteo;

	}

	public void depurar() {
		Contacto r;
		
		for (int i = 0; i < contactos.size(); i++) {

			r = contactos.get(i);
			if (r.getDireccion() == null) {
				incorrectos.add(r);
				
			}else {
				correctos.add(r);
			}

		}
		contactos.clear();
		
	}
}
