package ej8;

import java.util.Scanner;

public class Multi_de_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("N: ");
		int N = entrada.nextInt();
		
		for(int i = 4; i <= N; i += 4) System.out.println(i);
		
		entrada.close();
	}

}
