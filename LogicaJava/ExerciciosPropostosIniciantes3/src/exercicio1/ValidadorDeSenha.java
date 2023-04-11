package exercicio1;

import java.util.Scanner;

public class ValidadorDeSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int senhaF = 2002;
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();

		while (senha != senhaF) {
			System.out.println("Senha Invalida");
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();

		}
		System.out.println("Acesso Permitido");

		sc.close();
	}

}
