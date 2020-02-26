import java.util.Scanner;
public class Ejercicio18 {
	public static void main(String args[]){
		int cont;
		int multiplo;
		int valor;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa el numero que quieras multiplicar: ");
		valor=entrada.nextInt();
		cont=1;
		multiplo=valor;
		while (cont<=100){
			System.out.println( +cont+"*"+valor+"=" +multiplo);
			cont =cont+1;
			multiplo=cont*valor;
		}
	}

}


