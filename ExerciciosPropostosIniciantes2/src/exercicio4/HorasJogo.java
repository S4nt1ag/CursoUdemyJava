package exercicio4;

import java.util.Scanner;

public class HorasJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaI = sc.nextInt();
		int horaF = sc.nextInt();

		int totalH;

		if (horaI < horaF) {
			totalH = horaF - horaI;

		} else {
			totalH = 24 - horaI + horaF;
		}

		System.out.printf("O jogo durou %d hora(s)", totalH);

		sc.close();
	}

}
