package lista04estruturarepetitivafor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite quantos alunos:");//pergunta quantos alunos tem
		int n = sc.nextInt();//coleta a quantidade de alunos
		
		double nota=0;//variavel nota

		
		for(int i=1;i<=n;i++)//faz pra todos os alunos
		{
					
					for(int q=1;q<=3;q++)//faz todas as provas
					{
							System.out.printf("Digite a nota %d°:",q);//pergunta a nota da prova
							
							switch(q) {//descobre qual o peso da prova e soma 
										case 1:
											nota+=2.00*sc.nextDouble();
											break;
										case 2:
											nota+=3.00*sc.nextDouble();
											break;
										case 3:
											nota+=5.00*sc.nextDouble();
											break;
									}
				}
					nota/=10.0;//faz a média ponderada
					System.out.printf("%.1f%n",nota);
					nota=0;
			}
		
		
		sc.close();

	}

}
