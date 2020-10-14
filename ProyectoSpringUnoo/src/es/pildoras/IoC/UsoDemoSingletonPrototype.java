package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//carga xml configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		SecretarioEmpleado Mar�a = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		SecretarioEmpleado Manolo = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		SecretarioEmpleado Ana = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(Mar�a);
		
		System.out.println(Pedro);
		
		System.out.println(Manolo);
		
		System.out.println(Juan);
		
		System.out.println(Ana);
		
		if(Mar�a == Pedro) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");

	}

}
