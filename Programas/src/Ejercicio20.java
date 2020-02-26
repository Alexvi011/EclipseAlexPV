
public class Ejercicio20 {
	public static void main(String args[]){
		double resultado;
		resultado=0;
		System.out.println("f(x)=3x+2");
		for( double x = -10 ;x<=10; x=x+0.5 ){
			resultado=(3*x)+2;
			
			System.out.println("x= "+x +" || " +resultado);
		}
		
	}

}
