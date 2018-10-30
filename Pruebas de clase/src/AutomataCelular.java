import java.util.Random;

public class AutomataCelular extends Thread  {

	 static int[] array=new int[10];
	 int inicio,fin;
	 
	public AutomataCelular(int inicio, int fin) {
		
		this.inicio=inicio; this.fin=fin;	}
	 
	public void run() {
		
		for(int gen=0; gen< 10;gen++) {
			for(int i=0;i<array.length;i++) {			
						
				if(i==0) {
					array[i]=(array[array.length-1]+array[i]+array[i+1])%3;
					
				}else if(i==array.length-1)
					
						array[i]=(array[array.length-1]+array[i]+array[0])%3;
					
						else
						
						array[i]=(array[i-1]+array[i]+array[i+1])%3;
				
				System.out.print(array[i]+",");
		
		
		
		
		}
	}
	}
			public static void main (String[] args) throws Exception {

				 int N=3;
				///celdas de 0 a 10⁷-1
				///n=3 con funcion de transicion dada por xi-1(t)+xi(t)+xi+1(t) mod 3
				
				 int[] aux;
				 
				 Random rnd=new Random();
						 
				 for(int i = 0; i < array.length ; i++) {
					 
					 array[i]=rnd.nextInt(N);	 
				 
					 System.out.print(array[i]+"," );
				 }
				 
				 System.out.println(" ");
				 
				 
				 AutomataCelular[] hilos=new AutomataCelular[3];
				 
				 int tambloque=array.length / hilos.length;
				 int inicio=0;
				 
				 
				 for(int i=0;i<hilos.length;i++)
				 {
					 hilos[i] =new AutomataCelular(inicio,inicio+tambloque);
					 hilos[i].start();
					 inicio+=tambloque;
				 }
				 
				 hilos[hilos.length-1]=new AutomataCelular(inicio,array.length);
				 hilos[hilos.length-1].start();
				 
			
				 for(int i=0;i<hilos.length;i++) {
				 
				 hilos[i].join();
				 }
				 

						
						
					}		
			
				
			}
