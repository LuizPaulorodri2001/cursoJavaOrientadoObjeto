package lista01estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite o número do funcionário: ");
		int nmr=sc.nextInt();
		System.out.println("Digite o valor de horas trabalhada do funcionário: ");
		int hrs = sc.nextInt();
		System.out.println("Digite o valor da hora: ");
		double vlr = sc.nextDouble();
		
		double slr = vlr*hrs;
		System.out.println("O número do funcionário é: "+nmr);
		
		System.out.printf("O valor do Sálario é: U$ %.2f%n",slr);
		
		sc.close();

	}

}
