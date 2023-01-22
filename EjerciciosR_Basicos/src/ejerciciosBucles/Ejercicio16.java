package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio16 {
	
	/*
	 * Realiza un programa en java que pida un número 
	 * entero positivo y nos diga si es primo o no
	 */
	
	public static void main(String[] args) {
		
		//Declaramos las variables necesarias.
		int num; //número introducido por el usuario.
		boolean primo;
		
		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número que se guardará en radio.
		// No aceptaremos que los números sean negativos o 0, para que no generen error
		// en la división.
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		
		//Hacemos un condicional para garantizar que es un número positivo.
		if (num>0) {
			
			//Llamamos a la función.
			primo= Funciones.esPrimo(num);
			
			if (primo==true) {
				
				System.out.println("El número introducido es primo.");
				
			} else {
				
				System.out.println("El número introducido no es primo.");
			}
					
			
			
		} else  {
			
			System.out.println("Error: no puede introducir un número negativo o 0");
		}
	}

}
