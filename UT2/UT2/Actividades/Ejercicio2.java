package ejerciciosResueltos;


import java.util.Scanner;

public class Ejercicio2 {
	
	/**
	 * Calcular �rea tri�ngulo
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double b, h, area;
		System.out.println("Introduce la base del tri�ngulo: ");
		b = teclado.nextDouble();
		System.out.println("Introduce la altura del tri�ngulo: ");
		h = teclado.nextDouble();
		area = (h*b)/2;
		System.out.println("El �rea del tri�ngulo es: "+area);
	}
}
