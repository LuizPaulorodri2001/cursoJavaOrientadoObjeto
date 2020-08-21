package lista04estruturarepetitivafor;

import java.util.Scanner;

public class Exercicio01 {
	public static void Main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
