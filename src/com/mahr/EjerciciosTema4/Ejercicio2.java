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
	
	//condición que compare si la variable numeroIf es positivo, negativo, o 0.
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
	 * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile 
	 * sea inferior a 3, el bloque de código que tendrá el bucle deberá:

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
	
	/** crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que 
	 * la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute
	 * y deberá mostrarse por pantalla. 
	 */
	public static void bucleFOR() {
		for(int numeroFor = 0; numeroFor <= 3; numeroFor ++) {
			System.out.println("valor de numeroFor = "+numeroFor);
		}
	}
	
	/** crear la variable estacion, y distintos case para las cuatro estaciones del año. 
	 * Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
	 * de la estación en la que está. También habrá que poner un default para cuando el valor de la 
	 * variable no sea una estación.
	 */
	public static void condicionSWITCH(int estación) {
		String mensaje = "La estación que seleccionaste es: ";
		String result = "";
		switch (estación) {
		case 1:
			result = "Primavera";
			break;
		case 2:
			result = "Verano";
			break;
		case 3:
			result = "Otoño";
			break;
		case 4:
			result = "Invierno";
			break;

		default:
			mensaje = "La opcion que seleccionaste no corresponde a las estaciones del año";
			result = "\nSelecciona cualquira de las siguientes estaciones "+
			"\n1 Primavera \n2 Verano \n3 Otoño \n4 Invierno"; 
			break;
		}
		
		System.out.println(mensaje + result);
	}
}
