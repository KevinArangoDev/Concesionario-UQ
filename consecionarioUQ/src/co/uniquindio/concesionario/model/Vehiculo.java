package co.uniquindio.concesionario.model;

public class Vehiculo implements deCeroACien{
	
		//Attributes
		private String marca;
		private String modelo;
		private String cambios;
		private String cilindraje;
		private String numPasajeros;
		private String numPuertas;
		private String numBolsasDeAire;
		private String ejes;
		private String salidasDeEmergencia;
		private String velocidadCrucero;
		private String autonomiaCargaCompleta;
		private double capCajaCarga;
		private double caballosDeFuerza;
		private double velocidadMaxima;
		private double capacidadMaletero;
		private double tiempoDecarga;
		private double coeficienteDeArrastre;
		private double peso;
		private boolean tieneAbs;
		private boolean tieneCamaraReversa;
		private boolean esCuatroPorCuatro;
		private boolean sensorColision;
		private boolean sensorTraficocruzado;
		private boolean asistPermCarril;
		private boolean esEnchufable;
		private boolean esHibridoLigero;

		/**
		 *
		 * @param marca
		 * @param modelo
		 * @param cambios
		 * @param cilindraje
		 * @param numPasajeros
		 * @param numPuertas
		 * @param numBolsasDeAire
		 * @param ejes
		 * @param salidasDeEmergencia
		 * @param capCajaCarga
		 * @param velocidadCrucero
		 * @param caballosDeFuerza
		 * @param autonomiaCargaCompleta
		 * @param velocidadMaxima
		 * @param capacidadMaletero
		 * @param tiempoDecarga
		 * @param coeficienteDeArrastre
		 * @param peso
		 * @param tieneAbs
		 * @param tieneCamaraReversa
		 * @param esCuatroPorCuatro
		 * @param sensorColision
		 * @param sensorTraficocruzado
		 * @param asistPermCarril
		 * @param esEnchufable
		 * @param esHibridoLigero
		 */


