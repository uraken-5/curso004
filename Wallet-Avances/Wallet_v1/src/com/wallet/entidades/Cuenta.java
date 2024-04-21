package com.wallet.entidades;

public class Cuenta {
	private int numeroCuenta;
	private String titular;
	private double saldo;
	
	public Cuenta(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//metodo para mostrar info de la cuenta
	public void mostrarInformacion(){
		System.out.println("Numero de cuenta:  " + numeroCuenta);
		System.out.println("Titular : " + titular);
		System.out.println("Saldo: " + saldo);
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
