package edu.usal.dao.factory;

import edu.usal.negocio.dto.interfaces.ProfesorDAO;
import edu.usal.dao.implementacion.*;

public class ProfesorFactory {

	public static ProfesorDAO GetImplementation(String source) {
		
		if (source.equals("Archivo")) {
			return new ProfesorDAOimplArchivo();
		}
		return null;
	}
	
	
}
