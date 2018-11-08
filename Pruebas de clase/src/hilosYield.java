
public class hilosYield extends Thread {

	static hilosYield[] hilos;
	boolean finalizado = false;
	
	public void run() {
		
		if(this.getName().equals("Thread-5")) {
			
		boolean todosfinalizados; 
			do {
			
				todosfinalizados=true;
				for(int i = 0;  i< hilos.length;i++) {
					if(hilos[i] != null && !hilos[i].finalizado && !hilos[i].getName().equals("Thread-5"))
						todosfinalizados=false;
				}
	
				if(!todosfinalizados) Thread.yield();
			}while(!todosfinalizados);
		}
			System.out.println("Hilo "+ getName() + " finaliza run");
			finalizado=true;
		
	}

	
	public static void main(String[] args) throws InterruptedException { /// hilo principal
		
		Thread.currentThread().setPriority(10);
		hilos= new hilosYield[10];
				
				for(int i=0;i<hilos.length;i++) {
					hilos[i] =new hilosYield();
					hilos[i].start();
				}
				
				for(int i=0; i<hilos.length;i++)
					hilos[i].join();
		
		System.out.println("Finaliza el programa");

	}

}
