package lista02estruturacondicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int n1 = sc.nextInt();
		if (n1 % 2 == 0)
			System.out.println("O n�mero � par.");
		else
			System.out.println("O n�mero � impar.");
		sc.close();

	}

}
