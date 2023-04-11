package exercicio3;

import java.util.Scanner;

public class MultiplosOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}

		sc.close();

	}

}
