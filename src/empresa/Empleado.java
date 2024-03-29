package empresa;

public class Empleado extends Persona {

	private double salario;

	public Empleado(String nombre, int edad, double estatura, double salario) {
		super(nombre, edad, estatura);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + this.getNombre() 
				+ ", edad=" + this.getEdad()
				+ ", estatura=" + this.getEstatura()
				+ ", salario=" + this.salario + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Empleado otro = (Empleado) obj;
		boolean result = false;
		
		if(super.equals(otro) && 
				this.salario == otro.salario) {
			result = true;
		}
		
		return result;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
