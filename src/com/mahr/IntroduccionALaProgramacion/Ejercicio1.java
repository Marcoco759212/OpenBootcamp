package com.mahr.IntroduccionALaProgramacion;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/** Primera parte - uso de la función suma */
		float result = sumaNumeros(10, 5, 7);
		System.out.println("El resultado de la suma es: "+result);
		/** fin del uso de la función suma*/
		
		/** Segunda parte - agregar puertas a la clase Coche*/
		Coche coche = new Coche();
		System.out.println("\nActualmente el coche tiene " + coche.getNumPuertas() + " puertas\n");
		
		System.out.println("Se agregagn 2 puertas al coche");
		coche.addNumPurtas(2);
		System.out.println("Ahora el numero de puertas es: "+ coche.getNumPuertas());
		;
		/** fin del uso de la clase coche*/
	}
	
	//Primera parte - función suma
	public static float sumaNumeros(float num1, float num2, float num3) {
		return (num1 + num2 + num3);
	}
}

//Segunada parte - clase coche
class Coche{
	private int numPuertas = 2;

	public int getNumPuertas() {
		return numPuertas;
	}

	public void addNumPurtas(int numPuertas) {
		this.numPuertas = this.numPuertas + numPuertas;
	}	
}