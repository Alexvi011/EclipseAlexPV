
public class SuperHeroe extends SuperPersona {
	public String ciudad;
	public String ColorTraje;
	public String enemigo;
	
	public String toString(){
		String mensaje="Soy SuperHeroe, Nombre: "+nombre+" Edad: "+edad+" Estatura:"+estatura+" SuperPoder:"+SuperPoder+" Alias: "+Alias+" Compa�ia: "+Compa�ia+" Ciudad: "+ciudad+" Color de traje: "+ColorTraje+" Enemigo: "+enemigo;
		return mensaje;
		
	}
	public SuperHeroe(){
	}
	public SuperHeroe (String nombre,int edad, double estatura,String SuperPoder,String Alias ,String Compa�ia,String ciudad,String ColorTraje,String enemigo){
		super(nombre,edad,estatura,SuperPoder,Alias,Compa�ia);
		this.ciudad=ciudad;
		this.ColorTraje=ColorTraje;
		this.enemigo=enemigo;
		}
	
	}


