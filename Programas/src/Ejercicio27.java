import java.util.Scanner;

public class Ejercicio27 {
	public static void main(String args[]) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		numero = entrada.nextInt();

		for (int i = 1; i <= numero; i++)
			;
		{
			for (int j = 1; j <= numero; j++)
				System.out.print("*");
		}

	}

}
