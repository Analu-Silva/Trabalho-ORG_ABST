//import java.util.Random;

public class ExemploSwitch {
    public static void main(String[] args) { 
        //Random geraraleatorio = new Random();
        //int numero = geraraleatorio.nextInt(101)
        int numero = 2;
        switch (numero) { //o switch executa tudo que vem após o resultado buscado, até achar um break.
            case 1:
                System.out.println("Número UM");
                break;
            case 2:
                System.out.println("Número DOIS");
                break;
            default:
            System.out.println("Numéro >= TRÊS");
                break;
        }
    }
}
