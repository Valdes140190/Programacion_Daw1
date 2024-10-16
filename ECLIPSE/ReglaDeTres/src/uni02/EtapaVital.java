package uni02;

import java.util.Scanner;

public class EtapaVital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu año de nacimiento:");
		int anioNacimiento = scanner.nextInt();
        int anioActual = 2024; 
        int edad = anioActual - anioNacimiento;

        if (edad < 0) {
            System.err.println("Error: La edad no puede ser menor de 0 años.");
        } else if (edad <= 2) {
            System.out.println("Eres un bebé.");
        } else if (edad <= 11) {
            System.out.println("Eres niñ@.");
        } else if (edad <= 18) {
            System.out.println("Eres adolescente.");
        } else if (edad <= 65) {
            System.out.println("Eres adulto.");
        } else { // Este comando te proporciona el resultado que los demás no te dan.
            System.out.println("Eres anciano.");
        }

        scanner.close();
		
	}

}
