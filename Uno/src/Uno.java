import java.util.ArrayList;
import java.util.Scanner;

public class Uno {

	private Carta encurso; // La carta actual o la carta previamente jugada o carta de inicio.
	private Mazo mazo; // El mazo del juego
	private ArrayList<Carta> pilarDeCarta; //cuando los jugadores lanzan cartas, se acumulan aquí. Además, crea un nuevo mazo si el mazo actual está vacío
	private int falta; // Cuando los comodines apilan las penalizaciones se acumulan. Si un jugador no puede contrarrestar el comodín actual en el juego, se penaliza al jugador con la "penalización" del número de cartas

	private Scanner escoger;
	private Jugador jugador1,jugador2; //Jugador 1 y 2
	private int tomar; // Los jugadores eligen la carta
	
	public Uno() {
		//Constructores 
		//Prepara el juego para jugarlo
		mazo = new Mazo();
		mazo.barajear();
		falta = 0;
		encurso =obtnerCartaInicial();
		pilarDeCarta = new ArrayList<Carta>();
		pilarDeCarta.add(encurso);
		escoger = new Scanner(System.in);
		jugador1 = new Jugador("Jugador 1");
		jugador2 = new Jugador("Jugador 2");
		repartirCartas();
		
	
	}
	
	
	
	public void juego() {
		//Este metodo simula los turnos entre los jugadores.
		//Cuando el turno es par, el jugador 1 juega
		//Cuando es impar el jugador 2 juega
			
		int turno=0;
		while(!juegoTerminado(jugador1,jugador2)) {
			if(turno%2==0) {
			Turno(jugador1);}
			else {
			Turno(jugador2);}
			turno++;
		}
		
	}
	
	
private void repartirCartas() {
		//Este metodo reparte las cartas a los jugadores
		for(int i=0;i<10;i++) {
			
			if(i%2==0) {
				jugador1.tomarCarta(mazo.CartaSuperior());
			}
			
			else {
				jugador2.tomarCarta(mazo.CartaSuperior());
			}
			
			
		}
	}
	
	
	
	public void Turno(Jugador p) {
		//Este método toma al jugador que está jugando actualmente como un argumento.
		//Este método contiene todo el proceso para el juego.
		
		decorar();
		System.out.println(p+", Es tu turno\nLa carta en juego es:\n"+encurso);
		
		decorar();
		MostrarTablero(p);
		decorar();
		
		if(encurso.CartaEspecial()) {
			falta+=encurso.obtenerValor();
			Carta tomar;
			if(!anular(p)) {
				System.out.println("No tienes una carta especial, asi que comete las cartas");
				for(int i=0;i<falta;i++) {

					if(mazo.Vacio()) {
						mazo = new Mazo(pilarDeCarta);
					}
					tomar = mazo.CartaSuperior();
					p.tomarCarta(tomar);
					System.out.println("Tomaste un: \n"+tomar);
					pausa();
					
				}
				falta = 0;
				encurso = mazo.CartaSuperior();
				System.out.println("La nueva carta es:  \n"+encurso);
			}
			
			
			}
			
//		}   
		
		
	
		
	
		if(!Color(p) && !Valor(p) && !Especial(p)) {
				Carta tomar=null;	
				System.out.println("No tienes cartas para jugar, necesitas tomar una del mazo.");
				while(!Color(p) && !Valor(p) && !Especial(p)) {
					
					pausa();
					tomar = mazo.CartaSuperior();
					p.tomarCarta(tomar);
					System.out.println("Tomaste un :\n"+tomar);
					
				}
				
				System.out.println("Recibista una carta valida!");
				pausa();
				System.out.println("Tienes las siguientes cartas: ");
				p.MostrarCartas();
			}
			
	
		
		
		
		System.out.println("Selecciona una carta:");
        tomar = escoger.nextInt()-1;
		//System.out.println(pick);
		
		while(!OpcionValida(p,tomar)) {
			
			System.out.println("Selecciona una carta correcta.");
			tomar = escoger.nextInt()-1;
			
		}
		
		Carta play = p.LanzarTarjeta(tomar);
		
		p.DecirUno();
		encurso = play;
		pilarDeCarta.add(encurso);
		NuevoMazo();
	}
	
	
	private void NuevoMazo() {
		
		
	}



