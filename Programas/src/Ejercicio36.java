import java.util.Scanner;

public class Ejercicio36 {
	public static void main(String argss[]) {
		float pelicula1;
		float pelicula2;
		float pelicula3;
		float total;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el precio de la primer pelicula: ");
		pelicula1 = entrada.nextFloat();
		System.out.println("Introduzca el precio de la segunda pelicula: ");
		pelicula2 = entrada.nextFloat();
		System.out.println("Introduzca el precio de la tercera  pelicula: ");
		pelicula3 = entrada.nextFloat();

		if(pelicula1 > pelicula2 && pelicula1 > pelicula3) {
			total = pelicula2 + pelicula3;
			System.out
					.println("El coste total del alquiler de las peliculas es: "+ total);
		}else if(pelicula2 > pelicula1 && pelicula2 > pelicula3) {
			total = pelicula1 + pelicula3;
			System.out
					.println("El coste total del alquiler de las peliculas es: "+total);
		}else{
			total = pelicula2 + pelicula1;
			System.out
					.println("El coste total del alquiler de las peliculas es: "+ total);
		}
	}

}
