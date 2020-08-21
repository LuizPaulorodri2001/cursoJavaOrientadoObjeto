package lista04estruturarepetitivafor;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = sc.nextInt();
		
		int fat=1;
		
		for(int i=1;i<=n;i++)
			fat=(i==0)?1:fat*i;
		System.out.println("O fatorial do "+ n +" é:"+fat);
		
		sc.close();

	}

}
