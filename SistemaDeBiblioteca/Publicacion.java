package ar.unlu.poo.SistemaDeBiblioteca;

public abstract class Publicacion {
	protected String Nombre;
	protected String Editor;
	protected String NumeroContacto;
	protected int AñoPublicacion;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEditor() {
		return Editor;
	}
	public void setEditor(String editor) {
		Editor = editor;
	}
	public String getNumeroContacto() {
		return NumeroContacto;
	}
	public void setNumeroContacto(String numeroContacto) {
		NumeroContacto = numeroContacto;
	}
	public int getAñoPublicacion() {
		return AñoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		AñoPublicacion = añoPublicacion;
	}
	
	
}
