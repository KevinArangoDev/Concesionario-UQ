package co.uniquindio.concesionario.model;

import java.util.ArrayList;

public class Administrador extends Persona {
	/**
	 * Declaracion de atributos
	 */

	private double sueldo;
	private ArrayList<Empleado> listaEmpleados;


	/**
	 * Constructor de la clase administrador con los atributos de su superclase persona
	 * @param nombre
	 * @param edad
	 * @param id
	 * @param sueldo
	 * @param listaEmpleados
	 */

	public Administrador(String nombre, String edad, String id, double sueldo, ArrayList<Empleado> listaEmpleados) {
		super(nombre, edad, id);
		this.sueldo = sueldo;
		this.listaEmpleados = listaEmpleados;

	}

	//constructor vacio
	public Administrador(String nombre, String edad, String id) {
		super(nombre, edad, id);


	}

	/**
	 * Getters and setter y metodo toString
	 * @return
	 */
//-------------------------------------------------------------------------------
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	@Override
	public String toString() {
		return "Administrador [sueldo=" + sueldo + "]";
	}

//-----------------------------------------------------------------------------------------------


	/**
	 * metodo para agregar un empleado a la lista de empleados  , validando si el empleado ya existe segun su id
	 * @param cliente
	 */

	public void agregarEmpleado(Empleado empleado)  {
		int bandera = 0;
		for (int i = 0; i < listaEmpleados.size() && bandera == 0; i++) {
			if (listaEmpleados.get(i).getId().equals(empleado.getId())) {
				bandera = 1;
			}
		}
		if (bandera == 0) {
			listaEmpleados.add(empleado);
		//	Persistencia.guardarEmpleado(listaEmpleados);
			System.out.println("Se agrego un nuevo empleado .");
		} else {
			System.out.println("Este empleado con esa id  ya existe");
		}

	}

	/**
	 * metodo utilizado para actualizar un empleado , validando si este existe segun su id
	 * @param nombre
	 * @param edad
	 * @param id
	 * @param cargo
	 * @param sueldo
	 * @return
	 */
	public boolean actualizarEmpleado(String nombre, String edad, String id, String cargo, double sueldo , EstadoEmpleado estadoEmpleado){
		Empleado empleadoAux = new Empleado(nombre, edad , id , cargo , sueldo , estadoEmpleado );
		if (id != null) {
			for (int i = 0; i < listaEmpleados.size(); i++) {
				if (listaEmpleados.get(i).getId().equals(id)) {
					listaEmpleados.set(i, empleadoAux);

					// Guarda en el txt
					//Persistencia.guardarComprador(listaClientes);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * metodo utilizado para eliminar un empleado de la lista  de empleados   validando que el empleado existe
	 * obteniendo su id
	 * @param cliente
	 */

	public void eliminarEmpleado(Empleado empleado)  {

		String idEmpleado = empleado.getId();

		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getId().equals(idEmpleado)) {
				listaEmpleados.remove(i);

				System.out.println("Se elimino el empleado.");
				//Persistencia.guardarCliente(listaClientes);
				break;
			}else{
				System.out.println("no existe un empleado con esa id");

			}

		}
	}
	public void bloquearEmpleado(Empleado empleado){
		String idEmpleado = empleado.getId();

		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getId().equals(idEmpleado)) {
				 listaEmpleados.get(i).setEstadoEmpleado(EstadoEmpleado.BLOQUEADO);

				System.out.println("Se bloqueo el empleado. " + getNombre());
				break;
			}else{
				System.out.println("no existe un empleado con esa id");

			}

		}
	}




}
