package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double radio; //Variable introducida por el usuario.
		double longitud; //Longitud de la circunferencia.
		double area; //Área del círculo.
		double volumen; //Volumen de la esfera.
		
		
		//Creamos un escáner.
		Scanner sc= new Scanner (System.in);
		
		//Pedimos al usuario que introduzca un número que se guardará en radio.
		//No aceptaremos que los números sean negativos o 0, para que no generen error en la división.
		System.out.print("Introduzca un número que será el radio: ");
		radio= sc.nextDouble();
		
		while (radio<0) {
			
			System.out.println("Error, el número no puede ser 0 ni negativo.");
			System.out.print ("Introduzca otro número: ");
			radio=sc.nextDouble();
			
		}
		
		//Hacemos las operaciones.
		
		longitud=2*radio*Math.PI;
		area= Math.PI*Math.pow(radio, 2);
		volumen= (4*Math.PI*Math.pow(radio,3)/4);
		
		//Imprimimos el resultado.
		System.out.println("Según el radio introducido, se han ejecutado las siguientes operaciones: ");
		System.out.println("Longitud de la circunferencia: "+String.format("%.2f", longitud));
		System.out.println("Área del círculo: "+ String.format("%.2f", area));
		System.out.println("Volumen de la esfera: "+String.format("%.2f",volumen));
		
		//Cerramos el escáner.
		sc.close();


	}

}
