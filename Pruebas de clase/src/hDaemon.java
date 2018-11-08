
public class hDaemon extends Thread {

	public void run() {
		System.out.println("Yo se concurrencia");
		while(true) {
			///esperar evento
			///procesar evento
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		hDaemon dae=new hDaemon();
		dae.setDaemon(true);
		dae.start();
		dae.join();
				
	}

}
