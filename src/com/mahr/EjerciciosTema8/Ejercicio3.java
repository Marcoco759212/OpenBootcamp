package com.mahr.EjerciciosTema8;

public class Ejercicio3 {
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Juanito");
		persona.setEdad(18);
		persona.setTelefono("1234567890");
		
		System.out.println("imprimiendo la clase persona:\n");
		System.out.println("  -Nombre:   " + persona.getNombre());
		System.out.println("  -Edad:     " + persona.getEdad());
		System.out.println("  -Telefono: " + persona.getTelefono());
	}
}

class Persona {
	private String nombre = "";
	private int edad = 0;
	private String telefono = "";
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}