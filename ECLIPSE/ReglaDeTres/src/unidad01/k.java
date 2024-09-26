package unidad01;

import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.print("Pon el valor de a:");
Float a = scan.nextFloat();
System.out.print("Pon el valor de b:");
Float b = scan.nextFloat();
System.out.print("Pon el valor de c:");
Float c = scan.nextFloat();
Float x = (a*b)/c;
System.out.print("El valor de x es" + x);
scan.close();




	}

}
