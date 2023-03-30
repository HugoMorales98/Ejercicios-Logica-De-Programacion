
import java.util.Scanner;

import java.util.HashMap;

public class Ejercicio9 {

    public static void main(String[] args) {

        // Crear el objeto HashMap
        HashMap<String, String> diccionario = new HashMap<String, String>();

        // Agregar las palabras al diccionario
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("computadora", "computer");
        diccionario.put("telefono", "phone");
        diccionario.put("libro", "book");
        diccionario.put("lapiz", "pencil");
        diccionario.put("boligrafo", "pen");
        diccionario.put("television", "television");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("jardin", "garden");
        diccionario.put("arbol", "tree");
        diccionario.put("flor", "flower");
        diccionario.put("ciudad", "city");
        diccionario.put("pais", "country");
        diccionario.put("universidad", "university");

        // Solicitar una palabra en español
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra en español: ");
        String palabra = sc.nextLine();

        // Buscar la palabra en el diccionario
        String traduccion = diccionario.get(palabra);

        // Mostrar la traducción o un mensaje de error
        if (traduccion != null) {
            System.out.println("La traducción de \"" + palabra + "\" es \"" + traduccion + "\".");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no se encuentra en el diccionario.");
        }

    }

}
