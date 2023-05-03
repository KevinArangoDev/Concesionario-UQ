package co.uniquindio.concesionario.model;

public class Moto extends Vehiculo{

	/**
	 * Metodo Constructor
	 * @param marca
	 * @param idVehiculo
	 * @param modelo
	 * @param cambios
	 * @param cilindraje
	 * @param numPasajeros
	 * @param numPuertas
	 * @param numBolsasDeAire
	 * @param velocidadMaxima
	 * @param tieneAbs
	 * @param tieneCamaraReversa
	 */
	public Moto(String marca, String idVehiculo, String modelo, String cambios, String cilindraje, String numPasajeros,
			String numPuertas, String numBolsasDeAire, double velocidadMaxima, boolean tieneAbs,
			boolean tieneCamaraReversa) {
		super(marca, idVehiculo, modelo, cambios, cilindraje, numPasajeros, numPuertas, numBolsasDeAire, velocidadMaxima,
				tieneAbs, tieneCamaraReversa);

	}

}
