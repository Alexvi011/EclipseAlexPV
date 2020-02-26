import java.util.Scanner;

public class Ejercicio26 {
	public static void main(String args[]) {
		System.out.println("Juego de adivinar numero entre 1  y 100");
		System.out.println("----------------------------------------");
		int valor = 0;
		int aleatorio = (int) (Math.random() * 100 + 1);

		Scanner entrada = new Scanner(System.in);
		System.out.println("Adivina mi numero: ");
		valor=entrada.nextInt();

		while(valor!=aleatorio){
			if(valor>aleatorio){
				System.out.println("El numero es menor ");
				valor=entrada.nextInt();
			}else {
				System.out.println("El numero es mayor");
				valor=entrada.nextInt();
			}if(valor==aleatorio){
				System.out.println("Ganaste");
	}
			
		}
		}
		
}
