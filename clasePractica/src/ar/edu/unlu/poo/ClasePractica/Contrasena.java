package ar.edu.unlu.poo.ClasePractica;

import java.util.Random;

public class Contrasena {
	private int longitud;
	private String cadena;
	
	public Contrasena() {
		this.longitud = 8;
		this.cadena = "";
	}
	
	public Contrasena(Integer longitud) {
		this.longitud = longitud;
		this.cadena = "";
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String getCadena() {
		return cadena;
	}
	
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public String generarContrasena() {
		for (int i=0 ; i < getLongitud() ; i++) {
			Random r = new Random();
			char c = (char) (r.nextInt(75) + 48);
			cadena = cadena + c;
		}
		return cadena;
	}
	
	public Boolean esFuerte() {
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		for (int i=0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isUpperCase(c)) {
				mayus++;
			}
			if (Character.isLowerCase(c)) {
				minus++;
			}
			if (Character.isDigit(c)) {
				numeros++;
			}
		}
		boolean fuerte;
		if ((mayus >= 3) && (minus >= 2) && (numeros >= 2)) {
			fuerte = true;
		} else {
			fuerte = false;
		}
		return fuerte;
	}
	
}
