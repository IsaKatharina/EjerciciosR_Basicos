package repasoExamen;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Escribe un programa que lea un número entero (lado) y a partir de él cree un
	 * cuadrado de asteriscos con ese tamaño
	 */

	public static void main(String[] args) {

		// Declaración de variables necesarias.
		int num;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número que se guardará en radio.

		System.out.print("Introduzca un número: ");
		num = sc.nextInt();

		// Hacemos el bucle del lado superior del cuadrado.
		for (int i = 0; i < num; i++) {

			System.out.print("*");

		}

		System.out.println("");

		// Ahora hacemos los lados intermedios.

		for (int j = 0; j <= num - 2; j++) {

			System.out.print("*");

			// Imprimimos la parte blanca.
			for (int blanco = 0; blanco <= num - 2; blanco++) {

				System.out.print(" ");

			}

			System.out.println("*");

		}

		// Hacemos el bucle del lado inferior del cuadrado.
		for (int i = 0; i < num; i++) {

			System.out.print("*");

		}

		System.out.println("");

	}

}
