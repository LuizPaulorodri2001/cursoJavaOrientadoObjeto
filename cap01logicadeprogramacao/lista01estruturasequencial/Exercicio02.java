package lista01estruturasequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio do c�rculo");
		double pi = 3.14159, raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2);
		System.out.printf("O valor da �rea do c�rculo �: %.4f%n", area);
		sc.close();
	}

}
