package lista01estruturasequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();

		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();

		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();

		double tri = a * c / 2;

		double pi = 3.14159, circ = pi * Math.pow(c, 2);

		double tra = (a + b) * c / 2;

		double quad = Math.pow(b, 2);

		double ret = a * b;

		System.out.printf("TRIANGULO = %.3f%n", tri);
		System.out.printf("CÍRCULO = %.3f%n", circ);
		System.out.printf("TRAPEZIO= %.3f%n", tra);
		System.out.printf("QUADRADO = %.3f%n", quad);
		System.out.printf("RETANGULO = %.3f%n", ret);
		sc.close();

	}

}
