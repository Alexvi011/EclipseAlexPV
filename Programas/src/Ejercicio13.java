import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String args[]) {
		int numero1;
		int numero2;
		int cont;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu numero1: ");
		numero1 = entrada.nextInt();
		System.out.println("Ingresa tu numero2: ");
		numero2 = entrada.nextInt();
		cont = 1;
		while (numero1 <= numero2) {
			System.out.println(+numero1);
			cont = numero1 + 1;
			numero1 = cont;
		}

	}

}
