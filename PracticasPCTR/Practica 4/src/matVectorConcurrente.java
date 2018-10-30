import java.util.Random;
import java.util.Scanner;

public class matVectorConcurrente implements Runnable {
	
	
	public int multiplicamatriz(int a,int b) {
		private int a,b,sol;
	
		
		
	}
		public void run() {
		
		
	}
	


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.println("Deme las dimensiones de la matriz: ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int [][]matriz=new int[x][y];
		int []vector=new int [y];
		int []solucion=new int [x];
		int i,j;
	
		System.out.println("1.Deseo introducir los parametros 2.Generarlos aleatoriamente");
		
		int opcion=scan.nextInt();
		
		if(opcion==1) {		
		
		System.out.println("Introduzca la matriz manualmente");
		
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				matriz[i][j]=scan.nextInt();			}
		}
		System.out.println("Dame el vector a multiplicar");
		for(i=0;i<y;i++) {
			vector[i]=scan.nextInt();
		}
		}
		else {
			
			for(i=0;i<x;i++) {
				for(j=0;j<y;j++) {
					matriz[i][j]=(int)rand.nextInt()*100;
					if(i==x-1)
						vector[j]=(int)rand.nextFloat()*100;
				}
			}
	
			multiplicamatriz[] mulm=new multiplicamatriz[x];
			
			
			for(i=0;i<mulm.length;i++) {
				
				///aqui hay que instanciar un nuevo hilo por cada entrada en el bucle
				mulm[i]=new multiplicamatriz(i,j);
				mul[i].start();
			}


	}
	}
}
