
public class ParIMparConRunnable implements Runnable {

	int veces;boolean par;
	
	public void ParImpar(int veces, boolean par) {
		
		this.veces=veces; 
		this.par=par;
		
	}
	
	public void run() {
		
		for(int i=0; i<veces;i++) {
			if(par) {
				if(i%2 ==0)
			System.out.print(" "+i);
				else {
					if(i%2==1)
						System.out.print(" "+i);
				}
		}
			}
	}
	
	public static void main(String[] args) throws Exception ///para que el sistema genere
	///excepciones de tipo InterruptedException
	{

		
		ParImpar tarea1 = new ParImpar(100,true);
		ParImpar tarea2 =new ParImpar(100,true);
		
		Thread hilo1=new Thread(tarea1);
		Thread hilo2=new Thread(tarea2);
		///Con Thread si se utiliza herencia, ya no podrá heredar mas de otra clase
		
		hilo1.start();
		hilo2.start();
		//try(
		hilo1.join();
		hilo2.join();
		//)catch(InterruptedException e);

		
		
	}

}
