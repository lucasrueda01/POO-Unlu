package ar.unlu.poo.SistemaDeBiblioteca;

public class Diario extends Publicacion {

	private int mesPublicacion;
	private int diaPublicacion;

	public Diario(String Titulo, String Editor, int Año, int Mes, int Dia) {
		this.setNombre(Titulo);
		this.setEditor(Editor);
		this.setAñoPublicacion(Año);
		this.setMesPublicacion(Mes);
		this.setDiaPublicacion(Dia);
	}

	public int getMesPublicacion() {
		return mesPublicacion;
	}

	public void setMesPublicacion(int mesPublicacion) {
		this.mesPublicacion = mesPublicacion;
	}

	public int getDiaPublicacion() {
		return diaPublicacion;
	}

	public void setDiaPublicacion(int diaPublicacion) {
		this.diaPublicacion = diaPublicacion;
	}

	public String Descripcion() {
		return "El diario " + this.getNombre() + " del editor " + this.getEditor() + " de la fecha "
				+ this.getDiaPublicacion() + "/" + this.getMesPublicacion() + "/" + this.getAñoPublicacion();
	}
}
