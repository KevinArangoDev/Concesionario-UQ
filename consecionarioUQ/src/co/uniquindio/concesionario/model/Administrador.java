package co.uniquindio.concesionario.model;

import java.util.ArrayList;

public class Administrador extends Persona {
	private double sueldo;
	private ArrayList<Empleado> listaEmpleados;
	public Administrador(String nombre, String edad, String id, double sueldo, ArrayList<Empleado> listaEmpleados) {
		super(nombre, edad, id);
		this.sueldo = sueldo;
		this.listaEmpleados = listaEmpleados;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	@Override
	public String toString() {
		return "Administrador [sueldo=" + sueldo + "]";
	}
	
	

}
