package edu.usal.negocio.dominio;

public class Carrera {

	public Carrera() {}
	
	
	public Carrera(int id, int cantidadMaterias, int catidadAños) {
		super();
		this.id = id;
		this.cantidadMaterias = cantidadMaterias;
		this.catidadAños = catidadAños;
	}


	private int id, cantidadMaterias, catidadAños;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadMaterias() {
		return cantidadMaterias;
	}

	public void setCantidadMaterias(int cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}

	public int getCatidadAños() {
		return catidadAños;
	}

	public void setCatidadAños(int catidadAños) {
		this.catidadAños = catidadAños;
	}
	
	
	
	
	
	
}
