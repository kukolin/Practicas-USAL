package edu.usal.negocio.dominio;

public class Pabellon {
	
	
	public Pabellon(){}

	public Pabellon(int id, String tamaño, String direccion) {
		super();
		this.id = id;
		this.tamaño = tamaño;
		this.direccion = direccion;
	}


	private int id;
	private String tamaño, direccion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
	
	
}
