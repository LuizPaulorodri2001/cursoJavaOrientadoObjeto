package lista03estruturarepetitivawhile;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod=0;
		int al=0,ga=0,di=0;
		while(cod!=4)
		{
			System.out.println("Digite o código do produto:");
			 cod=sc.nextInt();	
			
			switch (cod)
			{
			case 1: 
				al++;
				break;
			case 2:
				ga++;
				break;
			case 3:
				di++;
				break;
			case 4:
				break;
			default:
			System.out.println("Código Invalido!");
			
				
					
			
			
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+al);
		System.out.println("Gasolina: "+ga);
		System.out.println("Diesel: "+di);
		
		
		
		sc.close();

	}

}
