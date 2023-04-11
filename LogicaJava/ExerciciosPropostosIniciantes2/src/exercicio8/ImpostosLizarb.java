package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class ImpostosLizarb {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double renda = sc.nextDouble();
		double taxa;

		if (renda <= 2000) {
			taxa = 0.0;
		} else if (renda <= 3000) {
			taxa = (renda - 2000) * 0.08;
		} else if (renda <= 4500) {
			taxa = (renda - 3000) * 0.18 + 1000 * 0.08;
		} else {
			taxa = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}

		if (taxa == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f", taxa);
		}

		sc.close();
	}

}
