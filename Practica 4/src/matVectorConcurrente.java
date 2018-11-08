import java.util.Random;
import java.util.Scanner;

public class matVectorConcurrente implements Runnable {	
	private int [][]matriz;
	private int []vector;
	private int i;
	private int sol[];

	public matVectorConcurrente(int [][]matriz, int [] vector,int i, int [] solucion) {
		this.matriz = matriz;
		this.vector = vector;
		this.sol = solucion;
		this.i = i;
	}
	
	public void run() {
		sol[i]=0;
		for(int j = 0;j < vector.length; j++)
			sol[i] = sol[i]+vector[j]*matriz[i][j];
	}
		
	
	
	public static void main(String[] args) throws Exception{		
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
					matriz[i][j]=(int)rand.nextFloat()*100;
					if(i==x-1)
						vector[j]=(int)rand.nextFloat()*100;
				}
			}
		}
		matVectorConcurrente []mulm=new matVectorConcurrente[x];
		
		
		for(i=0;i<mulm.length;i++) {
			
			mulm[i] = new matVectorConcurrente(matriz,vector,i,solucion);
			
		
		}
					
		for(i=0 ; i<mulm.length;i++) {
			new Thread(mulm[i]).start();
		}
		for(i=0 ; i<mulm.length;i++)
			new Thread(mulm[i]).join();
	
		for( i=0;i<x;i++)
			System.out.print( solucion[i]+",");
	}	
}

