import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int n;
		int s;
		int cont;
		System.out.println("Introduce un numero: ");
		n = entrada.nextInt();
		s = 0;
		cont = 0;
		while (n >= 1) {
			s = s + n;
			cont++;
			System.out.println("Introduce otro numero: ");
			n = entrada.nextInt();

		}
		if (n <= 0) {
			System.out.println("La suma es: " + s);
		}
	}

}
