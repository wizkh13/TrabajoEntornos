package ejerciciosResueltos;

import java.util.Scanner;

public class Ejercicio4 {
	
	/**
	 * Calcular 10% de una cantidad
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double cant, porc;
		System.out.println("Introduce una cantidad: ");
		cant = teclado.nextDouble();
		porc = (cant*10)/100;
		System.out.println("El 10% de "+cant+" es: "+porc);
		
		//TODO
		
		
	}

}
