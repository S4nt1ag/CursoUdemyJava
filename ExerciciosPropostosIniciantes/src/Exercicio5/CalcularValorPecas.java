package Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class CalcularValorPecas {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idPeca1 = sc.nextInt();
		int qtdPeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		
		int idPeca2 = sc.nextInt();
		int qtdPeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorPeca1 = qtdPeca1*valorUnitarioPeca1;
		double valorPeca2 = qtdPeca2*valorUnitarioPeca2;
		
		double valorTotal = valorPeca1+valorPeca2;
		
		System.out.printf("Valor a pagar: U$ %.2f%n", valorTotal);
		
		
		sc.close();
	}

}
