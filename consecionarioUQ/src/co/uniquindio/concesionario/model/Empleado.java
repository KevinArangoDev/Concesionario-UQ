package co.uniquindio.concesionario.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import co.uniquindio.concesionario.exceptions.ClienteException;

public class Empleado extends Persona {

	/**
	 * Atributos
	 */
	private String cargo;
	private double sueldo;
	private ArrayList<Cliente> listaClientes;
	
	/**
	 * constructor de la clase Empleado
	 * @param nombre
	 * @param edad
	 * @param id
	 * @param cargo
	 * @param sueldo
	 */
	public Empleado(String nombre, String edad, String id, String cargo, double sueldo) {
		super(nombre, edad, id);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	public Empleado(String nombre, String edad, String id) {
		super(nombre, edad, id);
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	@Override
	public String toString() {
		return "Empleado [cargo=" + cargo + ", sueldo=" + sueldo + ", listaClientes=" + listaClientes + "]";
	}
	
	
	





}
