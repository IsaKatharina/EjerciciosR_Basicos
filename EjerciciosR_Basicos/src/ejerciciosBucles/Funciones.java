package ejerciciosBucles;

public class Funciones {

	static boolean esPrimo(int n) {

		boolean esPrimo = true;

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {

				esPrimo = false;
				break;
			}

		}

		return esPrimo;
	}

	static boolean esPar(int n) {

		boolean esPar = true;
		
		if (n%2!=0) {
			
			esPar= false;

		}

		return esPar;
	}
}
