package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		String nombre; //Nombre del usuario.
		final double SALARIOHORA; //lo que se gana en una hora de trabajo
		final double HORAS; //las horas que se han trabajado.
		double horasEX; //Horas extra trabajadas.
		double salarioBruto=0; //Salario bruto.
		double tarifaEX; //Lo que se gana a partir de 35 horas trabajadas.
		double tasa=0; //Tasa de impuestos que se aplican.
		double salarioNeto=0; //Salario neto.
		double salarioEX;
		
		//Creamos un escáner.
		Scanner sc= new Scanner (System.in);
				
		//Pedimos al usuario que introduzca sus datos.
		System.out.print("Introduzca el nombre de el/la trabajador/a: ");
		nombre= sc.next();
		System.out.print("Introduzca el precio de una hora de trabajo: ");
		SALARIOHORA=sc.nextDouble();
		System.out.print("Introduzca el número de horas trabajadas: ");
		HORAS=sc.nextDouble();
		
		//Para empezar, debemos calcular el salario bruto. En caso de que las horas trabajadas sean menor o igual a 35, 
		//calculamos la tarifa normal, sobre eso.
		
		if (HORAS<=35) {
			
		salarioBruto= HORAS*SALARIOHORA;	
			
		} else if ( HORAS > 35){
		
		//En caso de que las horas trabajadas sean mayor de 35
		//Para ello, primero debemos restar el número de horas trabajadas menos 35 para aplicar 
		//la tarifa correspondiente. A las horas extras se les aplicará una tarifa especial.
		
		horasEX= HORAS - 35;
		
		tarifaEX= SALARIOHORA*1.5;
		
		salarioBruto= (35*SALARIOHORA)+ (horasEX*tarifaEX);
		
		}
		//Imprimimos el resultado.
		System.out.println("El programa calculará el salario de el/la trabajador/a: "+nombre);
		System.out.println("El salario bruto es: "+salarioBruto+" euros.");
				
		//Con las tasas, aplicaremos el mismo procedimiento.
		
		//En el caso de que el salario bruto se encuentre entre 500 y 900 euros,
		//aplicaremos una tasa del 25%.
		
		if (salarioBruto<=500) {
			
			salarioNeto= salarioBruto;
			
			System.out.println("Al ser un salario menor de 500 euros, no se le aplican impuestos.");
		
		} else if (salarioBruto>500&&salarioBruto<=900) {
			
			tasa= salarioBruto*0.25;
			
			salarioNeto= salarioBruto- tasa;
			
		} else if (salarioBruto>900) {
			
			salarioEX= salarioBruto-900;
			
			//Sabiendo que el resultado que aplicando el 25% de impuestos sobre 400
			//se nos quedan un salario neto de 300 euros.
			tasa= (salarioEX*0.4);
			
			salarioEX-= tasa+100;
			
			salarioNeto= salarioEX+900;
				
		}
		
		//Imprimos los resultados.
		System.out.println("Se le aplicarán "+tasa+ " euros de impuestos.");
		System.out.println("El salario neto semanal es de "+salarioNeto+" euros.");
		
		//Cerramos el escáner.
		sc.close();

	}

}
