package com.mahr.EjercicioTema9;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Objeto cliente
		Cliente cliente = new Cliente();
		cliente.setNombre("Esteban");
		cliente.setEdad(18);
		cliente.setTelefono("1234567890");
		cliente.setCredito(true);
		
		//imprime objeto cliente
		System.out.println("Los datos del cliente son: \n"+
		"\nNombre:   "+cliente.getNombre()+
		"\nEdad:     "+cliente.getEdad()+
		"\nTelefono: "+cliente.getTelefono()+
		"\nCrédito:  "+ cliente.isCredito());
		
		//Objeto trabajador
		Trabajador trabajador = new Trabajador();
		trabajador.setNombre("Esteban");
		trabajador.setEdad(18);
		trabajador.setTelefono("1234567890");
		trabajador.setSalario(100);
				
		//imprime objeto trabajador
		System.out.println("\n\nLos datos del trabajador son: \n"+
		"\nNombre:   "+trabajador.getNombre()+
		"\nEdad:     "+trabajador.getEdad()+
		"\nTelefono: "+trabajador.getTelefono()+
		"\nSalario:  "+ trabajador.getSalario());
			
	}
}

class Persona {
	private String nombre;
	private int edad;
	private String telefono;
	
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

class Cliente extends Persona{
	private boolean credito;
	
	public boolean isCredito() {
		return credito;
	}

	public void setCredito(boolean credito) {
		this.credito = credito;
	}
}

class Trabajador extends Persona {
	private float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}