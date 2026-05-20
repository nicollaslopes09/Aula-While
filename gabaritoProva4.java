package exemploWhile;

import java.util.Scanner;

public class gabaritoProva4 {
	

	    public static void main(String[] args) {

	        Scanner ler = new Scanner(System.in);

	        String gabarito, comecar;

	        int pontos;
	        int questoes;
	        int perguntas;
	        int alunos = 0;
	        int somaNotas = 0;

	        System.out.println("Bem vindo ao corretor de provas automático");

	        System.out.println("Digite sim para começar");
	        comecar = ler.next();

	        while (comecar.equalsIgnoreCase("sim")) {

	            // RESETAR para cada aluno
	            pontos = 0;
	            perguntas = 1;

	            while (perguntas <= 10) {

	                System.out.println("Informe a questão que voce quer responder: ");
	                questoes = ler.nextInt();

	                System.out.println("Informe sua resposta da questão " + questoes + ": ");
	                gabarito = ler.next();

	                switch (questoes) {

	                    case 1:
	                        if (gabarito.equalsIgnoreCase("A")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 2:
	                        if (gabarito.equalsIgnoreCase("B")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 3:
	                        if (gabarito.equalsIgnoreCase("C")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 4:
	                        if (gabarito.equalsIgnoreCase("D")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 5:
	                        if (gabarito.equalsIgnoreCase("E")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 6:
	                        if (gabarito.equalsIgnoreCase("E")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 7:
	                        if (gabarito.equalsIgnoreCase("D")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 8:
	                        if (gabarito.equalsIgnoreCase("C")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 9:
	                        if (gabarito.equalsIgnoreCase("B")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    case 10:
	                        if (gabarito.equalsIgnoreCase("A")) {
	                            System.out.println("Resposta correta!");
	                            pontos++;
	                        } else {
	                            System.out.println("Resposta incorreta!");
	                        }
	                        break;

	                    default:
	                        System.out.println("Questão inválida!");
	                        perguntas--;
	                        break;
	                }

	                perguntas++;
	            }

	            alunos++;
	            somaNotas += pontos;

	            double media = (double) somaNotas / alunos;

	            System.out.println("Sua nota foi: " + pontos);
	            System.out.println("Total de alunos: " + alunos);
	            System.out.println("Média da turma: " + media);

	            System.out.println("Outro aluno deseja usar o sistema? Digite sim");
	            comecar = ler.next();
	        }

	        System.out.println("Sistema encerrado.");
	        ler.close();
	    }
	}
