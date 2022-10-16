package ar.unlu.poo.SistemaDeBiblioteca;

public class Revista extends Escrito {
	private String ISSN;
	private int Numero;

	public Revista(String Titulo, String Editor, String ISSN, Integer num_pags, Integer Ejemplares,
			Integer EjemplaresPrestados, int Año, int Numero) {
		this.setNombre(Titulo);
		this.setEditor(Editor);
		this.ISSN = ISSN;
		this.setNumPaginas(num_pags);
		this.setEjemplares(Ejemplares);
		this.setEjemplaresPrestados(EjemplaresPrestados);
		this.setAñoPublicacion(Año);
		this.setNumero(Numero);
	}

	public Revista(String Titulo, String Editor, Integer num_pags, Integer Ejemplares, int Año, int Numero) {
		this(Titulo, Editor, "", num_pags, Ejemplares, 0, Año, Numero);
	}

	public String getISSN() {
		return ISSN;
	}

	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String Descripcion() {
		return "La revista " + this.getNombre() + " con numero " + this.getNumero() + " del editor " + this.getEditor() + " del año " + this.getAñoPublicacion()
				+ ", tiene " + this.getNumPaginas() + ", quedan " + this.getEjemplares() + " disponibles y se prestaron "
				+ this.getEjemplaresPrestados();
	}

}
