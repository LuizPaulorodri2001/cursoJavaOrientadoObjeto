package lista01estruturasequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da peça 1: ");
		sc.nextInt();
		System.out.println("Digite o número de peças 1: ");
		int nmr1 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça 1: ");
		double vlr1 = sc.nextDouble();

		System.out.println("Digite o código da peça 2: ");
		sc.nextInt();
		System.out.println("Digite o número de peças 2: ");
		int nmr2 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça 2: ");
		double vlr2 = sc.nextDouble();

		double rspst = nmr1 * vlr1 + nmr2 * vlr2;

		System.out.printf("O valor a ser pago é: R$ %.2f%n", rspst);

		sc.close();

	}

}
