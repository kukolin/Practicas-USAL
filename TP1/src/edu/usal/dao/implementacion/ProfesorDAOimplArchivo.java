package edu.usal.dao.implementacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dominio.Profesor;
import edu.usal.negocio.dto.interfaces.*;

public class ProfesorDAOimplArchivo implements ProfesorDAO {
	
	private File archivo;
	private FileWriter archivoWriter;
	private FileReader archivoReader;
	private BufferedWriter archivoBufferedWriter;
	private BufferedReader archivoBufferedReader;

	@Override
	public void AgregarProfesor(Profesor profesor) throws IOException {
		
		archivo = new File("profesor.txt");
		archivoWriter = new FileWriter(archivo);
		archivoBufferedWriter = new BufferedWriter(archivoWriter);
		
		String str = SaveProfesor(profesor);
		
		archivoBufferedWriter.write(str);
		archivoBufferedWriter.close();
		archivoWriter.close();
		
		
		
	}
	
	private String SaveProfesor(Profesor profesor){
		return profesor.getApellido() + ";" + profesor.getNombre() + "\n";
	}
	
	@Override
	public void EliminarProfesor(Profesor profesor) {}
	
	@Override
	public List<Profesor> GetAll() throws IOException{
		
		archivo = new File("profesor.txt");
		archivoReader = new FileReader(archivo);
		archivoBufferedReader = new BufferedReader(archivoReader);
		
		String linea;
		List<Profesor> listadoProfesor = new ArrayList<Profesor>();
		
		while((linea = archivoBufferedReader.readLine()) != null) {
			
			listadoProfesor.add(ParseProfesor(linea));
			
		}
		
		return listadoProfesor;
	}
	
	private Profesor ParseProfesor(String linea) {
		String[] atributos = linea.split(";");
		
		Profesor profesor = new Profesor();
		profesor.setApellido(atributos[0]);
		profesor.setApellido(atributos[1]);
		
		return profesor;

	}
	
	@Override
	public void ModificarProfesor(Profesor profesor) {}

	
	
}
