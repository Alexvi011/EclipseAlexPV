
public class Armario extends Mueble {
	public int Cajones;
	public int Prendas;
	
	public Armario(){
		
	}
	public Armario(String color,double altura,String material,int Cajones,int Prendas){
		super(color,altura,material);
		this.Cajones=Cajones;
		this.Prendas=Prendas;
	}
	public String toString(){
		String mensaje="Soy un armario, Mi color es "+color+",Mi altura es "+altura+" metros,Estoy hecho de "+material+" Tengo "+Cajones+" cajones, Mi capacidad de prendas es de "+Prendas;
		return mensaje;
	}

}
