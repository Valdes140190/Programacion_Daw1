package unidad01;

import java.util.Scanner;

public class Regla3 {
	
	public static void main(String[] args) {
		System.out.println("""
				Introduce los valores para resolver la regla de 3
				a ---> b
				c ---> x
				""");
		// Declaracion del objeto Scanner
	Scanner scan = new Scanner(System.in);
	System.out.print("Establece el valor de a:");
	Float a = scan.nextFloat();
	System.out.print("Establece el valor de b:");
	Float b = scan.nextFloat();
	System.out.print("Establece el valor de c:");
	Float c = scan.nextFloat();
    Float x = (b*c)/a;
    System.out.println("El valor de x es:" + x);
    scan.close();
    
    
	
	}
	

}



		
