
public class Persona {

	String nombre;
	byte edad;
	double estatura;
	
	void saludar() {
		System.out.println("Hola. Mi nombre es "+nombre);
		System.out.println("Encantado de conocerte");
	}
	
	void cumplirA�os() {
		edad++;
	}
	
	void crecer(double incremento) {
		estatura += incremento;
	}
	
}
