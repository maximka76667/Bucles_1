package ej5;

import java.util.Scanner;

public class Notas_alumnos {

	public static void main(String[] args) {
		int numero_alumno = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Cantidad de alumnos: ");
		int cantidad = entrada.nextInt();
		
		int[] notas;
		notas = new int[cantidad];
		
		for(int i = 0; i < cantidad; i++) {
			System.out.print("Nota: ");
			int nota = entrada.nextInt();
			notas[numero_alumno] = nota;
			++numero_alumno;
		}
		
		for(int i = 0; i < notas.length; i++) {
			switch (notas[i]) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Alumno numero" + i + " - Insuficiente" + " (" + notas[i] + ")");
				break;
				
			case 5:
				System.out.println("Alumno numero" + i + " - Suficiente" + " (" + notas[i] + ")");
				break;
				
			case 6:
				System.out.println("Alumno numero" + i + " - Bien" + " (" + notas[i] + ")");
				break;
				
			case 7:
			case 8:
				System.out.println("Alumno numero" + i + " - Notable" + " (" + notas[i] + ")");
				break;
				
			case 9:
			case 10:
				System.out.println("Alumno numero" + i + " - Sobresaliente" + " (" + notas[i] + ")");
				break;
	
			default:
				break;
			}
		}
		
		entrada.close();
	}

}
