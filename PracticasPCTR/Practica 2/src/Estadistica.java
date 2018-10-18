import java.util.Scanner;

public class Estadistica {

	public static void main(String[] args) {
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cuantos parámetros quiere introducir?: ");
		
		n=scan.nextInt();
		
		int[] parametros=new int[n];
		 
		 System.out.println("Introduzca los parametros separados de un intro: ");
		 
		 for(int i=0;i<parametros.length;i++) {
			 
			 parametros[i]=scan.nextInt();
			 	 
		 }
		 
		 System.out.println("Qué valor estadistico quiere obtener?");
		 System.out.println("1.Media 2.Moda 3.Varianza 4.Desviacion tipica");

		 int op=scan.nextInt();
		 float resultado=0; 

		 int acumulado;
		 double varianza;
		 int cont,cont1=0,var,i,j;
		 
		 
		 switch(op) {
		 
		 case 1:
			 for(i=0;i<parametros.length;i++)
				 
				 resultado+=parametros[i];
			 	System.out.println(resultado/parametros.length );
			 	
			break;
		 case 2:
			 
			 cont =0;
			 var=0;
			 
			 for(i=0;i<parametros.length;i++) {
				 for(j=i+1;j<parametros.length;j++) {
					 if(parametros[i]==parametros[j])
						 cont++;
				 }
				 if(cont>cont1)
					cont1=cont;
				 	var=i;
			 }
			 System.out.println("La moda es "+parametros[var]);
			 
			 break;
			 
		 case 3:
			 
			acumulado=0;
			 
			 for(i=0;i<parametros.length;i++)
				 acumulado+=Math.pow(parametros[i],2);
			
			 for(i=0;i<parametros.length;i++)
				 resultado+=parametros[i];
			 	
		
			varianza=(1/n)*acumulado-Math.pow(resultado/parametros.length,2); 
			
			System.out.println("La varianza es "+varianza);
			
			 
			 break;
			 
		 case 4: 
			 
			 acumulado=0;
			 double desvtipica;
			 
			 for(i=0;i<parametros.length;i++)
				 acumulado+=Math.pow(parametros[i],2);
			
			 for(i=0;i<parametros.length;i++)
				 resultado+=parametros[i];
			 	
		
			varianza=(1/n)*acumulado-Math.pow(resultado/parametros.length,2); 
			desvtipica=Math.sqrt(varianza);
			
			System.out.println("La desviacion tipica es "+desvtipica);
			 
			break;
			 
		 }		
	}
}