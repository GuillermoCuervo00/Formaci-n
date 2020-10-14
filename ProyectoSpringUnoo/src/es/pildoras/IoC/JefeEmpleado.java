package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	public String getTareas() {
		return "Gestionar  la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: "+informeNuevo.getInforme();
	}
}