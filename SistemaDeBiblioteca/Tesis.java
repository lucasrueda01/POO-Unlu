package ar.unlu.poo.SistemaDeBiblioteca;

public class Tesis extends Publicacion {
	private String Autor;
	private int MesPublicacion;
	
	public Tesis(String Titulo, String Autor, String Editor, int Año, int Mes) {
		this.setNombre(Titulo);
		this.setAutor(Autor);
		this.setEditor(Editor);
		this.setMesPublicacion(Mes);
		this.setAñoPublicacion(Año);
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getMesPublicacion() {
		return MesPublicacion;
	}

	public void setMesPublicacion(int mesPublicacion) {
		MesPublicacion = mesPublicacion;
	}
	
	public String Descripcion() {
		return "La tesis " + this.getNombre() + " del autor " + this.getAutor() + " del editor " + this.getEditor()
				+ " del mes " + this.getMesPublicacion() + " del año " + this.getAñoPublicacion();
	}
}
