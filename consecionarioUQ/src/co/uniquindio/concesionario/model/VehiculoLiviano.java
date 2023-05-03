package co.uniquindio.concesionario.model;

public class VehiculoLiviano extends Vehiculo implements deCeroACien {

	/**
	 * Atributos
	 */
	private boolean esCuatroPorCuatro;
	private boolean sensorColision;
	private boolean sensorTraficocruzado;
	private boolean asistPermCarril;
	private boolean esEnchufable;
	private boolean esHibridoLigero;
	private double	tiempoDecarga;
	private double  caballosDeFuerza;
	private String  autonomiaCargaCompleta;
	private double coeficienteDeArrastre;
	private double peso;


	/**
	 *
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
	 * @param esCuatroPorCuatro
	 * @param sensorColision
	 * @param sensorTraficocruzado
	 * @param asistPermCarril
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @param tiempoDecarga
	 * @param caballosDeFuerza
	 * @param autonomiaCargaCompleta
	 * @param coeficienteDeArrastre
	 * @param peso
	 */
	public VehiculoLiviano(String marca, String idVehiculo, String modelo, String cambios, String cilindraje,
			String numPasajeros, String numPuertas, String numBolsasDeAire, double velocidadMaxima, boolean tieneAbs,
			boolean tieneCamaraReversa, boolean esCuatroPorCuatro, boolean sensorColision, boolean sensorTraficocruzado,
			boolean asistPermCarril, boolean esEnchufable, boolean esHibridoLigero, double tiempoDecarga,
			double caballosDeFuerza, String autonomiaCargaCompleta, double coeficienteDeArrastre, double peso) {
		super(marca, idVehiculo, modelo, cambios, cilindraje, numPasajeros, numPuertas, numBolsasDeAire,
				velocidadMaxima, tieneAbs, tieneCamaraReversa);
		this.esCuatroPorCuatro = esCuatroPorCuatro;
		this.sensorColision = sensorColision;
		this.sensorTraficocruzado = sensorTraficocruzado;
		this.asistPermCarril = asistPermCarril;
		this.esEnchufable = esEnchufable;
		this.esHibridoLigero = esHibridoLigero;
		this.tiempoDecarga = tiempoDecarga;
		this.caballosDeFuerza = caballosDeFuerza;
		this.autonomiaCargaCompleta = autonomiaCargaCompleta;
		this.coeficienteDeArrastre = coeficienteDeArrastre;
		this.peso = peso;
	}



	/**
	 * Getters and Setters
	 * @return
	 */

	public boolean isEsCuatroPorCuatro() {
		return esCuatroPorCuatro;
	}
	public void setEsCuatroPorCuatro(boolean esCuatroPorCuatro) {
		this.esCuatroPorCuatro = esCuatroPorCuatro;
	}
	public boolean isSensorColision() {
		return sensorColision;
	}
	public void setSensorColision(boolean sensorColision) {
		this.sensorColision = sensorColision;
	}

	public boolean isSensorTraficocruzado() {
		return sensorTraficocruzado;
	}

	public void setSensorTraficocruzado(boolean sensorTraficocruzado) {
		this.sensorTraficocruzado = sensorTraficocruzado;
	}

	public boolean isAsistPermCarril() {
		return asistPermCarril;
	}

	public void setAsistPermCarril(boolean asistPermCarril) {
		this.asistPermCarril = asistPermCarril;
	}

	public boolean isEsEnchufable() {
		return esEnchufable;
	}
	public void setEsEnchufable(boolean esEnchufable) {
		this.esEnchufable = esEnchufable;
	}
	public boolean isEsHibridoLigero() {
		return esHibridoLigero;
	}
	public void setEsHibridoLigero(boolean esHibridoLigero) {
		this.esHibridoLigero = esHibridoLigero;
	}
	public double getTiempoDecarga() {
		return tiempoDecarga;
	}
	public void setTiempoDecarga(double tiempoDecarga) {
		this.tiempoDecarga = tiempoDecarga;
	}
	public double getCaballosDeFuerza() {
		return caballosDeFuerza;
	}
	public void setCaballosDeFuerza(double caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}
	public String getAutonomiaCargaCompleta() {
		return autonomiaCargaCompleta;
	}
	public void setAutonomiaCargaCompleta(String autonomiaCargaCompleta) {
		this.autonomiaCargaCompleta = autonomiaCargaCompleta;
	}
	public double getCoeficienteDeArrastre() {
		return coeficienteDeArrastre;
	}
	public void setCoeficienteDeArrastre(double coeficienteDeArrastre) {
		this.coeficienteDeArrastre = coeficienteDeArrastre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "VehiculoLiviano [esCuatroPorCuatro=" + esCuatroPorCuatro + ", sensorColision=" + sensorColision
				+ ", sensorTraficocruzado=" + sensorTraficocruzado + ", asistPermCarril=" + asistPermCarril
				+ ", esEnchufable=" + esEnchufable + ", esHibridoLigero=" + esHibridoLigero + ", tiempoDecarga="
				+ tiempoDecarga + ", caballosDeFuerza=" + caballosDeFuerza + ", autonomiaCargaCompleta="
				+ autonomiaCargaCompleta + ", coeficienteDeArrastre=" + coeficienteDeArrastre + ", peso=" + peso + "]";
	}





	@Override
	public double calcularTiempoDe100KmPorHora() {
		// TODO Auto-generated method stub
		return 0;
	}


}
