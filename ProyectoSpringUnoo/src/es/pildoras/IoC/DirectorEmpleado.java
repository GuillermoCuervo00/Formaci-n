package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	//creacion de campo tipo creaciónInforme(interfaz)
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	//crear metodo Init. Ejecutar tareas antes de que el beam este disponible
	public void metodoInicial() {
		System.out.println("Dentro del método Init. Aquí irían las tareas a ejecutar antes de que el bean este listo");
	}
	
	//Metodo destroy destruye el bean una vez que ha sido utilizado
	public void metodoDestroy() {
		System.out.println("Dentro del método Destroy. Aquí irian las tareas a ejecutar despues de utilizar el bean");
	}
	
	
	//Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;		
	}
	
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: "+informeNuevo.getInforme();
	}
	
}
