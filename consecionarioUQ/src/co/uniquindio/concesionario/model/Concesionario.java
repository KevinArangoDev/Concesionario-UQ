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
	private Persona[] listaPersonas;
	private Cliente[] listaClientes;
	private Empleado[] listaEmpleados;
	private Vehiculo[] listaVehiculos;
	private List<Vehiculo> vehiculosLivianos;
    private List<Vehiculo> vehiculosPesados;
    private List<Vehiculo> vehiculosMotos;



	/**
	 * Constructor
	 */
	public Concesionario(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.vehiculosLivianos = new ArrayList<>();
        this.vehiculosPesados = new ArrayList<>();
        this.vehiculosMotos = new ArrayList<>();
	}
	/**
	 * Getters and Setters
	 * @return
	 */
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
	@Override
	public String toString() {
		return "Concesionario [nombre=" + nombre + ", direccion=" + direccion + "]";
	}

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

	/**
	 * Este metodo nos ayuda a registrar un vehiculo, primero compara el Id del vehiculo y si coincide
	 * con algun vehiculo del consecionario arroja un exception con el mensaje de que ya fue registrado
	 * si no existe el carro lo agrega a la lista de vehiculos en la posicion disponible.
	 * @param newVehiculo
	 * @throws VehiculoException
	 */
	public void registrarVehiculo(Vehiculo newVehiculo) throws VehiculoException {
	    int posDisponible = obtenerPosicionListaVehiculo();
	    Vehiculo vehiculo;
	    for (int i = 0; i < posDisponible; i++) {
	        vehiculo = listaVehiculos[i];
	        if (vehiculo.getIdVehiculo().equals(newVehiculo.getIdVehiculo())) {
	            throw new VehiculoException("El vehículo ya ha sido registrado.");
	        }
	    }
	    listaVehiculos[posDisponible] = newVehiculo;
	}
//	private Vehiculo buscarVehiculo(Vehiculo newVehiculo) {
//		List<Vehiculo> asList = Arrays.asList(listaVehiculos);
//		Optional<Vehiculo> findFirst = asList.stream().filter(c -> c.equals(newVehiculo.getIdVehiculo())).findFirst();
//		return findFirst.get();
//	}
	private int obtenerPosicionListaVehiculo() {
		for(int i = 0 ; i<= listaVehiculos.length ;i++){
			if (listaVehiculos[i] == null){
				return i ;
			}
		}
		return -1;
	}






	//obtener la lista de contacto, donde el telefono de contacto sea un numero capicua	usar la funcion filter de los strings
	//estudiar lamdad
}
