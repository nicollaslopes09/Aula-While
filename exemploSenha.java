package exemploWhile;

import java.util.Scanner;

public class exemploSenha {
	public static void main(String[] args) {

		int senha = 1234;
		int senhaDigitada = 0;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a senha");
		senhaDigitada = ler.nextInt();

		while (senhaDigitada != senha) {
			System.out.println("Digite sua senha");
			senhaDigitada = ler.nextInt();
		}
		System.out.println("A senha esta correta");
		ler.close();
	}

}
