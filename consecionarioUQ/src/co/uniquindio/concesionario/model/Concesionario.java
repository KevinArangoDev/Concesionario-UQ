	package co.uniquindio.concesionario.model;

	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Optional;

	import co.uniquindio.concesionario.exceptions.AdministradorException;
	import co.uniquindio.concesionario.exceptions.ClienteException;
	import co.uniquindio.concesionario.exceptions.EmpleadoExceptions;
	import co.uniquindio.concesionario.exceptions.VehiculoException;

	@SuppressWarnings("serial")
	public class Concesionario implements Serializable {

		/**
		 * Atributos
		 */
		private String nombre;
		private String direccion;
		private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		private ArrayList<Transaccion> listaTransacciones = new ArrayList<Transaccion>();
		private ArrayList<Administrador> listaAdministradores = new ArrayList<Administrador>();

		/**
		 * constructor de la clase concesionario
		 *
		 * @param nombre
		 * @param direccion
		 */
		public Concesionario(String nombre, String direccion) {
			super();
			this.nombre = nombre;
			this.direccion = direccion;
		}

		// constructor vacio
		public Concesionario() {
			super();
		}

		// ------------------------------------------------------------------------------------------------------
		// Getters and Setters , toString , hash code , .equals

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

		public ArrayList<Cliente> getListaClientes() {
			return listaClientes;
		}

		public void setListaClientes(ArrayList<Cliente> listaClientes) {
			this.listaClientes = listaClientes;
		}

		public ArrayList<Empleado> getListaEmpleados() {
			return listaEmpleados;
		}

		public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
			this.listaEmpleados = listaEmpleados;
		}

		public ArrayList<Vehiculo> getListaVehiculos() {
			return listaVehiculos;
		}

		public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
			this.listaVehiculos = listaVehiculos;
		}

		public ArrayList<Transaccion> getListaTransacciones() {
			return listaTransacciones;
		}

		public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
			this.listaTransacciones = listaTransacciones;
		}

		@Override
		public String toString() {
			return "Concesionario [nombre=" + nombre + ", direccion=" + direccion + "]";
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

// -------------------------------------------------------------------------------------------------------------------------------------------------
																							// CRUD VEHICULO
		/**
		 * metodo utilizado para agregar un vehiculo
		 *
		 * @param vehiculo
		 */
		public void agregarVehiculo(Vehiculo vehiculo) {
			int bandera = 0;
			for (int i = 0; i < listaVehiculos.size() && bandera == 0; i++) {
				if (listaVehiculos.get(i).getPlaca().equals(vehiculo.getPlaca())) {
					bandera = 1;
				}
			}
			if (bandera == 0) {
				listaVehiculos.add(vehiculo);
				// Persistencia.guardarVehiculo(listaVehiculos);
				System.out.println("Se agrego un nuevo vehiculo .");
			} else {
				System.out.println("Este vehiculo ya existe");
			}

		}

		/**
		 * metodo para actualizar un vehiculo
		 *
		 * @param vehiculoActualizado
		 */
		public void actualizarVehiculo(Empleado empleado ,Vehiculo vehiculoActualizado) {

			for (int i = 0; i < listaVehiculos.size(); i++) {
				if (listaVehiculos.get(i).getPlaca().equals(vehiculoActualizado.getPlaca())) {
					listaVehiculos.set(i, vehiculoActualizado);
				} else {
					// Si no se encontr� el veh�culo con el id especificado
					System.out.println("No se encontr� el veh�culo con esa placa: " + vehiculoActualizado.getPlaca());

				}
			}

		}

		/**
		 * metodo utilizado para eliminar un vehiculo
		 *
		 * @param vehiculo
		 */
		public void eliminarVehiculo(Vehiculo vehiculo) {

			String idVehiculo = vehiculo.getPlaca();

			for (int i = 0; i < listaVehiculos.size(); i++) {
				if (listaVehiculos.get(i).getPlaca().equals(idVehiculo)) {
					listaVehiculos.remove(i);

					System.out.println("Se elimino el vehiculo.");
					// Persistencia.guardarCliente(listaClientes);
					break;
				} else {
					System.out.println("no existe un vehiculo con esa id");

				}

			}
		}

// -------------------------------------------------------------------------------------------------------
																					// CRUD EMPLEADO

		/**
		 * metodo para agregar un empleado a la lista de empleados , validando si el
		 * empleado ya existe segun su id
		 *
		 * @param cliente
		 * @return
		 */

		public void agregarEmpleado( Empleado empleado) {
			int bandera = 0;
			for (int i = 0; i < listaEmpleados.size() && bandera == 0; i++) {
				if (listaEmpleados.get(i).getId().equals(empleado.getId())) {
					bandera = 1;
				}
			}
			if (bandera == 0) {
				listaEmpleados.add(empleado);
				// Persistencia.guardarEmpleado(listaEmpleados);
				System.out.println("Se agrego un nuevo empleado .");
			} else {
				System.out.println("Este empleado con esa id  ya existe");
			}


		}

		/**
		 * metodo utilizado para actualizar un empleado , validando si este existe
		 * segun su id
		 *
		 * @param nombre
		 * @param edad
		 * @param id
		 * @param cargo
		 * @param sueldo
		 * @return
		 */
		public void actualizarEmpleado(Empleado empleadoActualizado) {

			for (int i = 0; i < listaEmpleados.size(); i++) {
				if (listaEmpleados.get(i).getId().equals(empleadoActualizado.getId())) {
					listaEmpleados.set(i, empleadoActualizado);
				} else {
					// Si no se encontr� el empleado con el id especificado
					System.out.println("No se encontr� el empleado con esa id: " + empleadoActualizado.getId());

				}
			}

		}

		/**
		 * metodo utilizado para eliminar un empleado de la lista de empleados
		 * validando que el empleado existe obteniendo su id
		 *
		 * @param cliente
		 */
		public void eliminarEmpleado( Empleado empleado) {

			String idEmpleado = empleado.getId();

			for (int i = 0; i < listaEmpleados.size(); i++) {
				if (listaEmpleados.get(i).getId().equals(idEmpleado)) {
					listaEmpleados.remove(i);

					System.out.println("Se elimino el empleado.");
					// Persistencia.guardarCliente(listaClientes);
					break;
				} else {
					System.out.println("no existe un empleado con esa id");

				}

			}
		}

		/**
		 * metodo para bloquear un empleado
		 *
		 * @param empleado
		 */
		public void bloquearEmpleado( Empleado empleado) {
			String idEmpleado = empleado.getId();

			for (int i = 0; i < listaEmpleados.size(); i++) {
				if (listaEmpleados.get(i).getId().equals(idEmpleado)) {
					listaEmpleados.get(i).setEstadoEmpleado(EstadoEmpleado.BLOQUEADO);

					System.out.println("Se bloqueo el empleado. " + getNombre());
					break;
				} else {
					System.out.println("no existe un empleado con esa id");

				}

			}
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------

																						//CRUD CLIENTE
//
//		/**
//		 * metodo para agregar un cliente a la lista de clientes  , validando si el cliente
//		 *  ya existe segun su id y verificando si el empleado esta activo
//		 * @param cliente
//		 * @throws EmpleadoExceptions
//		 */
//
//		public void agregarCliente(Empleado empleado ,Cliente cliente) throws EmpleadoExceptions  {
//
//			if(empleado.getEstadoEmpleado().equals(EstadoEmpleado.ACTIVO)){
//				int bandera = 0;
//				for (int i = 0; i < listaClientes.size() && bandera == 0; i++) {
//					if (listaClientes.get(i).getId().equals(cliente.getId())) {
//						bandera = 1;
//					}
//				}
//				if (bandera == 0) {
//					listaClientes.add(cliente);
//				//	Persistencia.guardarCliente(listaClientes);
//					System.out.println("Se agrego un nuevo cliente .");
//				} else {
//					System.out.println("Este cliente ya existe");
//				}
//			}else{
//				throw new EmpleadoExceptions("este empleado no puede agregar clientes , EMPLEADO BLOQUEADO");
//
//			}
//
//
//		}
//		/**
//		 * metodo utilizado para actualizar la informacion del cliente que retorna un valor booleando true
//		 * si el cliente fue actualizadao exitosamente o false si o fue actualizado
//		 * y verificando si el empleado esta activo
//		 * @param nombre
//		 * @param edad
//		 * @param id
//		 * @param direccion
//		 * @param telefono
//		 * @param listaClientes
//		 * @return
//		 * @throws EmpleadoExceptions
//		 */
//
//		public boolean actualizarCliente(Empleado empleado ,String nombre, String edad , String id , String direccion , String telefono) throws EmpleadoExceptions{
//			if(empleado.getEstadoEmpleado().equals(EstadoEmpleado.ACTIVO)){
//				Cliente clienteAct = new Cliente(nombre, edad, id, direccion, telefono);
//				if (id != null) {
//					for (int i = 0; i < listaClientes.size(); i++) {
//						if (listaClientes.get(i).getId().equals(id)) {
//							listaClientes.set(i, clienteAct);
//
//							// Guarda en el txt
//							//Persistencia.guardarComprador(listaClientes);
//							return true;
//						}
//					}
//				}
//
//			}else{
//				throw new EmpleadoExceptions("el empleado se encuentra bloqueado");
//			}
//			return false;
//		}
//
//		/**
//		 * metodo utilizado para eliminar un cliente de la lista  de clientes   validando que el cliente existe
//		 * obteniendo su id y verificando si el empleado esta activo
//		 * @param cliente
//		 * @throws EmpleadoExceptions
//		 */
//
//		public void eliminarCliente(Empleado empleado ,Cliente cliente) throws EmpleadoExceptions  {
//			if(empleado.getEstadoEmpleado().equals(EstadoEmpleado.ACTIVO)){
//				String idCliente = cliente.getId();
//
//				for (int i = 0; i < listaClientes.size(); i++) {
//					if (listaClientes.get(i).getId().equals(idCliente)) {
//						listaClientes.remove(i);
//
//						System.out.println("Se elimino el cliente.");
//						//Persistencia.guardarCliente(listaClientes);
//						break;
//					}else System.out.println("no existe un cliente con esa id");
//
//				}
//
//			}else throw new EmpleadoExceptions("el empleado se encuentra Bloqueado");
//
//
//		}
//

		public void agregarCliente(Cliente cliente) throws EmpleadoExceptions  {
//			if(empleado.estadoEmpleado==EstadoEmpleado.ACTIVO){
				int bandera = 0;
				for (int i = 0; i < listaClientes.size() && bandera == 0; i++) {
					if (listaClientes.get(i).getId().equals(cliente.getId())) {
						bandera = 1;
					}
				}
				if (bandera == 0) {
					listaClientes.add(cliente);
				//	Persistencia.guardarCliente(listaClientes);
					System.out.println("Se agrego un nuevo cliente .");
				} else {
					System.out.println("Este cliente ya existe");
				}
			}





		/**
		 * metodo utilizado para actualizar la informacion del cliente que retorna un valor booleando true
		 * si el cliente fue actualizadao exitosamente o false si o fue actualizado
		 * y verificando si el empleado esta activo
		 * @param nombre
		 * @param edad
		 * @param id
		 * @param direccion
		 * @param telefono
		 * @param listaClientes
		 * @return
		 * @throws EmpleadoExceptions
		 */

		public boolean actualizarCliente(String nombre, String edad , String id , String direccion , String telefono) throws EmpleadoExceptions{
//			if(estadoEmpleado==EstadoEmpleado.ACTIVO){
				Cliente clienteAct = new Cliente(nombre, edad, id, direccion, telefono);
				if (id != null) {
					for (int i = 0; i < listaClientes.size(); i++) {
						if (listaClientes.get(i).getId().equals(id)) {
							listaClientes.set(i, clienteAct);

							// Guarda en el txt
							//Persistencia.guardarComprador(listaClientes);
							return true;
						}
					}
				}


			return false;
		}

		/**
		 * metodo utilizado para eliminar un cliente de la lista  de clientes   validando que el cliente existe
		 * obteniendo su id y verificando si el empleado esta activo
		 * @param cliente
		 * @throws EmpleadoExceptions
		 */

		public void eliminarCliente(Cliente cliente) throws EmpleadoExceptions  {
//			if(estadoEmpleado==EstadoEmpleado.ACTIVO){
				String idCliente = cliente.getId();

				for (int i = 0; i < listaClientes.size(); i++) {
					if (listaClientes.get(i).getId().equals(idCliente)) {
						listaClientes.remove(i);

						System.out.println("Se elimino el cliente.");
						//Persistencia.guardarCliente(listaClientes);
						break;
					}else System.out.println("no existe un cliente con esa id");

				}

			}



//-----------------------------------------------------------------------------------------------------------------------------------------------
		// login administrador

		public void crearAdministrador(){
			listaAdministradores.add(new Administrador("kevin","19","1058",4000 ,"123"));
		}
		public Administrador iniciarSesionAdministrador(String idAdmin, String contrasenia)
				throws FileNotFoundException, IOException, AdministradorException {
			Administrador administradorIS = validarAdministrador(idAdmin, contrasenia);
			if (administradorIS != null) {
				return administradorIS;
			} else {
				throw new AdministradorException("Usuario no existe");
			}

		}

		private Administrador validarAdministrador(String idAdmin, String contrasenia)
				throws FileNotFoundException, IOException {
			ArrayList<Administrador> administradores = listaAdministradores;

			for (int indiceAdministrador = 0; indiceAdministrador < administradores.size(); indiceAdministrador++) {
				Administrador adminAux = administradores.get(indiceAdministrador);
				if (adminAux.getId().equals(idAdmin)
						&& adminAux.getContrasenia().equalsIgnoreCase(contrasenia)) {
					return adminAux;
				}
			}
			return null;
		}

		public Administrador CargarAdministrador(String idUsuario) throws IOException {

			ArrayList<Administrador> contenido = listaAdministradores;
			Administrador administrador = new Administrador();
			for (int i = 0; i < contenido.size(); i++) {
				if (listaAdministradores.get(i).getId().equals(idUsuario)) {
					administrador = listaAdministradores.get(i);
					return administrador;
				}
			}
			return null;
		}
		/*
		 * Metoodo que permite buscar un administrador en especifico y retornarlo.
		 */
		public Administrador leerAdministrador(String id) {
			if (id != null) {
				for (Administrador c : listaAdministradores) {
					if (c.getId().equals(id))
						return c;
				}
			}
			return null;
		}



		// login empleado
		public Empleado iniciarSesionEmpleado(String empleado, String contrasenia)
				throws FileNotFoundException, IOException, EmpleadoExceptions {
			Empleado empleadoIs = validarEmpleado(empleado, contrasenia);
			if (empleadoIs != null) {
				return empleadoIs;
			} else {
				throw new EmpleadoExceptions(" no existe el empleado " + empleado + "");
			}

		}

		/*
		 * Metodo que permite validar que los datos que ingreso el empleado en el
		 * login, si sean verdaderos
		 */
		private Empleado validarEmpleado(String empleado, String contrasenia) throws FileNotFoundException, IOException {
			ArrayList<Empleado> empleados = listaEmpleados;

			for (int indiceEmpleado = 0; indiceEmpleado < empleados.size(); indiceEmpleado++) {
				Empleado empleadoAux = empleados.get(indiceEmpleado);
				if (empleadoAux.getNombre().equalsIgnoreCase(empleado)
						&& empleadoAux.getId().equalsIgnoreCase(contrasenia)) {
					return empleadoAux;
				}
			}
			return null;
		}
		public Empleado cargarEmpleado(String idUsuario) throws IOException {

			ArrayList<Empleado> contenido = listaEmpleados;
			Empleado empleado = new Empleado();
			for (int i = 0; i < contenido.size(); i++) {
				if (listaEmpleados.get(i).getId().equals(idUsuario)) {
					empleado = listaEmpleados.get(i);
					return empleado;
				}
			}
			return null;
		}
	}