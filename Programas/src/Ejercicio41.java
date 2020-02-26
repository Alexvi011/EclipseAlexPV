import java.util.Scanner;
public class Ejercicio41 {
	public static void main(String args[]) {
		int valor1;
		int valor2;
		int resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el primer numero: ");
		valor1 = entrada.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		valor2 = entrada.nextInt();
		resultado = (valor1 + valor2) % (valor1 - valor2);
		if (resultado == 0) {
			System.out.println("Es exacta");

		} else {
			System.out.println("No es exacta");
		}
	}

}
