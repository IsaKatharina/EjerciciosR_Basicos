package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double lado; //Lado del cuadrado, variable introducida por el usuario.
		double area; //Área del cuadrado.
		
		//Creamos un escáner.
		Scanner sc= new Scanner (System.in);
		
		//Pedimos al usuario que introduzca un número que se guardará en lado.
		System.out.println("Introduzca un número que será el lado del cuadrado: ");
		lado= sc.nextDouble();
		
		//El área de un cuadrado es el equivalente a lado al cuadrado.
		area= Math.pow(lado, 2);
		
		//Imprimimos el resultado.
		System.out.println("El área del cuadrado es: "+area);
		
		//Cerramos el escáner.
		sc.close();
		
	}

}
