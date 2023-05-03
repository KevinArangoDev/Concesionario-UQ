package co.uniquindio.concesionario.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import co.uniquindio.concesionario.exceptions.ClienteException;

public class Concesionario {

	/**
	 * Atributos
	 */
	private String nombre;
	private String direccion;
	private Persona[] listaPersonas;


	/**
	 * Constructor
	 */
	public Concesionario(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
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

	public void registrarPersona(Persona newPersona) throws ClienteException {

		Persona persona = buscarPersona(newPersona);
		int posDisponible = 0;
		if(persona != null){
			throw new ClienteException("El cliente ya existe");
		}
		posDisponible = obtenerPosicion();
		listaPersonas[posDisponible] = newPersona;
	}

	private Persona buscarPersona(Persona newPersona) {
		List<Persona> asList = Arrays.asList(listaPersonas);
		Optional<Persona> findFirst = asList.stream().filter(c -> c.equals(newPersona)).findFirst();
		return findFirst.get();
	}
	private int obtenerPosicion() {
		for(int i = 0 ; i<= listaPersonas.length ;i++){
			if (listaPersonas[i] == null){
				return i ;
			}
		}
		return -1;
	}
 // jhkjjk kj


}
