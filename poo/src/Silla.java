
public class Silla extends Mueble {
	
	public String Uso; 
	public double Peso;
	
	public Silla(){
		
	}
	public Silla(String color,double altura,String material,String Uso,double Peso){
		super(color,altura,material);
		this.Uso=Uso;
		this.Peso=Peso;
	}
	public String toString(){
		String mensaje="Soy una silla, Mi color es "+color+",Mi altura es "+altura+" Metros,Estoy hecho de "+material+",Mi uso es "+Uso+",Mi peso es "+Peso+"kg";
		return mensaje;	
	}
	


	
	

}
