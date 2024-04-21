package com.liskov.banco.entidades;

public class CuentaBancariaPremium extends CuentaBancaria {

	private double saldo;
	private int puntosPrefiero;
	
	@Override
	public void depositar(double monto) {
		this.saldo += monto;
		incrementarPuntosPrefiero();

	}

	@Override
	public boolean retirar(double monto) {
		if(this.saldo >= 0 && this.saldo < monto) {
			this.saldo -= monto;
			incrementarPuntosPrefiero();
			return true;
		}else {
			return false;
		}
	}
	
	private void incrementarPuntosPrefiero() {
		this.puntosPrefiero++;
	}

}
