
public class SuperVillano extends SuperPersona {
	public String Motivacion;
	public String ColorTraje;
	public String Arma;
	
	public String toString(){
		String mensaje="Soy SuperVillano, Nombre: "+nombre+" Edad: "+edad+" Estatura:"+estatura+" SuperPoder:"+SuperPoder+" Alias: "+Alias+" Compañia: "+Compañia+" Motivacion: "+Motivacion+" Color de traje: "+ColorTraje+" Arma: "+Arma;
		return mensaje;
		
	}
	public SuperVillano(){
	}
	public SuperVillano (String nombre,int edad, double estatura,String SuperPoder,String Alias ,String Compañia,String Motivacion,String ColorTraje,String Arma){
		super(nombre,edad,estatura,SuperPoder,Alias,Compañia);
		this.Motivacion=Motivacion;
		this.ColorTraje=ColorTraje;
		this.Arma=Arma;
		}

}
