package Complejos;

import javax.swing.JOptionPane;

public class Complejos {
	





public void suma(int []operando1, int [] operando2) {
	
	int[] resultado=new int[2];
	
	resultado[0]=operando1[0]+operando2[0];
	resultado[1]=operando1[1]+operando2[1];
	
	JOptionPane.showMessageDialog(null,"El resultado es: "+resultado[0]+"+"+resultado[1]+"i");
	
	
}

public void resta(int []operando1, int [] operando2) {
	
	int[] resultado=new int[2];
	
	resultado[0]=operando1[0]-operando2[0];
	resultado[1]=operando1[1]-operando2[1];
	
	JOptionPane.showMessageDialog(null,"El resultado es: "+resultado[0]+"+"+resultado[1]+"i");

	
}



public void producto(int []operando1, int [] operando2) {
	
	int[] resultado=new int[2];
	
	resultado[0]=operando1[0]*operando2[0];
	resultado[1]=operando1[1]*operando2[1];
	
	JOptionPane.showMessageDialog(null,"El resultado es: "+resultado[0]+"+"+resultado[1]+"i");

	
}

public void division(int []operando1, int [] operando2) {
	
	int[] resultado=new int[2];
	
	resultado[0]=operando1[0]/operando2[0];
	resultado[1]=operando1[1]/operando2[1];
	
	JOptionPane.showMessageDialog(null,"El resultado es: "+resultado[0]+"+"+resultado[1]+"i");

	
}

}


