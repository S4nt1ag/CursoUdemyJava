package exercicioResolvido2;

import java.util.Scanner;

public class IdadeMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int qtdPessoas = 0;
		int totalIdade = 0;

		while (idade >= 0) {
			totalIdade = totalIdade + idade;
			qtdPessoas = qtdPessoas + 1;
			idade = sc.nextInt();
		}
		if (qtdPessoas > 0) {
			double mediaIdade = (double) totalIdade / qtdPessoas;
			System.out.printf("%.2f%n", mediaIdade);
		} else {
			System.out.println("Impossivel calcular");
		}

		sc.close();
	}

}
