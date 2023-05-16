package co.uniquindio.concesionario.model;
public abstract class VehiculoLiviano  extends Carro{
	/**
	 * Declaracion de atributos
	 */
	private boolean velCrucero;
	private boolean sensorColision;
	private  boolean sensorTraficoCruzado;
	private boolean asisPermCarril;
	
	/**
	 * Constructor de la clase VehiculoLiviano y los demas atributos de su superclase
	 * @param tipoCombustible
	 * @param tipoTrasmision
	 * @param tipoNuevoUsado
	 * @param marca
	 * @param modelo
	 * @param cambios
	 * @param velMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param placa
	 * @param numPuertas
	 * @param capMaletero
	 * @param hasAireAcondicionado
	 * @param hasCamaraReversa
	 * @param hasABS
	 * @param numBolsasAire
	 * @param velCrucero
	 * @param sensorColision
	 * @param sensorTraficoCruzado
	 * @param asisPermCarril
	 */
	public VehiculoLiviano(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision,
			TipoNuevoUsado tipoNuevoUsado, String marca, String modelo, String cambios, Double velMax,
			String cilindraje, String numPasajeros, String placa, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire,
			boolean velCrucero, boolean sensorColision, boolean sensorTraficoCruzado, boolean asisPermCarril) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
		this.velCrucero = velCrucero;
		this.sensorColision = sensorColision;
		this.sensorTraficoCruzado = sensorTraficoCruzado;
		this.asisPermCarril = asisPermCarril;
	}
	//constructor vacio
	public VehiculoLiviano(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision,
			TipoNuevoUsado tipoNuevoUsado, String marca, String modelo, String cambios, Double velMax,
			String cilindraje, String numPasajeros, String placa, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
	}
	
	/**
	 * Getters and Setters  , to String
	 * @return
	 */
	
//----------------------------------------------------------------------	
	public boolean isVelCrucero() {
		return velCrucero;
	}
	public void setVelCrucero(boolean velCrucero) {
		this.velCrucero = velCrucero;
	}
	public boolean isSensorColision() {
		return sensorColision;
	}
	public void setSensorColision(boolean sensorColision) {
		this.sensorColision = sensorColision;
	}
	public boolean isSensorTraficoCruzado() {
		return sensorTraficoCruzado;
	}
	public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
		this.sensorTraficoCruzado = sensorTraficoCruzado;
	}
	public boolean isAsisPermCarril() {
		return asisPermCarril;
	}
	public void setAsisPermCarril(boolean asisPermCarril) {
		this.asisPermCarril = asisPermCarril;
	}
	@Override
	public String toString() {
		return "VehiculoLiviano [velCrucero=" + velCrucero + ", sensorColision=" + sensorColision
				+ ", sensorTraficoCruzado=" + sensorTraficoCruzado + ", asisPermCarril=" + asisPermCarril + "]";
	}
//------------------------------------------------------------------------------------------------	
	

}
