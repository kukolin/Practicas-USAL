package edu.usal.Principal;

import java.io.IOException;

import edu.usal.controlador.consola.ControladorProfesor;
import edu.usal.vista.consola.VistaProfesor;

public class main {

	public static void main(String[] args) throws IOException {

		VistaProfesor vista = new VistaProfesor();
		ControladorProfesor controladorProf = new ControladorProfesor(vista);
		
		controladorProf.MostrarMenu();
		
	}

}
