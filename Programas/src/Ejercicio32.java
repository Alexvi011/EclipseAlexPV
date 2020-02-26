import java.util.Scanner;

public class Ejercicio32 {
	public static void main(String[] args) {
		int A;
		int B;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca valor de A: ");
		A = entrada.nextInt();
		System.out.print("Introduzca Valor de B: ");
		B = entrada.nextInt();
		System.out.println("Valores iniciales: A = " + A + "   B = " + B);
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
	}

}
