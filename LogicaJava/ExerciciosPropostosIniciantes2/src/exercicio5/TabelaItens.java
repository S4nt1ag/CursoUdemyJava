package exercicio5;

import java.util.Scanner;

public class TabelaItens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// final int codigo1 = 1;
		// final String item1 = "Cachorro Quente";
		final double valor1 = 4.00;

		// final int codigo2 = 2;
		// final String item2 = "X-Salada";
		final double valor2 = 4.50;

		// final int codigo3 = 3;
		// final String item3 = "X-Bacon";
		final double valor3 = 5.00;

		// final int codigo4 = 4;
		// final String item4 = "Torrada simples";
		final double valor4 = 2.00;

		// final int codigo5 = 5;
		// final String item5 = "Refrigerante";
		final double valor5 = 1.50;

		int codigoP = sc.nextInt();
		int qtdP = sc.nextInt();
		double total;

		if (codigoP == 1) {
			total = qtdP * valor1;
			System.out.printf("Total: R$ %.2f", total);
		} else if (codigoP == 2) {
			total = qtdP * valor2;
			System.out.printf("Total: R$ %.2f", total);
		} else if (codigoP == 3) {
			total = qtdP * valor3;
			System.out.printf("Total: R$ %.2f", total);
		} else if (codigoP == 4) {
			total = qtdP * valor4;
			System.out.printf("Total: R$ %.2f", total);
		} else if (codigoP == 5) {
			total = qtdP * valor5;
			System.out.printf("Total: R$ %.2f", total);
		} else {
			System.out.println("Produto não encontrado");
		}

		sc.close();

	}

}
