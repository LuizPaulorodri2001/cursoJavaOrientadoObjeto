package lista02estruturacondicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do produto");
		int cod = sc.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		int qtd = sc.nextInt();

		switch (cod) {
		case 1:
			System.out.println("O valor do pedido é : R$ " + qtd * 4.00);
			break;
		case 2:
			System.out.println("O valor do pedido é : R$ " + qtd * 4.50);
			break;
		case 3:
			System.out.println("O valor do pedido é : R$ " + qtd * 5.00);
			break;
		case 4:
			System.out.println("O valor do pedido é : R$ " + qtd * 2.00);
			break;
		case 5:
			System.out.println("O valor do pedido é : R$ " + qtd * 1.50);
			break;
		}
		sc.close();
	}

}
