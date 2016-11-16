package mx.com.everis.tallerjava.arreglos;

public class arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arreglo1 = {6,7,8,9,10};
		int[] arreglo2 = {1,2,3,4,5};
		int aux2 = 0,aux = 0;
	
		for (int i = 0; i < arreglo1.length; i++){
			aux = aux + arreglo1[i];
		}
		int x = arreglo2.length -1;
		
		for ( int i = x; i >= 0 ; i--){
			
			aux2 = aux2 + arreglo2[i];
		}
		
		System.out.println("la suma del arreglo 1 es: "+aux);
		System.out.println("la suma del arreglo 2 es: "+aux2);
		
		
	}

}
