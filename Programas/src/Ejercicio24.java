import java.util.Scanner;
public class Ejercicio24 {
	public static void main(String args[]){
		int numeros[]=new int[10];
		int negativo=0;
		Scanner entrada = new Scanner(System.in);
		for(int i=0;i<10; i++){
			System.out.print("Intrduce el numero "+(i+1)+":");
			numeros[i]=entrada.nextInt();
			if(numeros[i]<0){
				negativo++;
				
			}
		
			
		}
		
		System.out.println("Los numeros negativos son: "+negativo);
		
	}
	
}
