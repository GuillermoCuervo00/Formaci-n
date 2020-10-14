package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[]args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
		
//		System.out.println(Juan.getTareas());
		
//		System.out.println(Juan.getInforme());
		
		SecretarioEmpleado Mar�a=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(Mar�a.getTareas());
		
		System.out.println(Mar�a.getInforme());
		
		System.out.println(Mar�a.getEmail());
		
		System.out.println(Mar�a.getNombreEmpresa());
		
		System.out.println("Email de pablo: "+Pablo.getEmail());
			
	
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());
		
		contexto.close();
		
	}
	
}
