package models;

import controller.*;
public class Empleado {

	private String nombre;
	private String apellido;
	private char genero;
	private String puesto;
	private String fecha;
	private boolean vacaciones;
	private int sueldo;
	private String comentario;
	
	//Constructor
	public Empleado(String nombre, String apellido, char genero, String puesto,
			String fecha, boolean vacaciones, int sueldo, String comentario){
		super();
		setNombre(nombre);
		setApellido(apellido);
		setGenero(genero);
		setPuesto(puesto);
		setFecha(fecha);
		setVacaciones(vacaciones);
		setSueldo(sueldo);
		setComentario(comentario);
	}

	public void setNombre(String nombre) {
		if(nombre == null || nombre.equals("")) throw new RuntimeException("El nombre esta vacio");
		if(!checkString(nombre)) throw new RuntimeException("El nombre introducido no es válido");
		
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		if(apellido == null || apellido.equals("")) throw new RuntimeException("El apellido esta vacio");
		if(!checkString(nombre)) throw new RuntimeException("El apellido introducido no es válido");
		
		this.apellido = apellido;
	}

	public void setGenero(char genero) {
		if(!(genero == controlador.GEN_HOMBRE || genero == controlador.GEN_MUJER)) throw new RuntimeException("El genero no es válido");

		this.genero = genero;
	}

	public void setPuesto(String puesto) {
		if(puesto == null || puesto.equals("")) throw new RuntimeException("El puesto esta vacio");

		this.puesto = puesto;
	}

	public void setFecha(String fecha) {
		if(fecha == null || fecha.equals("")) throw new RuntimeException("La fecha esta vacia");
		String aux[] = fecha.split("/");
		
		try{
			Integer.parseInt(aux[0]);
			Integer.parseInt(aux[1]);
			Integer.parseInt(aux[2]);
		}catch(Exception e){
			throw new RuntimeException("La fecha introducida no es válida");
		}
		
		this.fecha = fecha;
	}

	public void setVacaciones(boolean vacaciones) {
		this.vacaciones = vacaciones;
	}

	public void setSueldo(int sueldo) {
		if(sueldo < 0 || sueldo > controlador.MAX_SUELDO) throw new RuntimeException("El sueldo no esta en el rango válido");
		
		this.sueldo = sueldo;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	//Getters
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public char getGenero() {
		return genero;
	}

	public String getPuesto() {
		return puesto;
	}

	public String getFecha() {
		return fecha;
	}

	public int getSueldo() {
		return sueldo;
	}

	public String getComentario() {
		return comentario;
	}
	
	public boolean getVacaciones(){
		return vacaciones;
	}
	
	//funciones
	private boolean checkString(String texto){
		boolean result = true;
		char cadena[] = texto.toCharArray();
		
		for(char i: cadena){
			if(!((i >= 'a' && i <= 'z')||(i >= 'A' && i <= 'Z' ))){
				result = false;
				break;
			}
		}
		
		return result;
	}
	
}
