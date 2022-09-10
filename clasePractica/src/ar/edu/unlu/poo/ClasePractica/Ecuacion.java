package ar.edu.unlu.poo.ClasePractica;
import java.lang.Math;

public class Ecuacion {
	
	private int coeficienteA;
	private int coeficienteB;
	private int coeficienteC;
	
	public Ecuacion(int a,int b,int c) {
		this.coeficienteA = a;
		this.coeficienteB = b;
		this.coeficienteC = c;
	}
	
	public int getcoeficienteA() {
		return this.coeficienteA;
	}

	public int getcoeficienteB() {
		return this.coeficienteB;
	}
	
	public int getcoeficienteC() {
		return this.coeficienteC;
	}
	
	public void setcoeficienteA(int a) {
		this.coeficienteA = a;
	}
	
	public void setcoeficienteB(int b) {
		this.coeficienteB = b;
	}
	
	public void setcoeficienteC(int c) {
		this.coeficienteC = c;
	}

	public int discriminante() {
		return (int) (Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC);
	}
	
	private double[] resolverSegundoGrado() {
		int d = this.discriminante();
		double res[] = new double[2];
		if (d == 0) {
			res[0] = (double) ((-this.coeficienteB)/(2 * this.coeficienteA));
		} else if (d > 0) {
			res[0] = (double) ((-this.coeficienteB + Math.sqrt(d))/(2 * this.coeficienteA));
			res[1] = (double) ((-this.coeficienteB - Math.sqrt(d))/(2 * this.coeficienteA));
		}
		return res;
	}
	
	public void mostrarRaices() {
		if (this.discriminante() == 0) {
			System.out.println("Resultado de una raiz: " + this.resolverSegundoGrado()[0]);
		} else if (this.discriminante() > 0) {
			System.out.println("Resultado de dos raices: " + this.resolverSegundoGrado()[0] + " y " + this.resolverSegundoGrado()[1]);;
		} else {
			System.out.println("El resultado esta en el conjunto de numeros imaginarios");
		}
	}
}
