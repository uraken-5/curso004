package com.wallet.ejecucion;

import com.wallet.entidades.Cliente;
import com.wallet.entidades.Cuenta;

public class Main {

	public static void main(String[] args) {
		
		//Crear un cliente con una cuenta existente
		Cuenta billetera1 = new Cuenta(12345, "Juanito", 100);
		Cliente cliente1 = new Cliente(1, "Max", billetera1);
		//mostrar informcion del cliente y su cuenta
		cliente1.mostrarInformacion();
		
	}

}
