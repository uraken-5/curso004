package com.wallet.ejecucion;

import com.wallet.entidades.Cuenta;

public class Main {

	public static void main(String[] args) {
		
		//creacion mediante teclado
		Cuenta billetera1 = Cuenta.crearCuentaDesdeTeclado();
		billetera1.mostrarInformacion();
		
		System.out.println("---------------------------------");
		
		//creacion mediante constructor vacio (por defecto)
		Cuenta billetera2 = new Cuenta();
		billetera2.mostrarInformacion();
		
		System.out.println("---------------------------------");
		//creacion con constructor explicito
		Cuenta billetera3 = new Cuenta(90,"Eduardo",1000);
		billetera3.mostrarInformacion();
		
	}

}
