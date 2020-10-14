
public class Persona {

	String nombre;
	byte edad;
	double estatura;
	
	void saludar() {
		System.out.println("Hola. Mi nombre es "+nombre);
		System.out.println("Encantado de conocerte");
	}
	
	void cumplirAños() {
		edad++;
	}
	
	void crecer(double incremento) {
		estatura += incremento;
	}
	
}
