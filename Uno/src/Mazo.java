import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	private ArrayList<Carta> mazo;

	public Mazo() {
		// El constructor crea un nuevo mazo
		// Hay 4 colores: rojo,azul,amarillo,verde
		// Cada palo tiene dos cartas del mismo numero exepto el 0(solo aparece
		// una vez en cada palo).
		// Por ejemplo: el palo verde tiene un solo cero
		mazo = new ArrayList<Carta>();
		String[] colores = { "RED", "BLU", "GRN", "YEL" };
		int[] numeros = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9,
				0 }; // cartas normales
		int[] numerosespeciales = { 2, 2, 4, 4 }; // cartas especiales

		for (String c : colores) { // añade cartas regulares a la mano
			for (int i : numeros) {
				mazo.add(new Carta(i, c)); // añade nuevas cartas a la mano
			}
		}
		for (int i : numerosespeciales) { // añade cartas especiales a la mano
			mazo.add(new Carta(i));
		}

	}

	public Mazo(ArrayList<Carta> c) { // constructor sobrecargado
		// En caso de que el mazo se quede vacio, se toman las cartas y se
		// revuelven en un nuevo mazo

		mazo = c;
	}

	public boolean Vacio() { // Checar si el mazo esta vacio
		// Checa el tamaño del mazo
		// Si es mayor que 0 regresa falso, sino regresa verdadero

		if (mazo.size() > 0) {
			return false;
		}
		return true;
	}

	public void barajear() {

		// Barajear la carta

		Collections.shuffle(mazo);

	}

	public Carta CartaSuperior() {
		// Obtiene la carta que este hasta arriba del mazo invertido
		return mazo.remove(mazo.size() - 1);
	}

	public Carta revolver() {

		return mazo.get(mazo.size() - 1);
	}

	public String toString() {

		String mazo = "";

		for (Carta c : this.mazo) {

			mazo = mazo + c + " ";
		}

		return mazo;
	}

}
