package ar.unlu.poo.SistemaDeBiblioteca;

import java.util.ArrayList;

public class Libro extends Escrito {
	private String ISBN;
	private ArrayList<String> Autores = new ArrayList<String>();

	public Libro(String Titulo, String Autor, String Editor, String ISBN, Integer num_pags, Integer Ejemplares,
			Integer EjemplaresPrestados, int Año) {
		this.setNombre(Titulo);
		this.setEditor(Editor);
		this.setAutor(Autor);
		this.ISBN = ISBN;
		this.setNumPaginas(num_pags);
		this.setEjemplares(Ejemplares);
		this.setEjemplaresPrestados(EjemplaresPrestados);
		this.setAñoPublicacion(Año);
	}

	public Libro(String Titulo, String Autor, String Editor, Integer num_pags, Integer Ejemplares, int Año) {
		this(Titulo, Autor, Editor, "", num_pags, Ejemplares, 0, Año);
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public ArrayList<String> getAutores() {
		return Autores;
	}

	public void setAutor(String autor) {
		Autores.add(autor);
	}

	public String getAutoresString() {
		String s = "";
		for (String autor : this.getAutores()) {
			s = s + autor + " ";
		}
		return s;
	}

	public String Descripcion() {
		return "El libro " + this.getNombre() + " del editor " + this.getEditor() + " de "
				+ this.getAutoresString() + " del año " + this.getAñoPublicacion() + " , tiene " + this.getNumPaginas() + " , quedan " + this.getEjemplares()
				+ " disponibles y se prestaron " + this.getEjemplaresPrestados();
	}

}
