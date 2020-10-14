package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[]args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
		
//		System.out.println(Juan.getTareas());
		
//		System.out.println(Juan.getInforme());
		
		SecretarioEmpleado María=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(María.getTareas());
		
		System.out.println(María.getInforme());
		
		System.out.println(María.getEmail());
		
		System.out.println(María.getNombreEmpresa());
		
		System.out.println("Email de pablo: "+Pablo.getEmail());
			
	
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());
		
		contexto.close();
		
	}
	
}
