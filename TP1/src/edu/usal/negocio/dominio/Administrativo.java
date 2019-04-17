package edu.usal.negocio.dominio;

public class Administrativo extends Empleado{
	
	public Administrativo() {}
	
	public Administrativo(int id, String nombre, String apellido, String direccion, int dni, double sueldo,
			Pabellon pabellon) {
		super(id, nombre, apellido, direccion, dni);
		this.sueldo = sueldo;
		this.pabellon = pabellon;
	}

	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Pabellon getPabellon() {
		return pabellon;
	}
	public void setPabellon(Pabellon pabellon) {
		this.pabellon = pabellon;
	}
	private double sueldo;
	private Pabellon pabellon;
	
	
}
