package exercicio4;

import java.util.Scanner;

public class DivisãoDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			double resultado = 0;
			if (y == 0) {
				System.out.println("divisão impossivel");
			} else {
				resultado = (double) x / y;
				System.out.println(resultado);
			}
		}

		sc.close();

	}

}
