package ejerciciosBucles;

public class Ejercicio18 {
	/*
	 * Realiza un programa para calcular la suma de los cuadrados de los 
	 * 5 primeros números naturales.
	 */

	public static void main(String[] args) {
		
		//Declaración de variables.
		int suma=0;
		
		//Bucle
		for (int i=1; i<=5; i++) {
			
			suma+=Math.pow(i, 2);
			
		}
		
		System.out.println(suma);

	}

}
