package lista04estruturarepetitivafor;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas:");
		int l=sc.nextInt();
		
		for(int i=1;i<=l;i++) 
			System.out.println(i+" "+(int)Math.pow(i,2)+" "+(int)Math.pow(i,3));
			
		sc.close();

	}

}
