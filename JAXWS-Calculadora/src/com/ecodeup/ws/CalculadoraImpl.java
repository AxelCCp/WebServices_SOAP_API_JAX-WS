package com.ecodeup.ws;

import javax.jws.WebService;


//AQUÍ INICAMOS DONDE ESTA LA INTERFAZ QUE DEFINE EL MÉTODO QUE VAMOS A EXPONER. 
@WebService(endpointInterface="com.ecodeup.ws.Calculadora") 
public class CalculadoraImpl implements Calculadora {

	@Override
	public double operacion(int opcion, int valor1, int valor2) {
		// TODO Auto-generated method stub
		double resultado=0;
		
		
		switch(opcion) {
			case 1:
				resultado = valor1 + valor2;
				break;
			case 2:
				resultado = valor1 - valor2;
				break;
			case 3:
				resultado = valor1 * valor2;
				break;
			case 4:
				resultado = valor1 / valor2;
				break;
		}
		return resultado;
	}

}
