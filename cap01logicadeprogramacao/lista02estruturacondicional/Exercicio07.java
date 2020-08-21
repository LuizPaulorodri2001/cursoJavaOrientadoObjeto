package lista02estruturacondicional;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de x");
		double x = sc.nextDouble();
		System.out.println("Digite o valor de y: ");
		double y = sc.nextDouble();

		if (x == 0 && y == 0)
			System.out.println("Origem.");
		else if (x == 0 && y != 0)
			System.out.println("Eixo Y.");
		else if (x != 0 && y == 0)
			System.out.println("Eixo X.");
		else if (x > 0 && y > 0)
			System.out.println("Q1");
		else if (x > 0 && y < 0)
			System.out.println("Q4");
		else if (x < 0 && y > 0)
			System.out.println("Q2");
		else if (x < 0 && y < 0)
			System.out.println("Q3");
		sc.close();

	}

}
