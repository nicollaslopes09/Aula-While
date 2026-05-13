package exemploWhile;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaçãoNumero {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Random aleatorio = new Random();

		int numeroUsuario, numeroAleatorio, tentativa = 1;
		System.out.println("Digite um numero: ");
		numeroUsuario = ler.nextInt();

		numeroAleatorio = aleatorio.nextInt(100) + 1;

		while (numeroUsuario != numeroAleatorio) {

			if (numeroUsuario > numeroAleatorio) {
				System.out.println("O numero digitado é maior que o numero secreto");
			} else {
				System.out.println("O numero digitado é menor que o numero secreto");
			}
			System.out.println("O numero digitado não esta correto. Tente Novamente: " + tentativa + " tentativas");
			numeroUsuario = ler.nextInt();
			tentativa++;

		}
		System.out.println("Parabens, voce acertou o numero secreto em " + tentativa + " tentativas");
		ler.close();
	}
}
