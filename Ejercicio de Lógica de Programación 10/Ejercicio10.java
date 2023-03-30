import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        // Crear el diccionario
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("carro", "car");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("plátano", "banana");
        diccionario.put("computadora", "computer");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("libro", "book");
        diccionario.put("teclado", "keyboard");
        diccionario.put("ratón", "mouse");
        diccionario.put("pantalla", "screen");
        diccionario.put("lápiz", "pencil");
        diccionario.put("papel", "paper");
        diccionario.put("tijeras", "scissors");
        diccionario.put("pluma", "pen");
        diccionario.put("profesor", "teacher");
        diccionario.put("estudiante", "student");

        // Seleccionar 5 palabras al azar
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabras[random.nextInt(palabras.length)];
        }

        // Solicitar las traducciones
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Traducción de \"" + palabra + "\": ");
            String respuesta = scanner.nextLine();
            if (respuesta.equals(diccionario.get(palabra))) {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        // Mostrar los resultados
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
    }
}