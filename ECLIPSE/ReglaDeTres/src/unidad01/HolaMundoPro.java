package unidad01;
/**
 * Clase para el saludo pro en java
 * Saluda con Hola amigo si el usuario no introduce su nombre
 * Saludo con Hola nombre si el usuario introduce su nombre
 */
import java.util.Scanner;

public class HolaMundoPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// metodo main
		Scanner scan = new Scanner(System.in);
				System.out.print("Introduce tu nombre:");
				String nombre = scan.nextLine();
				// Cuando el usuario no mete ningún nombre, el valor que guarda es una cadena vacía, es decir, ""
				//nombre = condicion ? valorsiverdadero : valorsifalso;
				nombre =  "".equals(nombre) ? "amigo" : nombre;
				System.out.println("Hola " + nombre + "!");
				scan.close();
				
				
	}

}

// null significa que no hay valor. Puede pasar si no hemos inicializado algún valor. En este caso dependemos del nextLine