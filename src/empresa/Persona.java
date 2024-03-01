package empresa;

public class Persona extends Object {

	private String nombre;
	private int edad;
	private double estatura;
	
	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		setEdad(edad);
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad < 18) {
			throw new IllegalArgumentException("Solo mayores de 18 años.");
		}
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre 
				+ ", edad=" + this.edad 
				+ ", estatura=" + this.estatura 
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {	
		Persona otra = (Persona) obj;
		boolean result = false;
		
		if(this.nombre.equals(otra.nombre) && 
				this.edad == otra.edad && 
				this.estatura == otra.estatura) {
			result = true;
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
