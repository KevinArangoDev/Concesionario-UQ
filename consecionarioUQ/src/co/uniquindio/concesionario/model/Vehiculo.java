package co.uniquindio.concesionario.model;

public class Vehiculo {

		//Attributes
		private String marca;
		private String idVehiculo;
		private String modelo;
		private String cambios;
		private String cilindraje;
		private String numPasajeros;
		private String numPuertas;
		private String numBolsasDeAire;
		private double velocidadMaxima;
		private boolean tieneAbs;
		private boolean tieneCamaraReversa;

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
		public Vehiculo(String marca, String idVehiculo, String modelo, String cambios, String cilindraje,
				String numPasajeros, String numPuertas, String numBolsasDeAire, double velocidadMaxima,
				boolean tieneAbs, boolean tieneCamaraReversa) {
			super();
			this.marca = marca;
			this.idVehiculo = idVehiculo;
			this.modelo = modelo;
			this.cambios = cambios;
			this.cilindraje = cilindraje;
			this.numPasajeros = numPasajeros;
			this.numPuertas = numPuertas;
			this.numBolsasDeAire = numBolsasDeAire;
			this.velocidadMaxima = velocidadMaxima;
			this.tieneAbs = tieneAbs;
			this.tieneCamaraReversa = tieneCamaraReversa;
		}

		/**
		 * Getters and Setters
		 * @return
		 */
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getIdVehiculo() {
			return idVehiculo;
		}
		public void setIdVehiculo(String idVehiculo) {
			this.idVehiculo = idVehiculo;
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
		public double getVelocidadMaxima() {
			return velocidadMaxima;
		}
		public void setVelocidadMaxima(double velocidadMaxima) {
			this.velocidadMaxima = velocidadMaxima;
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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idVehiculo == null) ? 0 : idVehiculo.hashCode());
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
			Vehiculo other = (Vehiculo) obj;
			if (idVehiculo == null) {
				if (other.idVehiculo != null)
					return false;
			} else if (!idVehiculo.equals(other.idVehiculo))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Vehiculo [marca=" + marca + ", idVehiculo=" + idVehiculo + ", modelo=" + modelo + ", cambios="
					+ cambios + ", cilindraje=" + cilindraje + ", numPasajeros=" + numPasajeros + ", numPuertas="
					+ numPuertas + ", numBolsasDeAire=" + numBolsasDeAire + ", velocidadMaxima=" + velocidadMaxima
					+ ", tieneAbs=" + tieneAbs + ", tieneCamaraReversa=" + tieneCamaraReversa + "]";
		}




}
