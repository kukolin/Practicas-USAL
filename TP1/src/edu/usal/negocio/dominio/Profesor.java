package edu.usal.negocio.dominio;
import java.util.*;

public class Profesor extends Empleado {
	
	public Profesor(){}
	
	public Profesor(int id, String nombre, String apellido, String direccion, int dni, double sueldo,
			List<Catedra> catedras) {
		super(id, nombre, apellido, direccion, dni);
		this.sueldo = sueldo;
		this.catedras = catedras;
	}
	
	private double sueldo;

	private List<Catedra> catedras = new ArrayList<Catedra>();

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public List<Catedra> getCatedras() {
		return catedras;
	}

	public void setCatedras(List<Catedra> catedras) {
		this.catedras = catedras;
	}
	

}
