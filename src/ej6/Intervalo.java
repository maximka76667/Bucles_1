package ej6;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = entrada.nextInt();
		
		System.out.print("b: ");
		int b = entrada.nextInt();
		
		System.out.println("Números impares de intervalo: ");
		for(int i = (a > b ? b : a); i <= (a > b ? a : b); i++) if(i % 2 != 0) System.out.println(i);
		
		entrada.close();
	}

}
