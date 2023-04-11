package exercicio7;

import java.util.Scanner;

public class LinhasQuadradoCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n <= 0) {
			while (n <= 0) {

				System.out.println("Digite um numero positivo");
				n = sc.nextInt();
			}
		}
		int qdd;
		int cb;
		for (int i = 1; i <= n; i++) {
			qdd = i * i;
			cb = i * i * i;
			System.out.printf("%d %d %d%n", i, qdd, cb);
		}

		sc.close();
	}

}
