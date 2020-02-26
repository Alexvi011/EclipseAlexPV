import java.util.Scanner;
public class Ejercicio42 {
	public static void main(String args[]){
		int numero2=0;
		int anchura;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		anchura=entrada.nextInt();
		for(int i=0;i<anchura;i++){
			int numero1=anchura;
			while(numero1>numero2){
				System.out.print("*");
				numero1--;

		}
			numero2++;
		System.out.println("");
		}
	}

}
