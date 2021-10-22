package ej10;

import java.util.Scanner;

public class sumar_hasta_100 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		int suma = 0;

		while (suma < 100) {
			System.out.print("Numero: ");
			num = entrada.nextInt();
			suma += num;
		}

		System.out.println(suma);
		
		entrada.close();
	}

}
