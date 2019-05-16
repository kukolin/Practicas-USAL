package edu.usal.vista.consola;

import java.util.List;

import edu.usal.negocio.dominio.Profesor;
import edu.usal.util.IOGeneral;

public class VistaProfesor {

	public int menu() {
		System.out.println("1-Agregar");
		System.out.println("2-Todos");
		System.out.println("3-Salir");
		return IOGeneral.leerInt("Ingrese una opcion", "Solo numeros");

	}
	
	
	
	public Profesor AltaProfesor() {
		
		
		
		Profesor profesor = new Profesor();
		
		profesor.setId(IOGeneral.leerInt("ingrese un id","Error x"));
		profesor.setApellido(IOGeneral.leerLinea("Ingrese apellido"));
		profesor.setNombre(IOGeneral.leerLinea("ingrese un Nombre"));
		profesor.setDireccion(IOGeneral.leerLinea("ingrese una Direccion"));
		profesor.setDni(IOGeneral.leerInt("ingrese un dni","Error x"));
		profesor.setSueldo(IOGeneral.leerDouble("ingrese un sueldo","Error x"));

		
		
		return profesor;
		
		
		
	}



	public void imprimirTodos(List<Profesor> listado) {

		for(Profesor profesor : listado) {
			
			System.out.println(profesor.getApellido());
			//Agregar todos los getters...
			
		}
		
	}
	
	
	
}
