package edu.usal.dao.main;

import java.io.IOException;
import java.util.*;

import edu.usal.negocio.dominio.Profesor;
import edu.usal.negocio.dto.interfaces.ProfesorDAO;
import edu.usal.dao.factory.ProfesorFactory;


public class Principal {

	public static void main(String[] args) {
		
		Profesor profesor1 = new Profesor();
		profesor1.setApellido("Lopez");
		profesor1.setNombre("Maxi");
		profesor1.setDni(123456);
		profesor1.setDireccion("Santafe");
		
		ProfesorDAO impDAO = ProfesorFactory.GetImplementation("Serializacion");
		
		try {
			
			impDAO.AgregarProfesor(profesor1);	
			profesor1.setApellido("otro");
			profesor1.setNombre("amigo");
			impDAO.AgregarProfesor(profesor1);
			
			List <Profesor> listadoprofesor = impDAO.GetAll();
			
			for(Profesor profe : listadoprofesor) {
				System.out.println(profe.getApellido()+ " "+profe.getNombre());
			}
			
			
		}catch(IOException e) {
			
			e.printStackTrace();	
		}
		
		
		

	}

}
