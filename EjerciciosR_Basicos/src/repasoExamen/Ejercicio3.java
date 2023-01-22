package repasoExamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos las variables.
		String nombre; //Nombre del usuario.
		final double PRACTICA=0.1;
		final double PROBLEMAS= 0.5;
		final double TEORIA=0.4;
		int notaPractica; // Variable introducida por el usuario.
		int notaProblemas;
		int notaTeoria;
		double notaMedia; //nota media de cada alumno
		double sumaMedias=0;
		double mediaTotal;
		int contadorAlumnos=0;
		double notaMaxFinal=0;
		double notaMinFinal=0;

		/*
		 * Creamos un escáner para poder leer los datos que introduzca el usuario por la
		 * consola.
		 */

		Scanner sc = new Scanner(System.in);

		// Le pediremos al usuario que introduzca los datos y los guardaremos en la
		// variable.

		do {
			
			System.out.print("Introduzca el nombre del/la alumno/a y pulse Intro: ");
			nombre = sc.next();
			
			if (nombre.equals("0")) {
				
				break;
			}
			
			System.out.print("Introduzca la nota de la parte práctica y pulse Intro: ");
			notaPractica = sc.nextInt();
			
			System.out.print("Introduzca la nota de la parte de problemas y pulse Intro: ");
			notaProblemas = sc.nextInt();
			
			System.out.print("Introduzca la nota de la parte teórica y pulse Intro: ");
			notaTeoria = sc.nextInt();
			
			//Añadimos 1 al contador.
			contadorAlumnos++;
			
			//Hacemos la media del alumno.
			notaMedia=notaPractica*PRACTICA+notaProblemas*PROBLEMAS+notaTeoria*TEORIA;
			
			if (notaMedia>notaMaxFinal) {
				
				notaMaxFinal=notaMedia;
				
			} 
			
			if (notaMedia<notaMinFinal){
				
				notaMinFinal=notaMedia;
				
			}
			
			sumaMedias+=notaMedia;
			
		} while (!nombre.equals("0"));
		
		//Hacemos la media de las notas.
		mediaTotal=sumaMedias/contadorAlumnos;
		
		//Presentamos los resultados.
		
		System.out.println(contadorAlumnos++);
		System.out.println("La nota máxima de la clase es de "+nombre+" con "+ notaMaxFinal);
		System.out.println("La nota mínima de la clase es de "+nombre+" con "+notaMinFinal);
		System.out.println("La nota media total es "+mediaTotal);
	}

}
