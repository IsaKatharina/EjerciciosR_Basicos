package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio19 {

	/*
	 * Realiza un programa que lea un número y a continuación escriba el carácter
	 * “*” tantas veces igual al valor numérico leído. En aquellos casos en que el
	 * valor leído no sea positivo se deberá escribir un único asterisco.
	 */

	public static void main(String[] args) {

		// Declaración de variables necesarias.
		int num;
		
		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número que se guardará en radio.

		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		
		if (num>0) {
			
			//Hacemos el bucle.
			for (int i=0; i<num; i++) {
				
				System.out.print("* ");
				
			} 
		
		} else {
			
			System.out.println("*");
		}

	}

}
