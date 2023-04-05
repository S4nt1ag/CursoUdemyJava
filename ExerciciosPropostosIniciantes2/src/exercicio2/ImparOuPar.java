package exercicio2;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (numero % 2 != 0) {
			System.out.println("Impar");
		} else {
			System.out.println("Par");
		}

		sc.close();
	}

}
