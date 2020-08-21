package lista02estruturacondicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora de começo do jogo: ");
		int h1 =sc.nextInt();
		System.out.println("Digite a hora de termino do jogo: ");
		int h2 =sc.nextInt();
		
		if(h2>h1)
			System.out.println("O jogo durou : "+(h2-h1)+" horas.");
		else if(h1>h2)
			System.out.println("O jogo durou : "+(h2-h1+24)+" horas.");
		else
			System.out.println("O jogo durou : 24 horas.");
			sc.close();

	}

}
