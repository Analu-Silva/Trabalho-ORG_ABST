import java.util.Scanner;

public class CalculaHipotenusa {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Cateto A: ");
        double catetoA = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //Limpar Buffer - que é o local que armazena as informações, nesse caso, armazenou o espaço em branco do decimal.
        System.out.print("Cateto B: ");
        double catetoB = lerTeclado.nextDouble();
        lerTeclado.nextLine();
        catetoA = catetoA * catetoA;
        catetoB = Math.pow(catetoB, 2); //No 'pow' o primeiro parametro qual numero elevar e no segundo parametro, por quanto sera elevado.
        double hipotenusa = Math.sqrt(catetoA + catetoB);
        System.out.println("Hipotenusa: " + hipotenusa);
    }
}
