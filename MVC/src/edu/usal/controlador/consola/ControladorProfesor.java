package edu.usal.controlador.consola;

import java.io.IOException;
import java.util.List;

import edu.usal.dao.factory.ProfesorFactory;
import edu.usal.negocio.dominio.Profesor;
import edu.usal.vista.consola.VistaProfesor;
import edu.usal.negocio.dto.interfaces.ProfesorDAO;

public class ControladorProfesor {

	private VistaProfesor vista;
	private ProfesorDAO profesorDAO;
	
	public ControladorProfesor(VistaProfesor vista) {
		super();
		this.vista = vista;
		this.profesorDAO = ProfesorFactory.GetImplementation("Archivo");
		
	}
	
	public void AgregarProfesor() throws IOException{
		
		this.profesorDAO.AgregarProfesor(vista.AltaProfesor());
		
	}
	
	public void Todos() throws IOException{
		vista.imprimirTodos(this.profesorDAO.GetAll());
	}
	
	public void MostrarMenu() throws IOException {
		boolean fin = false;
		while(!fin) {
			
			int opcion = vista.menu();
			
			switch(opcion){
			case 1:
				this.AgregarProfesor();
			break;
			
			case 2:
				this.Todos();
				break;
				
			case 3:
				fin = true;
				break;
			default:
				System.out.println("Opcion no válida.");
			}
			
		}
		
	}
	
	
}
