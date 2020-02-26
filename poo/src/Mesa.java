
public class Mesa extends Mueble{
	public String Lugardeuso;
	public int Capacidad;
	
	public Mesa(){
		
	}
	public Mesa(String color,double altura,String material,String Lugardeuso,int Capacidad){
		super(color,altura,material);
		this.Lugardeuso=Lugardeuso;
		this.Capacidad=Capacidad;
	}
	public String toString(){
		String mensaje="Soy una mesa, Mi color es "+color+",Mi altura es "+altura+" metro,Estoy hecha de "+material+",Mi lugar de uso es"+Lugardeuso+",Mi capaciad es de "+Capacidad+" personas";
		return mensaje;	

}
}
