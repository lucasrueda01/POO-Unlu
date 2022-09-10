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
		LocalDate mifecha = LocalDate.of(2022, 9, 8);
		LocalDate mifecha2 = LocalDate.of(2022, 9, 6);
		Tarea miTarea = new Tarea(
				"Hacer compras",
				"Ir al supermercado mañana a hacer compras",
				1, mifecha);
		miTarea.mostrarTarea();
		
		Tarea miTarea2 = new Tarea(
				"Repuesto",
				"Consultar repuesto del auto",
				1, mifecha2);
		miTarea2.completar();
		miTarea2.mostrarTarea();
		
		Tarea miTarea3 = new Tarea(
				"Cine",
				"Ir al cine",
				2, mifecha2);
		miTarea3.mostrarTarea();
	}

}
