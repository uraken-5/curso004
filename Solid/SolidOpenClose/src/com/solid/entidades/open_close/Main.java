package com.solid.entidades.open_close;

public class Main {

	public static void main(String[] args) {
		
		CalculadoraAumento aumento = new CalculadoraAumento();
		Oferta oferta = new Oferta();
		oferta.setSuperPrecio(1000);
		System.out.println(aumento.calcularPrecio(oferta));
	}

}
