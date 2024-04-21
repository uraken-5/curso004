package com.liskov.entidades;

public class Jote extends Perro {

	@Override
	public void comer() {
		System.out.println("El jote esta comiendo");
	}
	
	@Override
	public void moverse() {
		System.out.println("eL jote esta volando");
	}
	
}