		public Vehiculo(String marca, String modelo, String cambios, String cilindraje, String numPasajeros,
				String numPuertas, String numBolsasDeAire, String ejes, String salidasDeEmergencia, double capCajaCarga,
				String velocidadCrucero, double caballosDeFuerza, String autonomiaCargaCompleta, double velocidadMaxima,
				double capacidadMaletero, double tiempoDecarga, double coeficienteDeArrastre, double peso, boolean tieneAbs,
				boolean tieneCamaraReversa, boolean esCuatroPorCuatro, boolean sensorColision, boolean sensorTraficocruzado,
				boolean asistPermCarril, boolean esEnchufable, boolean esHibridoLigero) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.cambios = cambios;
			this.cilindraje = cilindraje;
			this.numPasajeros = numPasajeros;
			this.numPuertas = numPuertas;
			this.numBolsasDeAire = numBolsasDeAire;
			this.ejes = ejes;
			this.salidasDeEmergencia = salidasDeEmergencia;
			this.capCajaCarga = capCajaCarga;
			this.velocidadCrucero = velocidadCrucero;
			this.caballosDeFuerza = caballosDeFuerza;
			this.autonomiaCargaCompleta = autonomiaCargaCompleta;
			this.velocidadMaxima = velocidadMaxima;
			this.capacidadMaletero = capacidadMaletero;
			this.tiempoDecarga = tiempoDecarga;
			this.coeficienteDeArrastre = coeficienteDeArrastre;
			this.peso = peso;
			this.tieneAbs = tieneAbs;
			this.tieneCamaraReversa = tieneCamaraReversa;
			this.esCuatroPorCuatro = esCuatroPorCuatro;
			this.sensorColision = sensorColision;
			this.sensorTraficocruzado = sensorTraficocruzado;
			this.asistPermCarril = asistPermCarril;
			this.esEnchufable = esEnchufable;
			this.esHibridoLigero = esHibridoLigero;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getCambios() {
			return cambios;
		}
		public void setCambios(String cambios) {
			this.cambios = cambios;
		}
		public String getCilindraje() {
			return cilindraje;
		}
		public void setCilindraje(String cilindraje) {
			this.cilindraje = cilindraje;
		}
		public String getNumPasajeros() {
			return numPasajeros;
		}
		public void setNumPasajeros(String numPasajeros) {
			this.numPasajeros = numPasajeros;
		}
		public String getNumPuertas() {
			return numPuertas;
		}
		public void setNumPuertas(String numPuertas) {
			this.numPuertas = numPuertas;
		}
		public String getNumBolsasDeAire() {
			return numBolsasDeAire;
		}
		public void setNumBolsasDeAire(String numBolsasDeAire) {
			this.numBolsasDeAire = numBolsasDeAire;
		}
		public String getEjes() {
			return ejes;
		}
		public void setEjes(String ejes) {
			this.ejes = ejes;
		}
		public String getSalidasDeEmergencia() {
			return salidasDeEmergencia;
		}
		public void setSalidasDeEmergencia(String salidasDeEmergencia) {
			this.salidasDeEmergencia = salidasDeEmergencia;
		}
		public double getCapCajaCarga() {
			return capCajaCarga;
		}
		public void setCapCajaCarga(double capCajaCarga) {
			this.capCajaCarga = capCajaCarga;
		}
		public String getVelocidadCrucero() {
			return velocidadCrucero;
		}
		public void setVelocidadCrucero(String velocidadCrucero) {
			this.velocidadCrucero = velocidadCrucero;
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
		public double getVelocidadMaxima() {
			return velocidadMaxima;
		}
		public void setVelocidadMaxima(double velocidadMaxima) {
			this.velocidadMaxima = velocidadMaxima;
		}
		public double getCapacidadMaletero() {
			return capacidadMaletero;
		}
		public void setCapacidadMaletero(double capacidadMaletero) {
			this.capacidadMaletero = capacidadMaletero;
		}
		public double getTiempoDecarga() {
			return tiempoDecarga;
		}
		public void setTiempoDecarga(double tiempoDecarga) {
			this.tiempoDecarga = tiempoDecarga;
		}
		public boolean isTieneAbs() {
			return tieneAbs;
		}
		public void setTieneAbs(boolean tieneAbs) {
			this.tieneAbs = tieneAbs;
		}
		public boolean isTieneCamaraReversa() {
			return tieneCamaraReversa;
		}
		public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
			this.tieneCamaraReversa = tieneCamaraReversa;
		}
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
			return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", cambios=" + cambios + ", cilindraje=" + cilindraje
					+ ", numPasajeros=" + numPasajeros + ", numPuertas=" + numPuertas + ", numBolsasDeAire="
					+ numBolsasDeAire + ", ejes=" + ejes + ", salidasDeEmergencia=" + salidasDeEmergencia
					+ ", capCajaCarga=" + capCajaCarga + ", velocidadCrucero=" + velocidadCrucero + ", caballosDeFuerza="
					+ caballosDeFuerza + ", autonomiaCargaCompleta=" + autonomiaCargaCompleta + ", velocidadMaxima="
					+ velocidadMaxima + ", capacidadMaletero=" + capacidadMaletero + ", tiempoDecarga=" + tiempoDecarga
					+ ", coeficienteDeArrastre=" + coeficienteDeArrastre + ", peso=" + peso + ", tieneAbs=" + tieneAbs
					+ ", tieneCamaraReversa=" + tieneCamaraReversa + ", esCuatroPorCuatro=" + esCuatroPorCuatro
					+ ", sensorColision=" + sensorColision + ", sensorTraficocruzado=" + sensorTraficocruzado
					+ ", asistPermCarril=" + asistPermCarril + ", esEnchufable=" + esEnchufable + ", esHibridoLigero="
					+ esHibridoLigero + "]";


		}
		@Override
		public double calcularTiempoDe100KmPorHora() {
			// TODO Auto-generated method stub
			return 0;
		}
}
