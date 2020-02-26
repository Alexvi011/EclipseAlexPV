import java.util.Scanner;

public class Ejercicio33 {
	public static void main(String args[]) {
		int a;
		int b;
		int c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Intervalo inicial : ");
		a = entrada.nextInt();
		System.out.println("Intervalo final : ");
		b = entrada.nextInt();
		System.out.println("Numero : ");
		c = entrada.nextInt();
		if (a <= c && c <= b) {
			System.out.println("El tercero esta dentro del intervalo");
		} else {
			System.out.println("El tercero no esta dentro del intervalo");
		}
	}

}
