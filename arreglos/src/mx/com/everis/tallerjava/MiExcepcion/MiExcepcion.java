package mx.com.everis.tallerjava.MiExcepcion;


public class MiExcepcion{

	public static void Regla1(){
		
		System.out.println("se cumplio la regla 1: el arreglo contiene elementos diferentes del tipo entero o sobrepasa de 5 elementos");
	}
	
	public static void Regla2(){
		System.out.println("se cumplio la regla 2: un arreglo no puede contener valores mayores a 9");
	}
	
	public static void Regla3(){
		System.out.println("se incumplio la regla 3: un array no puede contener valores negativos");
	}
	
	public static void termino(){
		System.out.println("Proceso terminado....");
	}
}
