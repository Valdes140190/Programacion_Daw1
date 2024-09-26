package unidad01;

import java.util.Scanner;

/*
 * Escribe un programa que dada una hora determinada en 
 * horas y minutos, calcule los segundos que faltan para llegar 
 * a la medianoche.
 */
public class ParaMediaNoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("""
				Son las 17:30. Calcula los segundos que faltan 
				para llegar a medianoche
				""");
		// Declaracion del objeto Scanner

	Scanner scan = new Scanner(System.in);
	System.out.print("Introduce la hora actual:");
	int hora = scan.nextInt();
	System.out.print("\nIntroduce los minutos actuales:");
	int minutos = scan.nextInt();
	int horasParaMedianoche = (23 - hora);
	int minutosParaMedianoche = (60 - minutos);
	int segParaMedianoche = horasParaMedianoche*3600+minutosParaMedianoche*60;
	System.out.println("\nQuedan " +segParaMedianoche + " segundos para medianoche.");
	scan.close();
	
	
	}

}
