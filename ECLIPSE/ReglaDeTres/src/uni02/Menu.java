package uni02;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Comprimir archivo");
            System.out.println("2. Eliminar archivo");
            System.out.println("3. Copiar archivo");
            System.out.println("4. Cerrar programa");
            System.out.print("Elige una opción: ");

            // Validación de entrada
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debes elegir una opción válida.");
                scanner.next(); // Limpiar entrada no válida
                continue;
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: Comprimir archivo.");
                    break;
                case 2:
                    System.out.println("Has elegido: Eliminar archivo.");
                    break;
                case 3:
                    System.out.println("Has elegido: Copiar archivo.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error: Opción no válida, intenta de nuevo.");
            }
            
        } while (opcion != 4);

        scanner.close();
    }
}