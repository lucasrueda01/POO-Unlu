package ar.edu.unlu.poo.ClasePractica;

public class Coleccion {
	private Contrasena[] contraseñas;
	private int cantElementos;
	
	public Coleccion(int cantElementos, int tamaño){
		this.cantElementos = cantElementos;
		contraseñas = new Contrasena[cantElementos];
		for (int i=0;i<cantElementos;i++) {
			contraseñas[i] = new Contrasena(tamaño);
		}
	}
	
	public void setcantElementos(int cantElementos) {
		this.cantElementos = cantElementos;
	}
	
	public int getcantElementos() {
		return cantElementos;
	}
	
	public void generarContraseñas() {
		for (int i=0;i<getcantElementos();i++) {
			contraseñas[i].generarContrasena();
		}
	}
	
	public void mostrarContraseñas() {
		for (int i=0;i<getcantElementos();i++) {
			if (contraseñas[i].esFuerte()) {
				System.out.println(contraseñas[i].getCadena() + " - " + "FUERTE");
			} else { 
				System.out.println(contraseñas[i].getCadena() + " - " + "DEBIL");
			}
		}
	}
	
	
}
