package com.liskov.banco.entidades;

public class CuentaBancariaBasica extends CuentaBancaria {

	private double saldo;
	
	@Override
	public void depositar(double monto) {
		this.saldo += monto;
	}

	@Override
	public boolean retirar(double monto) {
		if(this.saldo >= 0 && this.saldo < monto) {
			this.saldo -= monto;
			return true;
		}else {
			return false;
		}
	}

}
