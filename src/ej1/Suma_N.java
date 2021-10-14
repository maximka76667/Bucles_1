package ej1;

import java.util.Scanner;

public class Suma_N {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int N = 0;
		double suma = 0;
		
		do {
			System.out.print("N: ");
			N = entrada.nextInt();
		} while (N < 0);
		
		for(int i = 0; i < N; i++) {
			System.out.print("Dime tu número: ");
			suma += entrada.nextDouble();
		}
		
		System.out.println("Suma es: " + suma);
		
		entrada.close();
	}

}
