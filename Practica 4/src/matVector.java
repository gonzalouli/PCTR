import java.util.Random;
import java.util.Scanner;

public class matVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.println("Deme las dimensiones de la matriz: ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int [][]matriz=new int[x][y];
		int []vector=new int [y];

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
			

	int[] solucion=new int[x];
	int sol;
	for(i=0;i<x;i++) {
			sol=0;
			for(j=0;j<y;j++) {
				
				sol+=matriz[i][j]*vector[j];
				
			}
		solucion[i]=sol;
					
		}
		
	}
}
}
