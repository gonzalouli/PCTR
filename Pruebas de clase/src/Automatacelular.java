import java.util.Random;

public class Automatacelular {

	public static void main(String[] args) {

		 int N=3;
		///celdas de 0 a 10⁷-1
		///n=3 con funcion de transicion dada por xi-1(t)+xi(t)+xi+1(t) mod 3
		
		 int[] array=new int[10^7];
		 int[] aux;
		 
		 Random rnd=new Random();
				 
		 for(int i = 0; i < array.length ; i++) {
			 
			 array[i]=rnd.nextInt(N);	 
		 
			 System.out.print(array[i]+"," );
		 }
		 
		 System.out.println("");
	
		 
		for(int gen=0; gen< 10;gen++) {
		 
			aux =new int[array.length];
		 
		for(int i=0;i<array.length;i++) {			
			
			
				if(i==0) {
					aux[i]=(array[array.length-1]+array[i]+array[i+1])%3;
					
				}else if(i==array.length-1)
					
						aux[i]=(array[array.length-1]+array[i]+array[0])%3;
					
						else
						
						aux[i]=(array[i-1]+array[i]+array[i+1])%3;
				
				System.out.print(aux[i]+",");
				
				
			}
		
		System.out.println("");
		
		array=aux;
			
		
		 }
		
	}

}
