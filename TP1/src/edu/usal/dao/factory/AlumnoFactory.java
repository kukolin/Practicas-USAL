package edu.usal.dao.factory;

import edu.usal.negocio.dto.interfaces.AlumnoDAO;
import edu.usal.dao.implementacion.*;

public class AlumnoFactory {
	
	public static AlumnoDAO GetImplementation(String source) {
		
		
		if (source.equals("Archivo")) {
			return new AlumnoDAOimplArchivo();
		}
		else if(source.equals("Serializacion")) {
			
			return new AlumnoDAOImplSerializacion();
		}
		return null;
	}
	
	


	}

