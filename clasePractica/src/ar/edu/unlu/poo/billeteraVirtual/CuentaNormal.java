package ar.edu.unlu.poo.billeteraVirtual;

import java.time.LocalDate;

public class CuentaNormal {
	private double saldo;
	private double limiteDescubierto;
	private double montoInvertido;
	private double montoTotal;
	private LocalDate fechaDevolucionInversion;
	private boolean yaInvirtio;
	private Cliente titular;
}
