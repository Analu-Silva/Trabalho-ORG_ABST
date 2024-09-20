import java.util.Scanner;

public class DesafioIMC {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = lerTeclado.nextLine();

        System.out.println("Digite o seu gênero: \n"
            + "- 'M' para Masculino\n"
            + " -'F' para Feminino\n"
            + "- 'N' para aqueles que não desejam informar");
        char genero = lerTeclado.nextLine().charAt(0);

        System.out.println("Digite a sua altura");
        double altura = lerTeclado.nextDouble();

        System.out.println("Digite o seu peso:");
        int peso = lerTeclado.nextInt();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        System.out.println("Sua classificação é: ");
        lerTeclado.close();

        if (genero == 'M'){
            if (imc >= 40)
                System.out.println("Obesidade Mórbida");
            else if (imc >= 30) 
                System.out.println("Obesidade Moderada");
            else if (imc >= 25)
                System.out.println("Obesidade Leve");
            else if (imc >= 20) 
                System.out.println("Normal");
            else {
                System.out.println("Abaixo do Normal");
            }
        } 
        else {
            if (imc >= 39)
                System.out.println("Obesidade Mórbida");
            else if (imc >= 29)
            System.out.println("Obesidade Moderada");
            else if (imc >= 24)
                System.out.println("Obesidade Leve");
            else if (imc >= 19) 
                System.out.println("Normal");
            else {
                System.out.println("Abaixo do Normal");
                }
            }
    }
}
