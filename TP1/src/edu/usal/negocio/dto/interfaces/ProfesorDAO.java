package edu.usal.negocio.dto.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import edu.usal.negocio.dominio.Profesor;

public interface ProfesorDAO{

	public void AgregarProfesor(Profesor profesor) throws IOException;
	
	void EliminarProfesor(Profesor profesor);
	
	List<Profesor> GetAll() throws IOException;
	
	void ModificarProfesor(Profesor profesor);
	
}
