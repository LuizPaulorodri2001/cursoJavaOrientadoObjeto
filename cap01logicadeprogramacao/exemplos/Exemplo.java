package exemplos;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço: ");
		double p=sc.nextDouble();
		
	//ESTRUTURA CONDICIONAL TERNARIA
		double desconto=(p<20.00)?p*0.1:p*0.05;

		System.out.println(desconto);
		
	/*	
	//SWITCH CASE	
		switch(dia)
		{
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sabádo");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("Valor Invalido");
			
		
		}
		*/
		sc.close();
		
		
	}


	}


