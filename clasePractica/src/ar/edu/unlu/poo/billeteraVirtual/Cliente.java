package ar.edu.unlu.poo.billeteraVirtual;

public class Cliente {
	private String nombre;
	private int idCliente;
	private CuentaCredito credito;
	private CuentaNormal cuentaNormal;

	private static int contadorID = 0;

	public Cliente(String nombre, int limite) {
		this.setNombre(nombre);
		this.contadorID++;
		this.setIdCliente(this.contadorID);
		credito = new CuentaCredito(limite);
		cuentaNormal = new CuentaNormal();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

}
