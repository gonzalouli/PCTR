package Elipse;

import java.util.Scanner;

public class usoElipse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		Elipse mielipse=new Elipse();
		
		System.out.println("Dame dos focos para tu elipse: ");
		
		float foco1[]=new float[2];
		float foco2[]=new float[2];

		for(int i=0;i<2;i++)
			foco1[i]=scan.nextFloat();
		
		mielipse.damefoco1(foco1);
		
		for(int i=0;i<2;i++)
			foco1[i]=scan.nextFloat();
		mielipse.damefoco2(foco2);
		
		System.out.println("Dame la longitud de los ejes: ");
		
		mielipse.dameejes(scan.nextFloat(),scan.nextFloat());
		
		System.out.println("Dame un punto cualquiera para saber si está dentro de tu elipse :");

		mielipse.damepuntos(scan.nextFloat(),scan.nextFloat());
	
		mielipse.esvalido();
		
	}

}
