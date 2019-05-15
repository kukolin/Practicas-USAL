package edu.usal.dao.implementacion;
//hola

import java.io.*;
import java.util.*;

import edu.usal.negocio.dominio.Profesor;
import edu.usal.negocio.dto.interfaces.ProfesorDAO;

public class ProfesorDAOImplSerializacion implements ProfesorDAO {

	@Override
	public void AgregarProfesor(Profesor profesor) throws IOException {
		
		List<Profesor> profesor2 = new ArrayList<Profesor>();
		try {
			
			profesor2 = GetAll();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		profesor2.add(profesor);
		
		FileOutputStream archsalida = new FileOutputStream(new File("profesor.dat"));
		ObjectOutputStream ouStream = new ObjectOutputStream(archsalida);
		ouStream.writeObject(profesor2);
		ouStream.close();
	
		
	}

	@Override
	public void EliminarProfesor(Profesor profesor) {
		
		
	}

	@Override
	public List<Profesor> GetAll() throws IOException {
		
		FileInputStream fileis = new FileInputStream(new File("profesor.dat"));
		ObjectInputStream oiStream = new ObjectInputStream(fileis);
		List<Profesor> listadoprofesor = new ArrayList<Profesor>();
			
				try {					
					List<Profesor> readObject = (List<Profesor>) oiStream.readObject();
					listadoprofesor = readObject;

				}catch(ClassNotFoundException ex) {
					ex.printStackTrace();

			}finally {		
				oiStream.close();
			}
		
			return listadoprofesor;
	}  

	@Override
	public void ModificarProfesor(Profesor profesor) {

		
	}

}
