package ar.edu.unlu.poo.billeteraVirtual;

public class CuentaCredito {
	private double limiteGasto;
	private double saldoDeudor;
	private Compra[] compras;

	public CuentaCredito(double limite) {
		this.limiteGasto = limite;
		this.saldoDeudor = 0;
	}
}
