package lista01estruturasequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o c�digo da pe�a 1: ");
		sc.nextInt();
		System.out.println("Digite o n�mero de pe�as 1: ");
		int nmr1 = sc.nextInt();
		System.out.println("Digite o valor unit�rio da pe�a 1: ");
		double vlr1 = sc.nextDouble();

		System.out.println("Digite o c�digo da pe�a 2: ");
		sc.nextInt();
		System.out.println("Digite o n�mero de pe�as 2: ");
		int nmr2 = sc.nextInt();
		System.out.println("Digite o valor unit�rio da pe�a 2: ");
		double vlr2 = sc.nextDouble();

		double rspst = nmr1 * vlr1 + nmr2 * vlr2;

		System.out.printf("O valor a ser pago �: R$ %.2f%n", rspst);

		sc.close();

	}

}
