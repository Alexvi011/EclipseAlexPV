import java.util.Scanner;

public class Ejercicio40 {
	public static void main(String args[]) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu numero: ");
		numero = entrada.nextInt();
		if (numero < 0) {
			numero = (-(numero));
		} else {
			numero = numero;
		}
		System.out.println("El resultado es: " + numero);
	}

}
