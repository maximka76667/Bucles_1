package ej7;

import java.util.Scanner;

public class Pares_y_impares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("N: ");
		int N = entrada.nextInt();
		
		int suma_pares = 0;
		int suma_impares = 0;
		int num_pares = 0;
		int num_impares = 0;
		
		for(int i = 1; i <= N; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " es par");
				num_pares += 1;
				suma_pares += i;
			} else {
				System.out.println(i + " es impar");
				num_impares += 1;
				suma_impares += i;
			}
		}
		
		double media_pares = suma_pares / num_pares;
		double media_impares = suma_impares / num_impares;
		
		System.out.println("Número de pares: " + num_pares);
		System.out.println("Número de impares: " + num_impares);
		System.out.println("Media de pares: " + media_pares);
		System.out.println("Media de impares: " + media_impares);
		
		entrada.close();
	}

}
