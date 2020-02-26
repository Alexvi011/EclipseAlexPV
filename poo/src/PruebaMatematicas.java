
public class PruebaMatematicas {
	public static void main(String []args){
		//Clase identificado=new Constructor();
		//Java por defecto agrega el constructor vacio
		int r;
		//Solamente porque sumar es un metodo static
	r=Matematicas.sumar(5,10);
	System.out.println(r);
	
	System.out.println(Matematicas.multiplicar(5,10));
	
	System.out.println(Matematicas.potencia(2,3 ));
	
	System.out.println(Matematicas.sumar(1, 2, 3));
	System.out.println(Matematicas.sumar(1, 2, 3, 4));
	System.out.println(Matematicas.sumar(5.2,3.1));
	
	System.out.println(Matematicas.multiplicar(10,5,2));
	System.out.println(Matematicas.multiplicar(10,5,2,2));
	
	System.out.println(Matematicas.multiplicar(5.5,5.5));
	System.out.println(Matematicas.multiplicar(5.5,2.6,3.5));
	System.out.println(Matematicas.multiplicar(5.5,2.6,3.5,7.9));
	
	System.out.println(Matematicas.restar(10, 5, 2, 2));
	
	System.out.println(Matematicas.duplicar(10));
	System.out.println(Matematicas.duplicar(10.5));
	
	System.out.println(Matematicas.cuadriplicar(10));
	System.out.println(Matematicas.cuadriplicar(10.5));
	
	System.out.println(Matematicas.sumatoria(4));

	
	}

}
