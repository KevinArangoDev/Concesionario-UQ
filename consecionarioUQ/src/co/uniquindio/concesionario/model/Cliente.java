package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente extends Persona implements Serializable {

	/**
	 * Atributos
	 */
	private String direccion;
	private String telefono;

	/**
	 * Constructor
	 */
	public Cliente(String nombre, String edad, String id, String direccion, String telefono , String apellido) {
		super(nombre, edad, id,apellido);
		this.direccion = direccion;
		this.telefono = telefono;
	}


	/**
	 * Getters and setters
	 */
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Cliente [direccion=" + direccion + ", telefono=" + telefono + "]";
	}



}
