package exemploWhile;

import java.util.Random;
import java.util.Scanner;

public class CavernaDragão {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		int direcao, dragao, tesouro;

		System.out.println("Você entrou na caverna, cada passo que der pode levar a tesouros valiosos, ou...");
		System.out.println("A morte");
		System.out.println("Digite '1' para ir pra frente, '2' para a esquerda e '3' para a direita: ");
		direcao = ler.nextInt();
		dragao = aleatorio.nextInt(4) + 1;
		tesouro = aleatorio.nextInt(4) + 1;

		while (direcao != tesouro || direcao != tesouro) {
			System.out.println("Voce encontrou um espaco vazio, continue em frente para prosseguir (1, 2 ou 3): ");
			direcao = ler.nextInt();

			if (direcao == dragao) {
				System.out.println("Voce encontrou o dragao, e apos uma batalha dificil, voce morreu ");
				direcao = ler.nextInt();
			} else if (direcao == tesouro) {
				System.out.println("Parabens, voce encontrou o tesouro!");
				direcao = ler.nextInt();
			} else {

			}
		}
		ler.close();

	}
}
