package ar.edu.unlu.poo.ClasePractica;

import java.time.LocalDate;

public class Tarea {
	
	private String nombre;
	private String descripcion;
	private int prioridad;
	private Estado estado;
	private LocalDate fechaLimite;
	private LocalDate fechaRecordatorio;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public LocalDate getFechaRecordatorio() {
		return fechaRecordatorio;
	}

	public void setFechaRecordatorio(LocalDate fechaRecordatorio) {
		this.fechaRecordatorio = fechaRecordatorio;
	}

	
	public Tarea(String nombre, String descripcion, int prioridad, LocalDate fechaLimite) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.fechaLimite = fechaLimite;
		this.estado = Estado.PENDIENTE;
		this.verificarFechaLimite();
	}

	public void completar() {
		this.setEstado(Estado.COMPLETA);
	}
	
	public boolean estaVencida() {
		if(estado == Estado.VENCIDA) {
			return true;
		} else {
			return false;
		}}
		
	public boolean estaCompleta() {
		if(estado == Estado.COMPLETA) {
			return true;
		} else {
			return false;
		}
	}
	
	public void verificarFechaLimite() {
		LocalDate fechaActual = LocalDate.now();
		if (fechaActual.isAfter(fechaLimite) && (this.getEstado() == Estado.PENDIENTE)){
			estado = Estado.VENCIDA;
		}
	}
		
	public void mostrarTarea() {
		String s = "";
		LocalDate fechaActual = LocalDate.now();
		if (this.getFechaRecordatorio().isAfter(fechaActual) || (this.getFechaRecordatorio().isEqual(fechaActual))) {
			s = s + "(Por vencer) ";
		} else {
			switch(this.getEstado()) {
				case PENDIENTE: s = s + "(Pendiente) ";
				break;
				case COMPLETA: s = s + "(Completa) ";
				break;
				case VENCIDA: s = s + "(Vencida) ";
				break;
		}
		s = s + this.getDescripcion();
		System.out.println(s);
		}
	}


		
	
}
