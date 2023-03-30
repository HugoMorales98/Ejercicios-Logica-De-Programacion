import java.util.Scanner;

public class InvertirTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir al usuario que ingrese una palabra o frase
        System.out.println("Ingrese una palabra o frase:");
        String texto = scanner.nextLine();

        // Paso 2: Crear una cadena vacía para almacenar el resultado invertido
        String invertido = "";

        // Paso 3: Recorrer la cadena ingresada de atrás hacia adelante
        for (int i = texto.length() - 1; i >= 0; i--) {
            char c = texto.charAt(i);

            // Paso 4: Agregar el carácter actual al inicio de la cadena invertida
            invertido += c;
        }

        // Paso 5: Imprimir la cadena invertida resultante
        System.out.println(invertido);
    }
}