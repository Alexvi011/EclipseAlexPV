
public class Matematicas {
	//Metodos static son metodos de clase
	//No es necesrio crear un objeto para poder utilizarlo
	//No pueden hacer uso de los atributos de la clase 
	
	public static int sumar(int x,int y){
		return x+y;
	}
    public static int multiplicar(int x,int y){
    	return x*y;
    }
    public static int potencia (int x, int y){
    	int r=1;
    	for(int i=0;i<y;i++){
    		r=r*x;  		
    	}
    	return r;
    }
    //Sobrecarga de metodos
    //Lista de parametros debe de ser diferente tipo y/o cantidad
    //Sobrecargar el metodo sumar en cantidad de parametros
    public static int sumar(int x,int y,int z){
    	return x+y+z;
    }
    public static int sumar(int w,int x,int y, int z){
    	return w+x+y+z;
    }
    public static double sumar(double x,double y){
    	return x+y;
    }
    public static int multiplicar(int x,int y, int z){
    	int r=multiplicar(x,y);
    	r=multiplicar(r,z);
    	return r;
    }
    public static int multiplicar (int x,int y,int w,int z){
    	return multiplicar(multiplicar(x,y),multiplicar(z,w));
    }
    public static double multiplicar(double x,double y){
    	return x*y;
    }
    public static double multiplicar(double x,double y,double z){
    	double r=multiplicar(x,y);
    	r=multiplicar(r,z);
    	return r;
    }
    public static double multiplicar(double x,double y,double z,double w){
    	return multiplicar(multiplicar(x,y),multiplicar(z,w));
    }
    
    //restar x-y,z-w //restar x-y-z //restar x-y 
    
    public static int restar(int x,int y,int z,int w){
    	return sumar(x,-y,-z,-w);//return x-y-z-w;
    	
    }
    public static int restar(int x,int y,int z){
    	  return restar(x,y,z,0);
    }
    public static int restar(int x,int y){
    	  return restar(x,y,0); //return restar(x,y,0,0); //return x-y;
    	  
     }
    //Metodo duplicar 
    public static int duplicar(int x){
    	return multiplicar(2,x);
    }
    public static double duplicar(double x){
    	return multiplicar(2,x);
    }
    public static int cuadriplicar(int x){
    	return multiplicar(4,x);
    }
    public static double cuadriplicar(double x){
    	return multiplicar(4,x);
    }
    
    //Recursion
    //Es resolver el problema llamando a la misma funcion para que lo resuelva
    //Sumar los primeros n numeros consecutivos
    //1+2+3+4+5+6+...+(n-1)+n=resultado
    public static int sumatoria(int n){
    	if(n==0){
    		return 0;//Caso base de la recursion
    	}else{
    		return n+sumatoria(n-1);//Caso recursivo
    	}
    }

}
