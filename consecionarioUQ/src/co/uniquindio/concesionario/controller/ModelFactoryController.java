package co.uniquindio.concesionario.controller;

import java.io.IOException;

import co.uniquindio.concesionario.exceptions.AdministradorException;
import co.uniquindio.concesionario.model.Administrador;
import co.uniquindio.concesionario.model.Concesionario;
import co.uniquindio.concesionario.model.Empleado;


public class ModelFactoryController {
	//Atributos
	Concesionario concesionario;
	Empleado empleado;
	Administrador administrador;
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqui al ser
		// protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}
	// Metodo para obtener la instancia de nuestra clase
		public static ModelFactoryController getInstance() {
			return SingletonHolder.eINSTANCE;
		}

		public ModelFactoryController() {
			System.out.println("invocación clase singleton");
			inicializarDatos();
		}

		private void inicializarDatos() {
			concesionario = new Concesionario("concesionarioUq " , "cll3-25");

		}

		/**
		 * Getters and Setters
		 * @return
		 */

		public Concesionario getConcesionario() {
			return concesionario;
		}

		public void setConcesionario(Concesionario concesionario) {
			this.concesionario = concesionario;
		}

		public Empleado getEmpleado() {
			return empleado;
		}

		public void setEmpleado(Empleado empleado) {
			this.empleado = empleado;
		}

		public Administrador getAdministrador() {
			return administrador;
		}

		public void setAdministrador(Administrador administrador) {
			this.administrador = administrador;
		}

//		public Administrador registrarEmpleado(Administrador administrador , Empleado empleado) throws IOException {
//
//			return concesionario.agregarEmpleado(administrador, empleado);
//
//		}
		/*
		 * Metodo que permite iniciar la sesion del comprador
		 */
		public boolean inicioSesionAdmin(String id, String contrasenia) {
			try {
				this.administrador = concesionario.iniciarSesionAdministrador(id, contrasenia);
				return administrador != null;
			} catch (IOException | AdministradorException e) {
				e.printStackTrace();
			}
			return false;
		}





}
