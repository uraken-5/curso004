package com.liskov.principal;

import com.liskov.entidades.Jote;
import com.liskov.entidades.Perro;

public class Main {

	public static void main(String[] args) {
		
		//creamos instancias
		Perro perro = new Perro();
		Jote jote = new Jote();
		
		System.out.println("Interactuando con el perro");
		perro.comer();
		perro.moverse();
		
		System.out.println("Interactuando con el jote");
		jote.comer();
		jote.moverse();
		
	}

}
