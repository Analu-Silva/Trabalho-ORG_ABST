import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JogodeAdivinhacao {
    public static void main(String[] args) {
        Random geraraleatorio = new Random();
        int numeroAleatorio = geraraleatorio.nextInt(100) + 1;
        int tentativas = 0;
        int limiteTentativas = 8;
        Scanner lerTeclado = new Scanner(System.in);
        List<Integer> chutes = new ArrayList<>();

        System.out.println("Bem-vindo ao Jogo de Adivinhação!\n" + "Você tem " + limiteTentativas + " tentativas para adivinhar um número de 1 a 100\n");

        int opcao;
        do {
            String menu = """
                    Escolha uma das opções abaixo:
                    1 - Jogar
                    0 - Sair
                    """;
            System.out.println(menu);
            opcao = lerTeclado.nextInt();
            lerTeclado.nextLine();

            if (opcao == 1) {
                while (limiteTentativas != 0) {
                    System.out.println("Qual é o seu chute? ");
                    int chute = lerTeclado.nextInt();
                    if (chutes.contains(chute)) {
                        System.out.println("Você já tentou esse número. Tente outro.\n");
                        continue;
                    }
                    chutes.add(chute);

                    if (chute != numeroAleatorio) {
                        tentativas++;
                        limiteTentativas--;
                        System.out.println("\nNúmero errado!\n" + "Você usou " + tentativas + " tentativas\n");

                        if (numeroAleatorio < chute) {
                            System.out.println("O número sorteado é menor que o seu chute\n");
                        } else {
                            System.out.println("O número sorteado é maior que o seu chute\n");
                        }

                        if (limiteTentativas == 0) {
                            System.out.println("Você usou todas as suas tentativas!\n" + "O número sorteado era: " + numeroAleatorio);
                            System.out.print("\r\n");
                            break;
                        }
                    } else {
                        tentativas++;
                        System.out.printf("Parabéns! Você acertou em %d tentativas\n", tentativas);
                        System.out.print("\r\n");
                        break;
                    }
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        lerTeclado.close();
    }
}

