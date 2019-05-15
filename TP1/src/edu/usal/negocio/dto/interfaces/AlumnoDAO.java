package edu.usal.negocio.dto.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import edu.usal.negocio.dominio.Alumno;

public interface AlumnoDAO {
	
	public void AgregarAlumno(Alumno alumno) throws IOException;
	
	void EliminarAlumno(Alumno alumno);
	
	List<Alumno>GetAll() throws IOException;
	
	void ModificarAlumno(Alumno alumno);

}
