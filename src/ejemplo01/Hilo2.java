package ejemplo01;

public class Hilo2 implements Runnable{	
	
	@Override
	public void run() {
		int S=0;
		for (int x =1; x <=10; x++) {
			if (x%2!=0) {
				System.out.println(x);
				S=S+x;
			}
		}
		System.out.println("Suma de impares: "+S);
	}
}
