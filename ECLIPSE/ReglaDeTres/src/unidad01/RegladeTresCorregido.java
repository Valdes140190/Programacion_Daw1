package unidad01;

import java.util.Scanner;

public class RegladeTresCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("""
				Introduce los valores para resolver la regla de 3
				a ---> b
				c ---> x
				""");
		// Declaracion del objeto Scanner
	Scanner scan = new Scanner(System.in);
	System.out.print("Establece el valor de a:");
	double a = scan.nextDouble();
	System.out.print("Establece el valor de b:");
	Double b = scan.nextDouble();
	System.out.print("Establece el valor de c:");
	Double c = scan.nextDouble();
	// solución x = (b*c)/a
	//TODO: cONTROLAR QUE NO SE DÉ A=0
	Double x = (b*c)/a;
    System.out.println("El valor de x es:" + x);
    scan.close();
	}

}
