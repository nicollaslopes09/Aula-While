package exemploWhile;

import java.util.Scanner;

public class gabaritoProva3 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String gabarito, começar, sim;
		int pontos = 0, questoes = 1, alunos = 0, perguntas = 1;

		System.out.println("Bem vindo ao corretor de provas automático");

		System.out.println("Digite sim para começar");
		começar = ler.next();

		while (começar.equals("sim")) {
			alunos++;
			while (perguntas < 10) {

				System.out.println("informe a questão que voce quer responder: ");
				questoes = ler.nextInt();

				switch (questoes) {
				case 1:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("A")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");
						questoes = ler.nextInt();

						pontos++;
						perguntas++;

					} else {
						System.out.println("Respota incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 2:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("B")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");
						questoes = ler.nextInt();

						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 3:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("C")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 4:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("D")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 5:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("E")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 6:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("E")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 7:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("D")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 8:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("C")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 9:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("B")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
				case 10:
					System.out.println("informe sua resposta da questão " + questoes + ": ");
					gabarito = ler.next();
					if (gabarito.equalsIgnoreCase("A")) {
						System.out.println("Resposta correta!");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						pontos++;
						perguntas++;
					} else {
						System.out.println("Resposta incorreta");
						System.out.println("informe outra questão que voce quer responder: ");

						questoes = ler.nextInt();
						perguntas++;
					}
					break;
				}
				alunos++;

				double media;

				media = (pontos / alunos);
				System.out.println("Sua nota foi: " + pontos);
				System.out.println("A media dos alunos foi: " + media);
				
				System.out.println("Se deseja iniciar novamente, digite 'sim'");
				começar = ler.next();
			}
		}
	}
}
