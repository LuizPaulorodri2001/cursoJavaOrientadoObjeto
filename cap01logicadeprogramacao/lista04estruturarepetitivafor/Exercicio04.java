package lista04estruturarepetitivafor;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos pares quer ler:");
		int par=sc.nextInt();
		
		for(int i=1;i<=par;i++)
			{
			System.out.println("Digite o númerador:");
			int num=sc.nextInt();
			
			System.out.println("Digite o denominador:");
			int den=sc.nextInt();
		
		if(den==0)
			System.out.println("Divisão Impossível.");
		else
			{
			double res=(double)num/den;
			System.out.printf("%.1f%n",res);
			}
		
			}
		sc.close();

	}

}
