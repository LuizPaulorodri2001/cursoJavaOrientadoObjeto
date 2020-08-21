package lista02estruturacondicional;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salário");
		double slr = sc.nextDouble();

		if (slr <= 2000.00)
			System.out.println("Isento");

		else if (slr <= 3000.00)
			System.out.println("R$ " + (slr - 2000.00) * 0.08);

		else if (slr <= 4500.00)
			System.out.println("R$ " + (80 + (slr - 3000) * 0.18));

		else if (slr > 4500.00)
			System.out.println("R$ " + ((80 + 1500 * 0.18 + (slr - 4500.00) * 0.28)));

		sc.close();

	}

}
