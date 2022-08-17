package com.mahr.EjerciciosTema4;

public class Ejercicio2 {
	public static void main(String[] args) {
		/** prueba del condicional if*/
		System.out.println("El valor ingresado es un: "+condicionIF(-1));
		/** fin de prueba*/
		
		/** prueba del bucle while*/
		System.out.println("\nEjecutando bucle while");
		bucleWHILE();
		/** fin de prueba*/
		
		/** prueba del bucle do-while*/
		System.out.println("\nEjecutando bucle do while");
		bucleDOWHILE();
		/** fin de prueba*/
		
		/** prueba del bucle for*/
		System.out.println("\nEjecutando bucle for");
		bucleFOR();
		/** fin de prueba*/
		
		/** prueba del condicional switch case*/
		System.out.println("\nEjecutando el condicional switch case");
		condicionSWITCH(5);
		/** fin de prueba*/
		
	}
	
	//condici�n que compare si la variable numeroIf es positivo, negativo, o 0.
	public static String condicionIF(int num) {
		String result = "";
		if(num == 0) {
			result = "0";
		}
		if (num < 0) {
			result = "negativo";
		}
		if (num > 0) {
			result = "positivo";
		}
		
		return result;
	}
	
	/**
	 * Crea un bucle While, este bucle tendr� que tener como condici�n que la variable numeroWhile 
	 * sea inferior a 3, el bloque de c�digo que tendr� el bucle deber�:

		-Incrementar el valor de la variable en uno cada vez que se ejecute.
		-Mostrarlo por pantalla cada vez que se ejecute.
		
	 */
	public static void bucleWHILE() {
		int numeroWhile = 0;
		while(numeroWhile < 3) {
			System.out.println("valor de numroWhile = "+numeroWhile);
			numeroWhile++;
		}
		
	}
	
	//crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
	public static void bucleDOWHILE() {
		int numeroWhile = 10;
		do {
			System.out.println("Valor de numeroWhile = "+numeroWhile);
		}while(numeroWhile < 3);
	}
	
	/** crea una variable numeroFor, esta variable tendr� como valor 0 y su condici�n ser� que 
	 * la variable sea igual o menor que 3, se ir� incrementando en 1 su valor cada vez que se ejecute
	 * y deber� mostrarse por pantalla. 
	 */
	public static void bucleFOR() {
		for(int numeroFor = 0; numeroFor <= 3; numeroFor ++) {
			System.out.println("valor de numeroFor = "+numeroFor);
		}
	}
	
	/** crear la variable estacion, y distintos case para las cuatro estaciones del a�o. 
	 * Dependiendo del valor de la variable estacion se deber� mandar un mensaje por consola informando
	 * de la estaci�n en la que est�. Tambi�n habr� que poner un default para cuando el valor de la 
	 * variable no sea una estaci�n.
	 */
	public static void condicionSWITCH(int estaci�n) {
		String mensaje = "La estaci�n que seleccionaste es: ";
		String result = "";
		switch (estaci�n) {
		case 1:
			result = "Primavera";
			break;
		case 2:
			result = "Verano";
			break;
		case 3:
			result = "Oto�o";
			break;
		case 4:
			result = "Invierno";
			break;

		default:
			mensaje = "La opcion que seleccionaste no corresponde a las estaciones del a�o";
			result = "\nSelecciona cualquira de las siguientes estaciones "+
			"\n1 Primavera \n2 Verano \n3 Oto�o \n4 Invierno"; 
			break;
		}
		
		System.out.println(mensaje + result);
	}
}
