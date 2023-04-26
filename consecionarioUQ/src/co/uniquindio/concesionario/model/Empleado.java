package co.uniquindio.concesionario.model;

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
	private Cliente[] listaClientes;


	/**
	 * Constructor
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

	/**
	 * Getters and Setters
	 * @return
	 */
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
	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}



	/**
	 * Este metodo nos ayuda a registrar un cliente, verificando si este ya existe,
	 * si existe lanza un exception, si no lo ubica en una posicion disponible en la lista
	 * @param newCliente
	 * @throws ClienteException
	 */
	public void registrarCliente(Cliente newCliente) throws ClienteException {

		Cliente cliente = buscarCliente(newCliente);
		int posDisponible = 0;
		if(cliente != null){
			throw new ClienteException("El cliente ya existe");
		}
		posDisponible = obtenerPosicion();
		listaClientes[posDisponible] = newCliente;
	}

	private Cliente buscarCliente(Cliente newCliente) {
		List<Cliente> asList = Arrays.asList(listaClientes);
		Optional<Cliente> findFirst = asList.stream().filter(c -> c.equals(newCliente)).findFirst();
		return findFirst.get();
	}
	private int obtenerPosicion() {
		for(int i = 0 ; i<= listaClientes.length ;i++){
			if (listaClientes[i] == null){
				return i ;
			}
		}
		return -1;
	}







}
