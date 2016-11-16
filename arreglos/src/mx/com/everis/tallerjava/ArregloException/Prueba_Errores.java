package mx.com.everis.tallerjava.ArregloException;
import mx.com.everis.tallerjava.MiExcepcion.*;
import java.util.Scanner;


public class Prueba_Errores{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arreglo1 = new int [5];
		int[] arreglo2 = new int [5];
		int aux2 = 0,aux = 0;
		int x = arreglo2.length -1;//asignacion para evitar desbordamiento
	
		Scanner S = new Scanner(System.in);//objeto para poder introducir datos de teclado
		
		
		
		//************REGLAS DEL NEGOCIO*********************
		MiExcepcion obj = new MiExcepcion();
		
		//*******************un array no puede contener mas de 5 elementos enteros
			try{
				int a = 0;
					
					do{
						System.out.print("Introduce un valor para el arreglo 1: ");
						arreglo1[a] = S.nextInt();
						System.out.print("Introduce un valor para el arreglo 2: ");
						arreglo2[a] = S.nextInt();
						a++;
					}while(a < 5);
						
			}catch(Exception e){
				System.out.println("");
				obj.Regla1();
				
			}finally{
				//***************-en un array no puede contener valores mayores a 9
				try{
					for (int i = 0; i < arreglo1.length; i++){
						if(arreglo1[i] > 9){
							int error;
							error = arreglo1[i]/0;
						}
					}
					for ( int i = 0; i < arreglo2.length ; i--){
						if(arreglo2[i] > 9){
							int error;
							error = arreglo2[i]/0;
						}
					}
				}catch(Exception e){
					obj.Regla2();
				}
				finally{
					//***************un array no puede contener valores negativos
					try{
						for (int i = 0; i < arreglo1.length; i++){
							if(arreglo1[i] < 0){
								int error;
								error = arreglo1[i]/0;
							}
						}
						for ( int i = x; i >= 0 ; i--){
							if(arreglo2[i] < 0){
								int error;
								error = arreglo1[i]/0;
							}
						}
					}catch(Exception e){
						obj.Regla3();
					}
					finally{
						obj.termino();
					}
				}
			}
			
			
		//*******************SUMA DE LOS CONTENIDOS DE CADA ARREGLO********************************
		for (int i = 0; i < arreglo1.length; i++){
			aux = aux + arreglo1[i];
		}
		
		for ( int i = x; i >= 0 ; i--){
			
			aux2 = aux2 + arreglo2[i];
		}
		System.out.println("");
		System.out.println("la suma del arreglo 1 es: "+aux);
		System.out.println("la suma del arreglo 2 es: "+aux2);
		
		
	}

}
