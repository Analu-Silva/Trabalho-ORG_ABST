import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            String menu = """
                    Escolha uma das opções abaixo:
                    1 - Cadastrar Veiculo
                    2 - Listar Veiculos
                    0 - Sair
                    """;
            System.out.println(menu);
            opcao = ler.nextInt();
            ler.nextLine(); 
        } while (opcao != 0);
    }
}
