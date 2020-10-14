package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		//Obtención del bean
	
		Empleados Juan = contexto.getBean("miEmpleado",Empleados.class);
		System.out.println(Juan);
		
		//Cerrar el contexto
		contexto.close();
		
		
	}

}
