package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double num1; //Número 1, variable introducida por el usuario.
		double num2; //Número 2, variable introducida por el usuario.
		double suma; //Suma de los números.
		double resta; //Resta de los números.
		double mult; //Multiplicación de los números.
		double div; //División de los números.
		
		//Creamos un escáner.
		Scanner sc= new Scanner (System.in);
		
		//Pedimos al usuario que introduzca un número que se guardará en lado.
		//No aceptaremos que los números sean negativos o 0, para que no generen error en la división.
		System.out.println("Introduzca un número: ");
		num1= sc.nextDouble();
		
		while (num1<1) {
			
			System.out.println("Error, el número no puede ser 0 ni negativo.");
			System.out.println("Introduzca otro número: ");
			num1=sc.nextDouble();
			
		}
		
		System.out.println("Introduzca otro número: ");
		num2= sc.nextDouble();
		
		
		while (num2<1) {
			
			System.out.println("Error, el número no puede ser 0 ni ser negativo.");
			System.out.println("Introduzca otro número: ");
			num2=sc.nextDouble();
		}
		
		
		//Hacemos las operaciones.
		
		suma=num1+num2;
		resta= num1-num2;
		mult= num1*num2;
		div =num1/num2;
		
		//Imprimimos el resultado.
		System.out.println("Se han ejecutado las siguientes operaciones: ");
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Multiplicación: "+mult);
		System.out.println("División: "+div);
		
		//Cerramos el escáner.
		sc.close();

	}

}
