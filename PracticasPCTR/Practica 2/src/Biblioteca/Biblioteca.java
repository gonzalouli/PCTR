package Biblioteca;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		
		Paciente[] p = new Paciente [100];
		
		Scanner opcion=new Scanner(System.in);
		
		int op, encontrado = 0;
		
		do { 
			System.out.println("Que desea hacer? 1.Añadir 2.Borrar 3.Consultar 0.Salir");
			op=opcion.nextInt();
			
			int i;
			
			switch(op) {
			case 1: for(i=0;i<p.length && encontrado==0;i++) {
					if(p[i]==null)
						encontrado=1;
				}
			
			p[i] = new Paciente();
			
				
				System.out.println("\nDame el nombre: ");
				p[i].direccion=opcion.nextLine();
				
				System.out.println("\nDame el telefono: ");
				p[i].telefono=opcion.nextLine();
				
				System.out.println("\nDame el nombre de su seguro: ");
				p[i].seguro=opcion.nextLine();

				if(i==p.length && encontrado== 0)
					System.out.println("No hay espacio en la clinica");
				break;
				
			case 2: 
				
				encontrado=0;
				
				System.out.println("Digame el nombre del paciente que desea borrar: ");
				
				String valor=opcion.nextLine();
				
				for(i=0;i<p.length && encontrado==0;i++) {
					
					if(p[i].nombre.equals(valor))
						encontrado=1;
						System.out.println("El paciente "+valor+" ha sido eliminado");
						
				}
				if(i==p.length-1 && encontrado==0)
					System.out.println("El paciente no se encuentra en la clinica");
					
				break;
				
			case 3:
				
				System.out.println("Que paciente desea consultar?");
				
				encontrado=0;
				
				valor=opcion.nextLine();
					
				for(i=0;i<p.length && encontrado ==0;i++) {
					if(p[i].nombre.equals(valor)) {
						encontrado=1;
						System.out.println(p[i].nombre);
						System.out.println(p[i].direccion);
						System.out.println(p[i].telefono);
						System.out.println(p[i].seguro);
					}
					
				}
				if(i==p.length-1 && encontrado==0)
					System.out.println("No existe el paciente en el sistema");
				
				break;
				
			default: System.out.println("Introduzca un parametro valido...");
			}
			
			}while(op!=0);
	}
}


	
								
			
			
		
	