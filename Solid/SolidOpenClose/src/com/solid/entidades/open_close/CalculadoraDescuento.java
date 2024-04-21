package com.solid.entidades.open_close;

public class CalculadoraDescuento implements Calculadora {

	/**
	 * Metodo que reduce en un 10% el valor del
	 * precio oferta
	 */
	@Override
	public double calcularPrecio(Oferta oferta) {
		return oferta.getSuperPrecio() * 0.9;
	}
	
}
