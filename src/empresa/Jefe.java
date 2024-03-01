package empresa;

public class Jefe extends Empleado {
	
	private String cargo;
	
	public Jefe(String nombre, int edad, double estatura, double salario, String cargo) {
		super(nombre, edad, estatura, salario);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Jefe [nombre=" + this.getNombre()
				+ ", edad=" + this.getEdad()
				+ ", estatura=" + this.getEstatura()
				+ ", cargo=" + cargo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Jefe otro = (Jefe) obj;
		boolean result = false;
		
		if(super.equals(otro) && 
				this.cargo.equals(otro.cargo)) {
			result = true;
		}
		
		return result;
	}
	
	
	
	

}
