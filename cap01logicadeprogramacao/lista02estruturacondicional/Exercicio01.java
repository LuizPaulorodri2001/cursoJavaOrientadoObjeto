package lista02estruturacondicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int n1 = sc.nextInt();

		if (n1 < 0) {
			System.out.println("O n�mero � negativo.");
		} else if (n1 > 0) {

			System.out.println("O n�mero � positivo.");
		} else {
			System.out.println("O n�mero � zero.");
		}

		sc.close();

	}

}
