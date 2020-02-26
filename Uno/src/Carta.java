
public class Carta {
	private String color;
	private int valor;
	private int valorEspecial;
	private boolean especial;
	
	public Carta(int valor,String color) {
		//Constructores
		this.color=color;
		this.valor = valor;
		this.valorEspecial = 0;
		this.especial = false;
	}
	public Carta(int valorEspecial){
		//Constructores para cartas especiales como +4 y +2
		this.color="";
		this.valorEspecial = valorEspecial;
		this.valor = 0;
		this.especial = true;
	}
	public String obtenerColor() {//Regresa el color a la carta
		return this.color;
	}
	public int obtenerValor(){
		
		//Regresa un numero a la carta
		
		if(!this.especial) {
			return this.valor;}
			
			else {
				return this.valorEspecial;
			}
	}
	public String toString(){
		String[] carta = {" ----- ","|     |","|     |"," ----- "};
		String c = "";
		
		
		for(int i=0;i<carta.length;i++) {
				
			for(int j=0;j<1;j++) {
					
				if(!this.CartaEspecial()) {
					if(i==1) {
						
						c = c +"| "+this.obtenerColor()+" |"+" ";
						
					}
					
					else if(i==2) {
						
						c = c + "|  "+this.obtenerValor()+"  |"+" ";
					}
					
					else {
						c = c + carta[i]+" "; 
					}
					
					}
				
				else if(this.CartaEspecial()) {
					
					if(i==1) {
						
						c = c +"| "+"+"+this.obtenerValor()+"  |"+" ";
						
					}
					else {
						c = c + carta[i]+" ";
					}
					
				}
				
					}
				
				c +="\n";
				
			}
				
		
		
		return c;
		
		
		
		
		
	}
public boolean CartaEspecial() {
		//regresa verdadero si es una carta especial
	    //regresa falso si no lo es
			
		
		if(especial) {
			return true;
		}
		
		return false;
	}
	
	}


