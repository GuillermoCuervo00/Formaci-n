package es.pildoras.pruebaanotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[]args) {
		//leer el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		//pedir un bean al contenedor
		Empleados Antonio = contexto.getBean("comercialExperimentado",Empleados.class);
		
		//usar el beam
		System.out.println(Antonio.getTareas());
		
		System.out.println(Antonio.getInformes());
		
		//cerrar el contexto
		contexto.close();
	}
	
}
