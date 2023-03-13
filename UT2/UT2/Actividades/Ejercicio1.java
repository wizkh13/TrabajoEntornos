package ejerciciosResueltos;

import java.util.*;

public class Ejercicio1 {
	
	/**
	 * Introducciones por teclado
	 */
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bienvenido al nuevo mundo de java");
		String nombre, apellidos;
		System.out.println("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.println("---------------JAVA---------------------");
		System.out.println("Bienvenido "+nombre+" "+apellidos+".");
		System.out.println("Cuantos años tienes??: ");
		double edad;
		edad = teclado.nextInt();
		if (edad <= 20)
			if (edad <= 12)
				System.out.println(nombre + " " + ", eres un crío.");
			else 
				System.out.println(nombre + " " + ", eres muy joven.");
		else
			System.out.println(nombre + " " + ", eres mayor ya eh!!!.");
		
		
	}

	
	
}
