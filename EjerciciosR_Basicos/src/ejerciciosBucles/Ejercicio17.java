package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		// Declaración de variables necesarias.
		int num;
		int numInicial;
		int contadorFallos = 0;
		int contadorTotal=0;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número que se guardará en radio.
		
		System.out.print("Introduzca un número: ");
		numInicial = sc.nextInt();
		
		//Hacemos un bucle que empieza cuando el número introducido es distinto de 0.
		 while (numInicial!=0){
			
			//Le pedimos al usuario que introduzca otro número
			System.out.print("Introduzca un número: ");
			num = sc.nextInt();
			
			//Añadimos uno al contador. Lo hacemos aquí, para que no tenga en cuenta el
			//número introducido cuándo queramos salir del bucle.
			contadorTotal++;
			
			//En caso de que el número introducido sea menor que el inicial y distinto de 0
			//indicamos que hay un fallo y añadimos 1 al contador de fallos.
			if (numInicial>num&&num!=0) {
				
				System.out.println("Fallo, es menor que el número anterior.");
				contadorFallos++;
				
			} 
			
			//Hacemos que el número introducido pase a ser el número inicial.
			numInicial=num;
			
		 }
		
		//Imprimimos los resultados.
		System.out.println("Total de números introducidos: "+contadorTotal);
		System.out.println("Total de fallos: "+contadorFallos);
	}

}
