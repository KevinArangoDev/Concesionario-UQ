package co.uniquindio.concesionario.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import co.uniquindio.concesionario.exceptions.ClienteException;
import co.uniquindio.concesionario.exceptions.VehiculoException;

public class Concesionario {

	/**
	 * Atributos
	 */
	private String nombre;
	private String direccion;
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	private ArrayList<Transaccion> listaTransacciones = new ArrayList<Transaccion>();
	public Concesionario(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	public ArrayList<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}
	public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}
	@Override
	public String toString() {
		return "Concesionario [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concesionario other = (Concesionario) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	public void agregarVehiculo(Vehiculo vehiculo)  {
		int bandera = 0;
		for (int i = 0; i < listaVehiculos.size() && bandera == 0; i++) {
			if (listaVehiculos.get(i).getPlaca().equals(vehiculo.getPlaca())) {
				bandera = 1;
			}
		}
		if (bandera == 0) {
			listaVehiculos.add(vehiculo);
		//	Persistencia.guardarVehiculo(listaVehiculos);
			System.out.println("Se agrego un nuevo vehiculo .");
		} else {
			System.out.println("Este vehiculo ya existe");
		}

	}

	public void eliminarVeviculo(Vehiculo vehiculo)  {

		String idVehiculo = vehiculo.getPlaca();

		for (int i = 0; i < listaVehiculos.size(); i++) {
			if (listaVehiculos.get(i).getPlaca().equals(idVehiculo)) {
				listaVehiculos.remove(i);

				System.out.println("Se elimino el vehiculo.");
				//Persistencia.guardarCliente(listaClientes);
				break;
			}else{
				System.out.println("no existe un vehiculo con esa id");

			}

		}
	}






}