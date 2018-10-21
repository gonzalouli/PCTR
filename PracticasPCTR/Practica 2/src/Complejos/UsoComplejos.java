package Complejos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsoComplejos {

	public static void main(String[] args) {
		
		int[] operando1=new int[2];
		int[] operando2=new int[2];
		
	Scanner num=new Scanner(System.in);
	
	Complejos mioperacion=new Complejos();
	
	System.out.println("Dame los opreandos deseados...");
	
	System.out.println("Operando1: ");
	
	
	
	int opcion=Integer.parseInt(JOptionPane.showInputDialog("Qué operacion elemental desea realizar? 1.SUMA 2.RESTA 3. PRODUCTO 4.DIVISION"));
	
	System.out.println("Dame los opreandos deseados...");
	
		operando1[0]=Integer.parseInt(JOptionPane.showInputDialog("Parte real del operando 1: "));
		operando1[1]=Integer.parseInt(JOptionPane.showInputDialog("Parte imaginaria del operando 1: "));
		operando2[0]=Integer.parseInt(JOptionPane.showInputDialog("Parte real del operando 2: "));
		operando2[1]=Integer.parseInt(JOptionPane.showInputDialog("Parte imaginaria del operando 2: "));
		
		
	switch(opcion) {
	
	case 1: 
		mioperacion.suma(operando1,operando2);
		break;
	case 2:
		mioperacion.resta(operando1, operando2);
		break;
	case 3:
		mioperacion.producto(operando1, operando2);
		break;
	case 4:
		mioperacion.division(operando1, operando2);
		break;
	}
	
	


}

}