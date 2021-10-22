package ej11;

import java.util.Scanner;

public class Medio_de_12_numeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		double suma = 0;

		for(int i = 0; i < 12; i++) {
			System.out.print("Numero: ");
			num = entrada.nextInt();
			suma += num;
		}

		System.out.println("Medio: " + (suma / 12));
		
		entrada.close();
	}

}
