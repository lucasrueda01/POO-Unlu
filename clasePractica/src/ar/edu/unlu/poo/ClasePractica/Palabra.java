package ar.edu.unlu.poo.ClasePractica;

public class Palabra {
	private String palabra;
	private final char[] letras_especiales = {'k','z','x','y','w','q'};
	
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public Palabra(String Palabra) {
		this.palabra = palabra;
	}
	
	public boolean esValido() {
		return (WordChecker.check_for_word(this.getPalabra().toLowerCase()));
	}
	
	
	
}
