public class Ejemplohilos1 extends Thread{
	
	public Ejemplohilos1(int i) {
		// TODO Auto-generated constructor stub
	}

	public void Ejemplohilos1(int tope) {
		T=tope;
	}
	
	public void run	() {
		for (int i=0;i<=T;i++) {
			System.out.println(i);
		}
	}

	private int T;

}

	class PruebaHilo1{
		public static void main(String args[]) throws
			InterruptedException{
			
				Ejemplohilos1 hilo1=new Ejemplohilos1(5);
				Ejemplohilos1 hilo2=new Ejemplohilos1(20);
				
				hilo1.start();
				hilo2.start();
				
				hilo1.join();
				hilo2.join();
				System.out.println("Hilos terminados");
		
	}
}