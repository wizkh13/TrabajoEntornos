package ejerciciosResueltos;


import java.util.Scanner;

public class Ejercicio2 {
	
	/**
	 * Calcular área triángulo
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double b, h, area;
		System.out.println("Introduce la base del triángulo: ");
		b = teclado.nextDouble();
		System.out.println("Introduce la altura del triángulo: ");
		h = teclado.nextDouble();
		area = (h*b)/2;
		System.out.println("El área del triángulo es: "+area);
	}
}
