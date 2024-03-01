package empresa;

public class Main {

	public static void main(String[] args) {
		Jefe j1 = new Jefe("vladi", 31, 1.80, 8000.0, "Presidente honorífico");
		Empleado e1 = new Empleado("Adri J.", 18, 1.60, 2.0);
		Persona p1 = new Persona("Adri J.", 18, 1.60);
		
		Persona personas[] = new Persona[3];
		personas[0] = j1;
		personas[1] = e1;
		personas[2] = p1;
		
//		System.out.println(e1.equals(p1));
		
		for(Persona p : personas) {
			System.out.println(p.toString());
		}
		
		
		

	}

}
