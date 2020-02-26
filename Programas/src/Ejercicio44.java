import java.util.Scanner;
public class Ejercicio44 {
	public static void main(String args[]){
		int numero;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa tu numero: ");
		numero=entrada.nextInt();
		System.out.println("Los divisores son:");
		for(int i=1;i<=numero;i++){
			if(numero%i==0){
				System.out.println(i);
			}
		}
	}

}
