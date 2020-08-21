package lista02estruturacondicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 =sc.nextInt();
		System.out.println("Digite outro número: ");
		int n2 =sc.nextInt();
		
		if(n1%n2==0||n2%n1==0)
			System.out.println("Os números são multiplos.");
		else
			System.out.println("Os números não são multiplos.");
			
		sc.close();

	}

}
