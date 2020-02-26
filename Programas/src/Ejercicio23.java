
public class Ejercicio23 {
	public static void main(String args[]) {
		int cont;
		cont = 1;

		while (cont <= 100) {
			System.out.print(+cont+" -");
			if (cont % 2 == 0) {
				System.out.println(" Par");
			} else {
				System.out.println(" Impar");
			}
			cont = cont + 1;
		}
		

	}

}
