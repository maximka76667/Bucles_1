package ej12;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean esSalir = false;

		while(!esSalir) {
			System.out.println("Selecciona una opción: ");
			System.out.println("1. Producto (p)");
			System.out.println("2. Resta (r)");
			System.out.println("3. División (d)");
			System.out.println("4. Salir (s)");

			char accion = entrada.nextLine().charAt(0);

			int a = 0;
			int b = 0;

			switch (accion) {
			case 'p':
				System.out.print("a: ");
				a = entrada.nextInt();
				System.out.print("b: ");
				b = entrada.nextInt();
				System.out.println("Suma: " + (a * b));
				break;

			case 'r':
				System.out.print("a: ");
				a = entrada.nextInt();
				System.out.print("b: ");
				b = entrada.nextInt();
				System.out.println("Resta: " + (a - b));
				break;

			case 'd':
				System.out.print("a: ");
				a = entrada.nextInt();
				System.out.print("b: ");
				b = entrada.nextInt();
				System.out.println("División: " + (a / b));
				break;

			case 's':
				esSalir = true;
				entrada.close();
				break;

			default:
				break;
			}
			
			entrada.nextLine();
		}
	}

}
