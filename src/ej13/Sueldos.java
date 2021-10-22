package ej13;

import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double mayor_salario = 0;
		double menor_salario = 0;
		double suma = 0;
		int bajos = 0;
	
		for(int i = 0; i < 12; i++) {
			System.out.print("Salario de empleado numero " + (i + 1) + ": ");
			double salario = entrada.nextDouble();
			
			if(salario > mayor_salario) mayor_salario = salario;
			if(menor_salario == 0 || salario < menor_salario) menor_salario = salario;
			if(salario < 700.5) ++bajos;
			suma += salario;
		}
		
		System.out.println("Mayor salario: " + mayor_salario);
		System.out.println("Menor salario: " + menor_salario);
		System.out.println("Salario medio: " + (suma / 12));
		System.out.println("Número por debajo de 700.5€: " + bajos);
		
		entrada.close();
	}

}
