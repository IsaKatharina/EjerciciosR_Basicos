package repasoExamen;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 *Escribe un programa que pida por teclado un número entero mayor o igual que 0 y 
	 *determine cuántas de sus cifras son pares y cuántas son impares:
	 */

	public static void main(String[] args) {

		// Declaramos las variables.

		int num; // Variable introducida por el usuario.
		int contadorPares = 0;
		int contadorImpares=0;

		/*
		 * Creamos un escáner para poder leer los datos que introduzca el usuario por la
		 * consola.
		 */

		Scanner sc = new Scanner(System.in);

		// Le pediremos al usuario que introduzca los datos y los guardaremos en la
		// variable.

		System.out.print("Introduzca un número y pulse Intro: ");
		num = sc.nextInt();

		// Creamos una condición para que nos salga un mensaje de error en caso de que
		// se introduzca un número menor o igual a 0.
		if (num > 0) {

			// Mientras que el número sea mayor de 0, se ejecutará el siguiente bucle:
			while (num > 0) {

				// se realiza una división entre 10 y por cada división la variable contador
				// incrementa en 1.
				num /= 10;

				if (num%2==0) {
					
					contadorPares++;
				
				} else {
					
					contadorImpares++;
				}

			}

			System.out.println("Este número tiene "+contadorPares+" números pares.");
			System.out.println("Este número tiene "+contadorImpares+" números impares.");

		} else {
			System.out.println("ERROR. Ha introducido un valor no válido.");
		}

		// Por último, cerramos el escáner.

		sc.close();

	}

}
