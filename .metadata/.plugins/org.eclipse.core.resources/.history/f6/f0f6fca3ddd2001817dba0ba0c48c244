import java.util.Scanner;

public class Ack {

	public static void main(String[] args) {
		
		System.out.println("Introduce los valores de la funcion ackerman separados por intro");;
		Scanner scan=new Scanner(System.in);
		
		long m=scan.nextInt();
		long n=scan.nextInt();
			
		
		System.out.println(ackermann(m,n));
	}		
		
	
static long ackermann(long m,long n){
    if(m == 0){
        return (n + 1);
    }else if(m > 0 && n == 0){
        return ackermann(m - 1, 1);
    }else{
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}



	}