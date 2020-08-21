package lista02estruturacondicional;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número");
		double n1 = sc.nextDouble();

		if (n1 < 0)
			System.out.println("Fora do Intervalo");
		else if (n1 <= 25)
			System.out.println("[0,25]");
		else if (n1 <= 50)
			System.out.println("(25,50]");
		else if (n1 <= 75)
			System.out.println("(50,75]");
		else if (n1 <= 100)
			System.out.println("(75,100]");
		else
			System.out.println("Fora do Intervalo");

		sc.close();

	}

}
