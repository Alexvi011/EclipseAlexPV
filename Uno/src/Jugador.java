import java.util.ArrayList;
import java.util.Scanner;


public class Jugador {
	private ArrayList<Carta> CartasJugador; 
	private String nombre; //Nombre del jugador
	
	public Jugador(String nombre) {
		/*
		 * creates a array list that will store player cards
		 * assigns name to the player
		 */
		
		//player object are created in uno class
		
		CartasJugador = new ArrayList<Carta>();
		this.nombre = nombre;
		
	}
	
	public int numerodecartas() {
		
		return CartasJugador.size();
	}
	
	public ArrayList<Carta> CartasJugador(){
		//devuelve todas las cartas que el jugador tiene en la mano con un ArrayList
		
		
		return CartasJugador;
	}
	
	
	public void tomarCarta(Carta c) {
		
		CartasJugador.add(c);
		
	}
	
	public Carta LanzarTarjeta(int c) {
		// el jugador lanza una carta de la mano que está en la posición 'c'. c es un valor entero y se pasa como un argumento.
	
		return CartasJugador.remove(c);
	}
	
	public void DecirUno() {
		//El jugador dice uno si solo tiene una carta en la mano
		
		Scanner s = new Scanner(System.in);
		
		if (CartasJugador.size()==1){
			
			System.out.println("Uno");
			System.out.println("Presiona Enter...");
			s.nextLine();
		}
	}
	
	
	public void MostrarCartas() {
		//Esta es la representación gráfica de una tarjeta.
		//Solo para hacer que las cartas se vean mas como las cartas
		// utilizado en el método showboard () en la clase Uno
		
		
		String[] carta = {" ----- ","|     |","|     |"," ----- "};
		String c = "";
		
		
		for(int i=0;i<carta.length;i++) {
				
			for(int j=0;j<CartasJugador.size();j++) {
					
				if(!CartasJugador.get(j).CartaEspecial()) {
					if(i==1) {
						
						c = c +"| "+CartasJugador.get(j).obtenerColor()+" |"+" ";
						
					}
					
					else if(i==2) {
						
						c = c + "|  "+CartasJugador.get(j).obtenerValor()+"  |"+" ";
					}
					
					else {
						c = c + carta[i]+" "; 
					}
					
					}
				
				else if(CartasJugador.get(j).CartaEspecial()) {
					
					if(i==1) {
						
						c = c +"| "+"+"+CartasJugador.get(j).obtenerValor()+"  |"+" ";
						
					}
					else {
						c = c + carta[i]+" ";
					}
					
				}
				
					}
				
				c +="\n";
				
			}
				
		
		
		
		System.out.print(c);
	}
	
	public void ocultarCartas() {
		//Ocultar cartas del jugador
		//utilizado en el método showboard () en la clase Uno
		
		String[] carta = {" ----- ","|     |","|     |"," ----- "};
		String c = "";
		
		
		for(int i=0;i<carta.length;i++) {
				
			for(int j=0;j<CartasJugador.size();j++) {
		
				c = c + carta[i]+" ";
		
			}
		c+="\n";
		}
		
		System.out.print(c);
	}
	
	public boolean Victoria() {
		/*
		 * Verifica si el jugador gano o no
		 */
		if(CartasJugador.size()==0) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		/*
		 * Muestra el nombre del jugador
		 */
		return this.nombre;
	}
	
	
	

}
