package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio15 {
	/*
	 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
	 * que introducimos por teclado
	 */

	public static void main(String[] args) {
		
		//Declaramos las variables necesarias.
		int num; //número introducido por el usuario.
		int contador=0; //variable contador para contar los múltiples.

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número que se guardará en radio.
		// No aceptaremos que los números sean negativos o 0, para que no generen error
		// en la división.
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		
		//Creamos un bucle for. 
		//Inicializamos i en 1 porque el 0 lo cuenta el if.
		for (int i=1; i<=num; i++) {
			
			if(i%3==0) {
				
				contador++;
			}
			
		}
		
		System.out.println("Cantidad de múltiplos de 3: "+contador);

	}

}
