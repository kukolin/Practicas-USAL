package edu.usal.negocio.dominio;

public class Catedra {

	public Catedra() {}
	
	public Catedra(int id, String nombre, String tamaño, String cantidadMesas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.cantidadMesas = cantidadMesas;
	}
	
	private int id;
	private String nombre, tamaño, cantidadMesas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getCantidadMesas() {
		return cantidadMesas;
	}
	public void setCantidadMesas(String cantidadMesas) {
		this.cantidadMesas = cantidadMesas;
	}

	
	
	
	
	
}
