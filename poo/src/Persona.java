
public class Persona {
	public String nombre;
	public int edad;
	public double estatura;
	
	public Persona(){
		
	}
	public Persona(String nombre, int edad, double estatura){
		this.nombre=nombre;
		this.edad=edad;
		this.estatura=estatura;
		
		
	} 
	public String toString(){
		String mensaje= "Nombre: "+nombre+" Edad: "+edad+" Estatura: "+estatura;
		return mensaje;
	}
}
