package Exercicio01;

import java.util.Scanner;

public class SomaInteiros {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva o primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.print("Escreva o segundo numero: ");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("Soma = "+ soma);
		
		sc.close();
	}

}
