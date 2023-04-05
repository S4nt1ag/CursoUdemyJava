package exercicioResolvido1;

import java.util.Locale;
import java.util.Scanner;

public class NotasSemestre {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();

		double notaFinal = nota1 + nota2;
		System.out.printf("Nota final = %.1f%n", notaFinal);

		if (notaFinal > 60.0) {
			System.out.println("Reprovado");
		}

		sc.close();

	}

}
