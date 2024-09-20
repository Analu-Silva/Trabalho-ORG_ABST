import java.util.Scanner;

public class Exemploif {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite a nota G1:");
        Double notaG1 = lerTeclado.nextDouble();
        lerTeclado.nextLine();
        System.out.println("Digite a nota G2:");
        Double notaG2 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); // limpar buffer
        Double media = (notaG1 + notaG2) / 2;
        System.out.printf("Sua média final é: %.2f\n", media); // Aparecer duas casas decimais no resultado final. A
                                                             // virgula serve para substituir os caracteres anteriores.
                                                             // '\n' é utilizado para quebra de linha.
        if (media >= 7)
            System.out.println("Parabéns!! Você está aprovado!");
        else {
            if (media >= 3)
                System.out.println("Você está em Exame");
            else
                System.out.println("Infelizmente, não foi dessa vez...");
        }
    }
}