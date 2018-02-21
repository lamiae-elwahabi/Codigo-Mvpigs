package org.mvpig.bookJavaFundamentals;

public class Lamiae {
	//Propiedades
	private String nombre = "";
	private String apellido = "";
	private int talla = 0;
	private double peso = 0.0;
	//Constructores
	public Lamiae(String nombre, String apellido, int talla, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.talla = talla;
		this.peso = peso;
	}
	public Lamiae() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
