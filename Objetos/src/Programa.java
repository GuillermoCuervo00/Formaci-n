
public class Programa {
	public static void main(String [] args) {
		
		Persona p = new Persona();
		System.out.println(p);
		p.nombre = "Pepa";
		p.edad = 18;
		p.estatura = 1.87;
		
		p.saludar();
		System.out.println(p.edad + " años");
		p.cumplirAños();
		System.out.println(p.edad +" años");
		
	}
	
	
}
