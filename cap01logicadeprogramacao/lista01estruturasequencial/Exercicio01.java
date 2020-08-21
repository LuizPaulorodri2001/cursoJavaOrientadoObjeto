package lista01estruturasequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1° valor");
		int n1 = sc.nextInt();
		System.out.println("Digite o 2° valor");
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("A soma dos números digitados é: "+soma);
		sc.close();
	}

}
