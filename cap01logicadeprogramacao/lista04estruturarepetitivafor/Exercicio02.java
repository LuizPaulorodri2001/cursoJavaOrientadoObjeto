package lista04estruturarepetitivafor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int n = sc.nextInt();
		int in = 0, out = 0;
		int x;
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite outro número:");
			x = sc.nextInt();
			if (x >= 10 && x <= 20)
				in++;
			else
				out++;
		}
		System.out.printf("in: %d%nout: %d", in, out);
		sc.close();

	}

}
