
public class SuperPersona extends Persona{
	public String SuperPoder;
	public String Alias;
	public String Compa�ia;
	
	public SuperPersona(){
	}
	public SuperPersona(String nombre,int edad, double estatura,String SuperPoder,String Alias ,String Compa�ia){
			
		super(nombre,edad,estatura);
		this.Alias=Alias;
		this.Compa�ia=Compa�ia;
		this.SuperPoder=SuperPoder;
		}
		
	

}
