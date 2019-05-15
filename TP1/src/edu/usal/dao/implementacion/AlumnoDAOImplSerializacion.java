package edu.usal.dao.implementacion;

import java.io.*;
import java.util.*;

import edu.usal.negocio.dominio.Alumno;
import edu.usal.negocio.dto.interfaces.AlumnoDAO;

public class AlumnoDAOImplSerializacion implements AlumnoDAO {

	@Override
	public void AgregarAlumno(Alumno alumno) throws IOException {
		List<Alumno> alumno2= new ArrayList<Alumno>();
		try {
			 
			alumno2 = GetAll();
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
	}
	alumno2.add(alumno);
	
	FileOutputStream archsalida = new FileOutputStream(new File("alumno.dat"));
	ObjectOutputStream ouStream = new ObjectOutputStream(archsalida);
	ouStream.writeObject(alumno2);
	ouStream.close();
	}

	@Override
	public void EliminarAlumno(Alumno alumno) {
		

	}

	@Override
	public List<Alumno> GetAll() throws IOException {
		
		FileInputStream fileis=new FileInputStream(new File("Alumno.dat"));
		ObjectInputStream oiStream= new ObjectInputStream(fileis);
		
		List<Alumno> listadoalumno= new ArrayList<Alumno>();
		
		try {
			listadoalumno = (List<Alumno>) oiStream.readObject();

		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();

	}finally {		
		oiStream.close();
	}

	return listadoalumno;
}  
		
	@Override
	public void ModificarAlumno(Alumno alumno) {
		

	}

}
