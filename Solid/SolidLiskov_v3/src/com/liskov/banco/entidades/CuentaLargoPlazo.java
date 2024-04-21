package com.liskov.banco.entidades;

public class CuentaLargoPlazo extends CuentaBancaria {

	private double saldo;
	
	@Override
	public void depositar(double monto) {
		this.saldo += monto;

	}

	@Override
	public boolean retirar(double monto) {
		throw new UnsupportedOperationException("No se permite la operacion");
	}
}
