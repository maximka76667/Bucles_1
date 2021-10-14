package ej4;

import java.util.Scanner;

public class Tabla_multi {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("La tabla de multiplicacion de: ");
		int x = entrada.nextInt();
		
		for(int i = 0; i <= 10; i++) System.out.println(x + " X " + i + " = " + (x * i));
		
		entrada.close();
	}

}
