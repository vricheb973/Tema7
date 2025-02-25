package diapositivas.diapositiva41;

public class Main {

	public static void main(String[] args) {

		himnoAndalucia();

	}
	
	public static void cumpleanos() {
		Piano p = new Piano();
		p.add(Nota.DO);
		p.add(Nota.DO);
		p.add(Nota.RE);	
		p.add(Nota.DO);
		p.add(Nota.FA);
		p.add(Nota.MI);
		

		p.add(Nota.DO);
		p.add(Nota.DO);
		p.add(Nota.RE);
		p.add(Nota.DO);
		p.add(Nota.SOL);
		p.add(Nota.FA);

		p.add(Nota.DO);
		p.add(Nota.DO);
		p.add(Nota.DO);
		p.add(Nota.LA);
		p.add(Nota.FA);
		p.add(Nota.MI);
		p.add(Nota.RE);
		
		p.add(Nota.SI);
		p.add(Nota.SI);
		p.add(Nota.LA);
		p.add(Nota.FA);
		p.add(Nota.SOL);
		p.add(Nota.FA);
		
		p.interpretar();
	}
	
	public static void himnoAndalucia() {
		Piano p = new Piano();

		// Primera parte
		p.add(Nota.DO);
		p.add(Nota.RE);
		p.add(Nota.MI);
		p.add(Nota.FA);
		p.add(Nota.LA);
		p.add(Nota.SOL);
		p.add(Nota.FA);
		p.add(Nota.SOL);
		p.add(Nota.RE);
		p.add(Nota.LA);
		p.add(Nota.LA);
		p.add(Nota.LA);

		p.add(Nota.SI);
		p.add(Nota.LA);
		p.add(Nota.SOL);
		p.add(Nota.FA);
		p.add(Nota.SOL);
		p.add(Nota.FA);
		p.add(Nota.MI);
		
		p.add(Nota.DO);
		p.add(Nota.RE);
		p.add(Nota.MI);
		p.add(Nota.FA);
		p.add(Nota.LA);

		// Segunda parte
		p.add(Nota.SOL);
		p.add(Nota.FA);
		p.add(Nota.SOL);
		p.add(Nota.RE);
		p.add(Nota.LA);
		p.add(Nota.LA);

		p.interpretar();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
