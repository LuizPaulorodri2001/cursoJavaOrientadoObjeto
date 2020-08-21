package lista01estruturasequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1° Valor");
		int n1 = sc.nextInt();
		System.out.println("Digite o 2° Valor");
		int n2 = sc.nextInt();
		System.out.println("Digite o 3° Valor");
		int n3 = sc.nextInt();
		System.out.println("Digite o 4° Valor");
		int n4 = sc.nextInt();

		int resposta = n1 * n2 - n3 * n4;

		System.out.println("A diferença do produto é: " + resposta);

		sc.close();

	}

}
