package com.liskov.banco.entidades;

public abstract class CuentaBancaria {
	
	public abstract void depositar(double monto);
	
	public abstract boolean retirar(double monto);
		
}
