import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Paso 1
	        int[] numeros = new int[10];

	        // Paso 2
	        System.out.println("Ingrese 10 numeros (Da enter despues de ingresar cada numero):");
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = scanner.nextInt();
	        }

	        // Paso 3
	        int[] primos = new int[numeros.length];
	        int contadorPrimos = 0;

	        // Paso 4
	        for (int i = 0; i < numeros.length; i++) {
	            if (esPrimo(numeros[i])) {
	                primos[contadorPrimos] = numeros[i];
	                contadorPrimos++;
	            }
	        }

	        // Paso 5
	        for (int i = 0; i < numeros.length; i++) {
	            if (!esPrimo(numeros[i])) {
	                primos[contadorPrimos] = numeros[i];
	                contadorPrimos++;
	            }
	        }

	        // Paso 6
	        System.out.println("Array de numeros primos:");
	        for (int i = 0; i < primos.length; i++) {
	            if (primos[i] != 0) {
	                System.out.println("pos[" + i + "] = " + primos[i]);
	            }
	        }
	    }

	    // Método para determinar si un número es primo
	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}