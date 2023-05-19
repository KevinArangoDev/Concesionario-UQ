package co.uniquindio.concesionario.exceptions;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdministradorException  extends Exception implements Serializable{

	public AdministradorException(String mensaje) {
		super(mensaje);
	}

}
