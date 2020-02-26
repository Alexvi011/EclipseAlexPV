import java.util.Scanner;
public class Ejercicio43 {
	public static void main(String args[]){
		double a;
		double b;
		double c;
		double x1,x2;
		double ecuacion;
		double raiz;
		double imaginaria;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa el valor de a: ");
		a=entrada.nextDouble();
		while(a==0){	
		System.out.println("El valor de -a- no puede ser cero:");
		a=entrada.nextDouble();
		}
		System.out.println("Ingresa el valor de b: ");

		b=entrada.nextDouble();
		System.out.println("Ingresa el valor de c: ");
		c=entrada.nextDouble();
		imaginaria=(Math.pow(b, 2))-4*a*c;
		raiz= Math.sqrt(imaginaria);
		if(imaginaria<0){
			System.out.println("La raiz es imaginaria");
			
		}else{
			
		
			
		x1=((-(b))+raiz)/2*a;
		
		
		x2=(((-(b))-raiz)/2*a);
		
		System.out.println("El valor de x1= "+x1);
		System.out.println("El valor de x2= "+x2);
	}
	}
	
	}

