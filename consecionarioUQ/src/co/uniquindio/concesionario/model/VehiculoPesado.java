package co.uniquindio.concesionario.model;

public class VehiculoPesado extends Vehiculo {

	private double capacidadMaletero;
	private String salidasDeEmergencia;
	private String ejes;
	private String velocidadCrucero;
	private double capCajaCarga;

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
	 * @param capacidadMaletero
	 * @param salidasDeEmergencia
	 * @param ejes
	 * @param velocidadCrucero
	 * @param capCajaCarga
	 */
	public VehiculoPesado(String marca, String idVehiculo, String modelo, String cambios, String cilindraje,
			String numPasajeros, String numPuertas, String numBolsasDeAire, double velocidadMaxima, boolean tieneAbs,
			boolean tieneCamaraReversa, double capacidadMaletero, String salidasDeEmergencia, String ejes,
			String velocidadCrucero, double capCajaCarga) {
		super(marca, idVehiculo, modelo, cambios, cilindraje, numPasajeros, numPuertas, numBolsasDeAire,
				velocidadMaxima, tieneAbs, tieneCamaraReversa);
		this.capacidadMaletero = capacidadMaletero;
		this.salidasDeEmergencia = salidasDeEmergencia;
		this.ejes = ejes;
		this.velocidadCrucero = velocidadCrucero;
		this.capCajaCarga = capCajaCarga;
	}

	/**
	 * Getters and Setters
	 * @return
	 */
	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}
	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}
	public String getSalidasDeEmergencia() {
		return salidasDeEmergencia;
	}
	public void setSalidasDeEmergencia(String salidasDeEmergencia) {
		this.salidasDeEmergencia = salidasDeEmergencia;
	}
	public String getEjes() {
		return ejes;
	}
	public void setEjes(String ejes) {
		this.ejes = ejes;
	}
	public String getVelocidadCrucero() {
		return velocidadCrucero;
	}
	public void setVelocidadCrucero(String velocidadCrucero) {
		this.velocidadCrucero = velocidadCrucero;
	}
	public double getCapCajaCarga() {
		return capCajaCarga;
	}
	public void setCapCajaCarga(double capCajaCarga) {
		this.capCajaCarga = capCajaCarga;
	}
	@Override
	public String toString() {
		return "VehiculoPesado [capacidadMaletero=" + capacidadMaletero + ", salidasDeEmergencia=" + salidasDeEmergencia
				+ ", ejes=" + ejes + ", velocidadCrucero=" + velocidadCrucero + ", capCajaCarga=" + capCajaCarga + "]";
	}






}
