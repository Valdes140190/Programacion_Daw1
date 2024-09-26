package unidad01;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.print("Introduce un número entero y veremos si es par o impar:");
		int numero;
		numero = scan.nextInt();
		String paridad;
		//paridad = condicion ? sisecumple : sinosecumple (Operador módulo - % - debe ser igual a cero)
		paridad = numero % 2 == 0 ? "par" : "impar";
		System.out.println("El número introducido es: " + paridad);
		
		
			
		scan.close();


	}

}
