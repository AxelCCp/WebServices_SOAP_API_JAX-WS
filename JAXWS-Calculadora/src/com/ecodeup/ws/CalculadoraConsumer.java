package com.ecodeup.ws;

//CLASE QUE CONSUME EL SERVICIO

public class CalculadoraConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREAMOS OBJ DE LA CLASE QUE GENER� JAVA A TRAV�S DE LA CMD. CLASE : CalculadoraImplService ,,, PARA PODER...
		//CONSUMIR LOS SERVICIOS.
		
		CalculadoraImplService calculadoraService = new CalculadoraImplService();
		
		//TMBN CREAMOS OBJ DE LA INTERFAZ PARA ACCEDER AL M�TODO.
		//CON calculadoraService LLAMAMOS A LOS M�TODOS QUE GENER� JAVA EN CalculadoraImplService 
		Calculadora consumer = calculadoraService.getCalculadoraImplPort();
		
		System.out.println("Suma");
		System.out.println(consumer.operacion(1, 6, 4));
		
		System.out.println("Resta");
		System.out.println(consumer.operacion(2, 6, 4));
		
		System.out.println("Multiplicaci�n");
		System.out.println(consumer.operacion(3, 6, 4));
		
		System.out.println("Divisi�n");
		System.out.println(consumer.operacion(4, 10, 5));
		
		//FINALMENTE EJECUTAMOS LA CLASE PARA CONSUMIR EL SEVICIO.
		//PARA QUE EL PROGRAMA FUNCIONE, HAY QUE EJECUTAR PRIMERO LA CLASE CalculadoraPublish Y DESPU�S ESTA, 
		//PARA QUE EST� DISPONIBLE EL WSDL.
		
	}

}
