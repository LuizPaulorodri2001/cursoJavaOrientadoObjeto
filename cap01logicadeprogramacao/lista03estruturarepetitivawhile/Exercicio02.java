package lista03estruturarepetitivawhile;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a coordenada X:");
		double x = sc.nextDouble();
		System.out.println("Digite a coordenada Y:");
		double y = sc.nextDouble();

		while (x != 0 && y != 0) {
			String res = (x > 0 && y > 0) ? "Primeiro"
					: (x > 0 && y < 0) ? "Quarto" : (x < 0 && y > 0) ? "Segundo" : "Terceiro";

			System.out.println(res);
			System.out.println("Digite a coordenada X:");
			x = sc.nextDouble();
			System.out.println("Digite a coordenada Y:");
			y = sc.nextDouble();

		}

		sc.close();

	}

}
