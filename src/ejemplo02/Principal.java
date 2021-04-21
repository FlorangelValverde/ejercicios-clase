package ejemplo02;

public class Principal {
	
	public static void main (String [] args) {
		String [] nombres = {"carlos", "juan", "cesar","alejando", 
				"fernando", "marcos", "julio", "daniel" , "david", "samuel"};
		for (String nombre : nombres) {
			Hilo1 h1 = new Hilo1 (nombre);
			Thread  h2 = new Thread(h1);
			h2.start();
		}
	}
}
