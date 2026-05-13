package exemploWhile;

import java.util.Scanner;

public class exemploWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Digite um numero");
		numero = ler.nextInt();

		while (numero % 2 != 0) {
			System.out.println("O numero digitado não é par. Digite novamente: ");
			numero = ler.nextInt();
		}
		System.out.println("O numero " + numero + " é par");
		ler.close();
	}

}
