package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class ValorHorasFuncionaro {

	public static void main(String[] args) 
	{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Id do funcionário: ");
		int funcionario = sc.nextInt();
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.print("Valor por hora: ");
		double horasValor = sc.nextDouble();
		
		double salario = horasTrabalhadas* horasValor;
		
		System.out.println("Id funcionário: "+ funcionario);
		System.out.printf("Salario funcionário: U$ %.2f%n", salario);
		
		
		sc.close();

	}

}
