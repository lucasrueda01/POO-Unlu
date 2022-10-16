package ar.unlu.poo.SistemaDeBiblioteca;

public abstract class Escrito extends Publicacion {
	private int NumPaginas;
	private int Ejemplares;
	private int EjemplaresPrestados;
	private static int cantTotalPrestamos;

	public boolean Prestable() {
		return (this.Ejemplares > 1);
	}

	public void Prestar() {
		this.Ejemplares--;
		this.EjemplaresPrestados++;
		Escrito.cantTotalPrestamos++;
	}

	public abstract String Descripcion();

	public int getNumPaginas() {
		return NumPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		NumPaginas = numPaginas;
	}

	public int getEjemplares() {
		return Ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		Ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return EjemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		EjemplaresPrestados = ejemplaresPrestados;
	}

	public static int getCantTotalPrestamos() {
		return cantTotalPrestamos;
	}

	public static void setCantTotalPrestamos(int cantTotalPrestamos) {
		Escrito.cantTotalPrestamos = cantTotalPrestamos;
	}

}
