package controller;

import java.util.ArrayList;

import vista.*;
import models.*;

public class controlador {

	public static final int MAX_SUELDO = 10000;
	public static final char GEN_HOMBRE = 'H';
	public static final char GEN_MUJER = 'M';
	
	private static ArrayList<Empleado> ListaEmpleados = new ArrayList<Empleado>();
	public static int indice = 0;

	public static void AnadirEmpleado(String nombre, String apellido, char genero, String puesto, String fecha, boolean vacaciones, int sueldo, String comentario){
		if(!BuscarEmpleado(nombre, apellido))
			ListaEmpleados.add(new Empleado(nombre, apellido, genero, puesto, fecha, vacaciones, sueldo, comentario));
		else
			throw new RuntimeException("Ya hay un empleado con el mismo nombre y apellido creado");
	}
	
	public static void BorrarEmpleado(Empleado emp){
		ListaEmpleados.remove(emp);
		indice--;
	}
	
	public static Empleado ObtenerEmpleado(int indice){
		if(ListaEmpleados.isEmpty()) throw new RuntimeException("No hay ningún empleado añadido");
		if(indice < 0 || indice >= ListaEmpleados.size()) throw new RuntimeException("Te sales del indice de empleados");
		return ListaEmpleados.get(indice);
	}
	
	public static ArrayList<Empleado> ObtenerLista(){
		return ListaEmpleados;
	}
	
	private static boolean BuscarEmpleado(String nombre, String apellido){
		boolean result = false;
		
		for(Empleado emp: ListaEmpleados){
			if(emp.getNombre().equals(nombre) && emp.getApellido().equals(apellido)){
				result = true;
			}
		}
		
		return result;
	}
	
	public static Empleado nextEmpleado(){
		if(indice+1 >= ListaEmpleados.size()) throw new RuntimeException("Te sales del rango de empleados...");
		indice++;
		return ObtenerEmpleado(indice);
	}
	
	public static Empleado lastEmpleado(){
		if(indice-1 < 0) throw new RuntimeException("Te sales del rango de empleados...");
		indice--;
		return ObtenerEmpleado(indice);
	}
	
	public static void EditarEmpleado(String nombre, String apellido, char genero, String puesto, String fecha, boolean vacaciones, int sueldo, String comentario){
		Empleado emp = ObtenerEmpleado(indice);
		
		emp.setNombre(nombre);
		emp.setApellido(apellido);
		emp.setGenero(genero);
		emp.setPuesto(puesto);
		emp.setFecha(fecha);
		emp.setVacaciones(vacaciones);
		emp.setSueldo(sueldo);
		emp.setComentario(comentario);
	}
}
