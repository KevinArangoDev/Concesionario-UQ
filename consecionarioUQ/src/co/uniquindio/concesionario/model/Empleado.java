package co.uniquindio.concesionario.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import co.uniquindio.concesionario.exceptions.ClienteException;
import co.uniquindio.concesionario.exceptions.EmpleadoExceptions;

@SuppressWarnings("serial")
public class Empleado extends Persona implements Serializable{

	/**
	 * Atributos
	 */
	private String cargo;
	private double sueldo;
	private EstadoEmpleado estadoEmpleado;
	private ArrayList<Cliente> listaClientes;


	/**
	 * constructor de la clase Empleado
	 * @param nombre
	 * @param edad
	 * @param id
	 * @param cargo
	 * @param sueldo
	 */
	public Empleado(String nombre, String edad, String id, String cargo, double sueldo, EstadoEmpleado estadoEmpleado ){
		super(nombre, edad, id);
		this.cargo = cargo;
		this.sueldo = sueldo;
		this.estadoEmpleado = EstadoEmpleado.ACTIVO;

	}

	// constructor vacio
	public Empleado(String nombre, String edad, String id) {
		super(nombre, edad, id);
	}
	public Empleado() {
		super();
	}


//----------------------------------------------------------------------------------------------------
					//Getters and setter , toString



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
	public EstadoEmpleado getEstadoEmpleado() {
		return estadoEmpleado;
	}
	public void setEstadoEmpleado(EstadoEmpleado estadoEmpleado) {
		this.estadoEmpleado = estadoEmpleado;
	}
	@Override
	public String toString() {
		return "Empleado [cargo=" + cargo + ", sueldo=" + sueldo + ", listaClientes=" + listaClientes + "]";
	}


//------------------------------------------------------------------------------------------------------


										//CRUD CLIENTE

//	/**
//	 * metodo para agregar un cliente a la lista de clientes  , validando si el cliente
//	 *  ya existe segun su id y verificando si el empleado esta activo
//	 * @param cliente
//	 * @throws EmpleadoExceptions
//	 */
//
//	public void agregarCliente(Cliente cliente) throws EmpleadoExceptions  {
//		if(estadoEmpleado==EstadoEmpleado.ACTIVO){
//			int bandera = 0;
//			for (int i = 0; i < listaClientes.size() && bandera == 0; i++) {
//				if (listaClientes.get(i).getId().equals(cliente.getId())) {
//					bandera = 1;
//				}
//			}
//			if (bandera == 0) {
//				listaClientes.add(cliente);
//			//	Persistencia.guardarCliente(listaClientes);
//				System.out.println("Se agrego un nuevo cliente .");
//			} else {
//				System.out.println("Este cliente ya existe");
//			}
//		}else{
//			throw new EmpleadoExceptions("este empleado no puede agregar clientes , EMPLEADO BLOQUEADO");
//
//		}
//
//
//	}
//	/**
//	 * metodo utilizado para actualizar la informacion del cliente que retorna un valor booleando true
//	 * si el cliente fue actualizadao exitosamente o false si o fue actualizado
//	 * y verificando si el empleado esta activo
//	 * @param nombre
//	 * @param edad
//	 * @param id
//	 * @param direccion
//	 * @param telefono
//	 * @param listaClientes
//	 * @return
//	 * @throws EmpleadoExceptions
//	 */
//
//	public boolean actualizarCliente(String nombre, String edad , String id , String direccion , String telefono) throws EmpleadoExceptions{
//		if(estadoEmpleado==EstadoEmpleado.ACTIVO){
//			Cliente clienteAct = new Cliente(nombre, edad, id, direccion, telefono);
//			if (id != null) {
//				for (int i = 0; i < listaClientes.size(); i++) {
//					if (listaClientes.get(i).getId().equals(id)) {
//						listaClientes.set(i, clienteAct);
//
//						// Guarda en el txt
//						//Persistencia.guardarComprador(listaClientes);
//						return true;
//					}
//				}
//			}
//
//		}else{
//			throw new EmpleadoExceptions("el empleado se encuentra bloqueado");
//		}
//		return false;
//	}
//
//	/**
//	 * metodo utilizado para eliminar un cliente de la lista  de clientes   validando que el cliente existe
//	 * obteniendo su id y verificando si el empleado esta activo
//	 * @param cliente
//	 * @throws EmpleadoExceptions
//	 */
//
//	public void eliminarCliente(Cliente cliente) throws EmpleadoExceptions  {
//		if(estadoEmpleado==EstadoEmpleado.ACTIVO){
//			String idCliente = cliente.getId();
//
//			for (int i = 0; i < listaClientes.size(); i++) {
//				if (listaClientes.get(i).getId().equals(idCliente)) {
//					listaClientes.remove(i);
//
//					System.out.println("Se elimino el cliente.");
//					//Persistencia.guardarCliente(listaClientes);
//					break;
//				}else System.out.println("no existe un cliente con esa id");
//
//			}
//
//		}else throw new EmpleadoExceptions("el empleado se encuentra Bloqueado");
//
//
//	}
//
//----------------------------------------------------------------------------------------------------


}
