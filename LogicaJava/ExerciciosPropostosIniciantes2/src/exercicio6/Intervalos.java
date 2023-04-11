package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Intervalos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num = sc.nextDouble();

		if (num <= 25 && num > 0) {
			System.out.println("Intervalo [0,25]");
		} else if (num <= 50 && num > 25) {
			System.out.println("Intervalo [25,50]");
		} else if (num <= 75 && num > 50) {
			System.out.println("Intervalo [50,75]");
		} else if (num <= 100 && num > 75) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();
	}

}