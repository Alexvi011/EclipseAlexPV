import java.util.Scanner;

public class Ejercicio28 {
	public static void main(String args[]) {
		double promedio = 0;
		int suma = 0;
		int numeros[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Intrduce el numero " + (i + 1) + ":");
			numeros[i] = entrada.nextInt();
			suma = suma + numeros[i];
			promedio = (double) suma / 10;
		}
		System.out.println("La suma es: " + suma);
		System.out.println("El promedio es: " + promedio);
	}

}
