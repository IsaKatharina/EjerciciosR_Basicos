package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio21 {

	/*
	 * Realiza un programa que pida dos número enteros A y B, siendo B mayor que A.
	 * Luego visualiza los números desde A hasta B e indicar cuantos hay que sean
	 * pares.
	 */

	public static void main(String[] args) {

		// Declaración de variables necesarias.
		int numA;
		int numB;
		boolean par;
		int contadorPares=0;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número que se guardará en radio.

		System.out.print("Introduzca un número: ");
		numA = sc.nextInt();
		
		System.out.print("Introduzca otro número mayor que el anterior: ");
		numB = sc.nextInt();
		
		if (numA<numB) {
			
			//Hacemos el bucle que imprima los números necesarios.
			for (int i=numA; i<=numB; i++) {
				
				//Imprimimos i.
				System.out.print(i+" ");
				
				//Invocamos la función esPar.
				par=Funciones.esPar(i);
				
				if (par==true) {
					contadorPares++;
				}
				
			}
			System.out.println();
			//Fuera del bucle for, imprimimos la cantidad de números pares.
			System.out.println("La cantidad de pares son: "+contadorPares);
		
		} else {
			
			System.out.println("Error, el segundo número debe ser menor que el primero.");
		}


	}

}
