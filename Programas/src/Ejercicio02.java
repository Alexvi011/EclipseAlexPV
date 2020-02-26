import java.util.Scanner;

public class Ejercicio02 {
	static final float SALARIO = 125.38f;

	public static void main(String args[]) {
		float dias;
		float salariomensual;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Hola usuario");
		System.out.println("Este programa calcula el salario mensual ganado por los dias trabajados en el mes ");
		System.out.println("Ingresa los dias = ");
		dias = entrada.nextFloat();
		salariomensual = dias * SALARIO;
		System.out.println("Tu salario mensual es: " + salariomensual+ " pesos");
	}

}
