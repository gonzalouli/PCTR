import java.util.*;

public class NewtonRaphson {

	public static void main(String[] args) {
		///Aproximacion inicial
		///Numero de iteraciones
		System.out.println("Primera funcion: f(x)=cos(x)-x³ en [0,1]");
		
		System.out.println("Dame la aproximacion inicial entre 0 y 1: ");
		
		Scanner init=new Scanner(System.in);
		float x0=init.nextFloat();

		System.out.println("Dame el numero de iteraciones: ");
		
		Scanner numiter=new Scanner(System.in);
		float iter=numiter.nextFloat();
		
		double x1;
		
		for(float i=0;i<iter;i++) {
			
			x1= (x0-(Math.cos(x0)-Math.pow(x0, 3))/((-1)*Math.sin(x0)-3*Math.pow(x0,2)));
			
			System.out.print("\nIter "+i+": "+x1);
			
			x0= (float) x1;
		}
		
		
		System.out.println("\nSegunda funcion: f(x)=x²-5 en [2,3]");
		System.out.println("Dame la aproximacion inicial entre 2 y 3: ");
		
		Scanner init2=new Scanner(System.in);
		float x02=init2.nextFloat();

		System.out.println("Dame el numero de iteraciones: ");
		
		Scanner numiter2=new Scanner(System.in);
		float iter2=numiter2.nextFloat();
		
		double x12;
		
		for(float i=0;i<iter2;i++) {
			
			x12= (x02*x02 -5)-(x02*x02-5)/(2*x02);
			
			System.out.print("\nIter "+i+": "+x12);
			
			x02= (float) x12;
		}

		

		
		
		
		
	}

}
