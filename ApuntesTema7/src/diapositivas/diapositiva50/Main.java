package diapositivas.diapositiva50;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ListaNumeros l = new ListaNumeros();
		
		int numero;
		
		do {
			System.out.print("Dime un número: ");
			numero = sc.nextInt();
			
			if(numero >= 0) {
				l.encolar(numero);
			}
		}
		while(numero >= 0);
		
		
		while(l.elementos() > 0) {
			System.out.println(l.desencolar());
		}
		
		
		
		

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
