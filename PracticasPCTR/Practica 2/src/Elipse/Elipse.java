package Elipse;

import java.util.Scanner;
import javax.lang.*;

public class Elipse {

	
	    private float []foco1=new float[2];
		
		private float []foco2=new float[2];
		
		private float [] centro;
		
		private float semiejemayor;
		
		private float semiejemenor;
		
		private float [] punto=new float[2];
	
public Elipse () {
	this.centro=new float[2];
	this.centro[0]=0;
	this.centro[1]=0;

}		


public void esvalido () {

	if( (Math.pow(this.punto[0]+this.centro[0],2))/(Math.pow(this.semiejemayor,2))+(Math.pow(this.punto[1]+this.centro[1],2))/(Math.pow(this.semiejemenor,2)) <=1 )
			System.out.println("El punto ("+this.punto[0]+","+this.punto[1]+") pertenece a la elipse");
	else
		System.out.println("El punto ("+this.punto[0]+","+this.punto[1]+") NO pertenece a la elipse");


}

public void damefoco1(float[] foco11) {
	
		this.foco1[0]=foco11[0];
		this.foco1[1]=foco11[1];
	
	}


public void damefoco2(float[] foco22) {
	
	this.foco2[0]=foco22[0];
	this.foco2[1]=foco22[1];

}

public void dameejes(float eje1,float eje2) {
	
	
	this.semiejemayor=eje1;
	this.semiejemenor=eje2;
	
	
}

public void damepuntos(float punto1,float punto2) {
	
	this.punto[0]=punto1;
	this.punto[1]=punto2;
	
}


}
