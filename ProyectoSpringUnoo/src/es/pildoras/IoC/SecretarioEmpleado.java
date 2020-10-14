package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

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

	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getInforme() {
		return "Informe generado por el secretario: "+informeNuevo.getInforme();
	}

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}
	
}
