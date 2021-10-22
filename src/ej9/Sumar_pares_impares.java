package ej9;

import java.util.Scanner;

public class Sumar_pares_impares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int suma_pares = 0;
		int suma_impares = 0;
		
		while (true) {
			System.out.print("Numero: ");
			num = entrada.nextInt();
			if(num <= 0) break;
			if(num % 2 == 0) suma_pares += num;
			else suma_impares += num;
		}
		
		System.out.println(suma_pares);
		System.out.println(suma_impares);
		
		entrada.close();
	}

}
