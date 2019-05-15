package edu.usal.dao.implementacion;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Alumno;
import edu.usal.negocio.dto.interfaces.AlumnoDAO;

public class AlumnoDAOimplArchivo implements AlumnoDAO {
	
	private File archivo;
	private FileWriter archivoWriter;
	private FileReader archivoReader;
	private BufferedWriter archivoBufferedWriter;
	private BufferedReader archivoBufferedReader;
	
	

	@Override
	public void AgregarAlumno(Alumno alumno) throws IOException {
		
		archivo = new File("alumno.txt");
		archivoWriter = new FileWriter(archivo);
		archivoBufferedWriter = new BufferedWriter(archivoWriter);
		
		String str = SaveAlumno(alumno);
		
		archivoBufferedWriter.write(str);
		archivoBufferedWriter.close();
		archivoWriter.close();
	}
	
	private String SaveAlumno(Alumno alumno) {
		return alumno.getApellido() + ";" + alumno.getNombre() + "/n";
	}

	@Override
	public void EliminarAlumno(Alumno alumno) {}

	@Override
	public List<Alumno> GetAll() throws IOException {
		
		archivo= new File("alumno.txt");
		archivoReader= new FileReader(archivo);
		archivoBufferedReader = new BufferedReader(archivoReader);
		
		String linea;
		List<Alumno> listadoAlumno= new ArrayList<Alumno>();
		
		while((linea= archivoBufferedReader.readLine()) !=null) {
			
			listadoAlumno.add(ParseAlumno(linea));
		}
		return listadoAlumno;
	}
	
	private Alumno ParseAlumno(String linea) {
		String[] atributos = linea.split(";");
		
		Alumno alumno = new Alumno();
		alumno.setApellido(atributos[0]);
		alumno.setApellido(atributos[1]);
		
		return alumno;
	}

	@Override
	public void ModificarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub

	}

}