	private boolean Especial(Jugador p) {
		
		
		for(Carta c:p.CartasJugador()) {
			
			if(c.CartaEspecial()) {
				return true;
			}
			
		}
		
		
		return false;
	}

	private boolean OpcionValida(Jugador p,int choice) {
		
		//Comprueba si la selección del usuario fue una opción válida o no
		// para ser una opción válida: el jugador debe tener la carta, la carta debe ser del mismo color o valor que la carta actual (carta en juego / carta jugada anteriormente)		
		if(choice <= p.CartasJugador().size()) {
			//añadir especial
			
			if(p.CartasJugador().get(choice).obtenerColor().equals(encurso.obtenerColor()) || p.CartasJugador().get(choice).obtenerValor()==encurso.obtenerValor() || p.CartasJugador().get(choice).CartaEspecial()) {
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
	private void pausa() {
		//crea una pausa
		//pide al usuario que pulse enter
		//El propósito es simplemente conseguir el compromiso del usuario.
		System.out.println("Presiona enter para continuar......");
		escoger.nextLine();
		
	}
	
		
	private boolean Color(Jugador p) {
		// verifica si el jugador tiene una carta del mismo color que la carta actual que se está jugando


		for(Carta c:p.CartasJugador()) {
			
			if(c.obtenerColor().equals(encurso.obtenerColor())) {
				return true;
			}
			
			
		}
		
		return false;
	}
	
	private boolean Valor(Jugador p) {  
		// comprueba si el jugador tiene la carta del mismo valor que la que se está jugando.
		
		for(Carta c:p.CartasJugador()) {
			
			if(c.obtenerValor()==encurso.obtenerValor()) {
				
				return true;
				
			}
		}
		
		return false;
	}
	
	
	private boolean anular(Jugador p) {
		
		//comprueba si el jugador tiene un comodín (carta especial)
		//se pueden jugar cartas especiales cuando no tienes una carta del mismo color o el valor de la carta que se está jugando actualmente
		//Si la carta actual es una carta especial, entonces el jugador debe tener una carta especial con el mismo o mayor valor para jugar.
		for(Carta c:p.CartasJugador()) {
			
			if(c.CartaEspecial()) {
				if(c.obtenerValor() >= encurso.obtenerValor()) {
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	private void decorar() {
		//Dibuja una linea de asterisco
		
		
		System.out.println("***********************************************************************************");
	}
	
	
	
	
	private Carta obtnerCartaInicial() {
		
		//obtiene una tarjeta de inicio válida.
		//La carta inicial no puede ser una carta especial
		
		Carta temp = mazo.revolver();
		while(temp.CartaEspecial()) {
			mazo.barajear();
			temp = mazo.revolver();
		}
		
		temp = mazo.CartaSuperior();
		return temp;
	}
	
	
	


public boolean juegoTerminado(Jugador p1,Jugador p2) {
	
	if(p1.Victoria()) {
		System.out.println("**************************************************");
		System.out.println("Jugador 1 ha ganado");
		System.out.println("**************************************************");
		return true;
	}
	
	else if(p2.Victoria()) {
		System.out.println("**************************************************");
		System.out.println("Jugador 2 ha ganado");
		System.out.println("**************************************************");
		return true;
	}
	
	return false;
}

public void MostrarTablero(Jugador p) {
	
	if(p.toString().equals("Jugador 1")) {
		System.out.println("                Jugador 1");
		jugador1.MostrarCartas();
		jugador2.ocultarCartas();
		System.out.println("                Jugador 2");
		System.out.println("");
	}
	else {
		
		System.out.println("                Jugador 1");
		jugador1.ocultarCartas();
		jugador2.MostrarCartas();
		System.out.println("                Jugador 2");
		System.out.println("");
		
	}
	
}



}
