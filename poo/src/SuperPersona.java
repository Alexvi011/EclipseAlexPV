
public class SuperPersona extends Persona{
	public String SuperPoder;
	public String Alias;
	public String Compañia;
	
	public SuperPersona(){
	}
	public SuperPersona(String nombre,int edad, double estatura,String SuperPoder,String Alias ,String Compañia){
			
		super(nombre,edad,estatura);
		this.Alias=Alias;
		this.Compañia=Compañia;
		this.SuperPoder=SuperPoder;
		}
		
	

}
