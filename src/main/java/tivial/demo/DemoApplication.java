package tivial.demo;

import java.util.Scanner;

public class DemoApplication {
	static int lecturaint;
	static String lecturastring;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = -1;
		while (opc != 7) {
			System.out.println("Bienvenido a la aplicación de preguntas y respuestas.");
			System.out.println("1. Añadir nuevas preguntas (con sus respuestas correspondientes, claro)");
			System.out.println(
					"2. Listar todas las preguntas y respuestas disponibles en la aplicación hasta el momento.");
			System.out.println("3. Buscar una pregunta y su respuesta correspondiente a partir del Id.");
			System.out.println("4. Modificar una pregunta y/o su respuesta.");
			System.out.println("5. Borrar una pregunta y su respuesta.");
			System.out.println(
					"6. Elegir una pregunta al azar, formularla y pedir al usuario la respuesta. El programa nos dirá si hemos acertado o no.");
			System.out.println("7. Salir del programa.");

			System.out.println("Por favor, elija una opción.");
			validador(0, 1, 7, null);
			switch (opc) {
				case 1:
					Anadir();
					break;

				case 2:
					Listar();
					break;

				case 3:
					System.out.println("Ingrese el Id de la pregunta que desea buscar.");
					validador(0, 0, 0, null);
					Buscar(lecturaint);
					break;
			}
		}
	}

	public static void validador(int i, int cotasup, int cotainf, String[] equal) {
		if (i == 0) {
			if (cotasup == 0 && cotainf == 0) {
				cotainf = Integer.MIN_VALUE; // Minimo valor entero posible
				cotasup = Integer.MAX_VALUE; // Maximo valor entero posible
			}
			try {
				do {
					lecturaint = sc.nextInt();
					sc.nextLine();
				} while (lecturaint < cotainf || lecturaint > cotasup);

			} catch (Exception e) {
				System.out.println("Error, por favor ingrese un número válido.");
			}
		} else {
			boolean valido;
			try {
				do {
					valido = false;
					lecturastring = sc.nextLine();
					int it = 0;
					while (it < equal.length && !valido) {
						if (equal[it].equals(lecturastring)) {
							valido = true;
						}
						it++;
					}
				} while (lecturastring.equals("") || valido == false);
			} catch (Exception e) {
				System.out.println("Error, por favor ingrese un texto válido.");
			}
		}
	}

	public static void Anadir() {

	}

	public static void Listar() {

	}

	public static void Buscar(int id) {

	}
}
