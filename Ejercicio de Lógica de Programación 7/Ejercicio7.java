import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar el día y la hora ingresados por el usuario
        String diaSemana = "";
        int hora = 0, minutos = 0;

        // Pedir al usuario el día de la semana y verificar que sea válido
        while (true) {
            System.out.println("Ingresa un día de la semana (Lunes - Viernes): ");
            diaSemana = scanner.nextLine();

            if (diaSemana.equalsIgnoreCase("Lunes") || diaSemana.equalsIgnoreCase("Martes") ||
                diaSemana.equalsIgnoreCase("Miércoles") || diaSemana.equalsIgnoreCase("Jueves") ||
                diaSemana.equalsIgnoreCase("Viernes")) {
                break;
            } else {
                System.out.println("Día de la semana no válido. Intenta nuevamente.");
            }
        }

        // Pedir al usuario la hora y los minutos y verificar que sean válidos
        while (true) {
            System.out.println("Ingresa una hora (0-23): ");
            String horaStr = scanner.nextLine();

            try {
                hora = Integer.parseInt(horaStr);
                if (hora >= 0 && hora <= 23) {
                    break;
                } else {
                    System.out.println("Hora no válida. Intenta nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Hora no válida. Intenta nuevamente.");
            }
        }

        while (true) {
            System.out.println("Ingresa los minutos (0-59): ");
            String minutosStr = scanner.nextLine();

            try {
                minutos = Integer.parseInt(minutosStr);
                if (minutos >= 0 && minutos <= 59) {
                    break;
                } else {
                    System.out.println("Minutos no válidos. Intenta nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Minutos no válidos. Intenta nuevamente.");
            }
        }

        scanner.close();

        // Calcular cuántos minutos faltan para el fin de semana
        int minutosTotales = ((4 - getNumDiaSemana(diaSemana)) * 24 * 60) + ((15 - hora) * 60) + (60 - minutos);

        // Imprimir el resultado
        System.out.println("Faltan " + minutosTotales + " minutos para el fin de semana.");
    }

    // Método para obtener el número de día de la semana (1 = Lunes, 2 = Martes, etc.)
    public static int getNumDiaSemana(String diaSemana) {
        switch (diaSemana.toLowerCase()) {
            case "lunes":
                return 1;
            case "martes":
                return 2;
            case "miércoles":
                return 3;
            case "jueves":
                return 4;
            case "viernes":
                return 5;
            default:
                return -1;
        }
    }
}