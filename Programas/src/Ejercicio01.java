import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String args[]) {
		double radio;
		double perimetro;
		double area;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Hola usuario");
		System.out.println("Este programa calcula areas y perimetros de circulos ");
		System.out.println("Ingresa el valor de tu radio = ");
		radio = entrada.nextDouble();
		area = Math.PI * Math.pow(radio, 2);
		perimetro = Math.PI * 2 * radio;

		System.out.println("area = " + area);
		System.out.println("perimetro = " + perimetro);
	}

}
