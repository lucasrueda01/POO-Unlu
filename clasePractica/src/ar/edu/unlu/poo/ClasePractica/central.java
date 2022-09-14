package ar.edu.unlu.poo.ClasePractica;

import java.time.LocalDate;
import java.util.Scanner;

public class central {

	public static void main(String[] args) {
		Contrasena miContraseña = new Contrasena(12);
		/*System.out.println("La contraseña es: ");
		System.out.println(miContraseña.generarContrasena());
		if (miContraseña.esFuerte()) {
			System.out.println("Es fuerte");
		} else {
			System.out.println("Es debil");
		}
		Coleccion miColeccion = new Coleccion(10,10);
		miColeccion.generarContraseñas();
		miColeccion.mostrarContraseñas();*/
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		if (WordChecker.check_for_word(palabra.toLowerCase())) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

}
