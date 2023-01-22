package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio20 {
	
	/*
	 * Realiza un programa que pida un número entero N entre 0 y 20 y 
	 * luego muestre por pantalla los números desde 1 hasta N, uno en 
	 * cada línea, repitiendo cada número tantas veces como su valor
	 */

	public static void main(String[] args) {

		// Declaración de variables necesarias.
		int num;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número que se guardará en radio.

		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		
		//Hacemos el bucle.
		if (num>0&&num<=20) {
			
			/*Establecemos un for en el que se imprime un número por iteración. Primero, definimos las veces que va a repetirse la condición,
			 * es decir, el total de filas que tendrá la pirámide.*/
			
			for(int i = 1; i<=num; i++){
				
				//Dentro del bucle, establecemos otro bucle en el que la variable j imprimirá en la misma línea la variable i
			
					
					for( int j=2; j<=i; j++) {
						
						System.out.print(i);
					}
	         
			//Ponemos un salto de línea para que el bucle inicial se repita por cada línea, hasta llegar al número introducido.
					
	         System.out.println(i);
			}
		 
		//Se imprime un mensaje de error en caso de que no se cumpla la primera condición
		} else {
			
			System.out.println("Ha introducido valores no válidos.");
			
		}
	}

}
