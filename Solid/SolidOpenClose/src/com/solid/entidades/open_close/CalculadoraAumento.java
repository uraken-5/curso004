package com.solid.entidades.open_close;

public class CalculadoraAumento implements Calculadora {

	/**
	 * Metodo que aumenta en un 1'% el precio
	 */
	@Override
	public double calcularPrecio(Oferta oferta) {
		return oferta.getSuperPrecio() * 1.1;
	}

}
