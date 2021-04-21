package ejemplo02;

public class Hilo1 extends Thread{
private String nombre;
public Hilo1(String nombre) {
	this.nombre=nombre;
}

	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(nombre + " come " + i);
		}
		
		System.out.println("terminó " +  nombre);
	}
	
}
