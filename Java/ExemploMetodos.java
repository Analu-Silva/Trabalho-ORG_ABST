public class ExemploMetodos {
    public static void main(String[] args) {
        imprimeOi();
        double resultado = somarNumeros(2, 3);
        resultado = somarNumeros(2.5, 3.5);
    }
    static double somarNumeros(double a, double b){
        return a + b;
    }
// Void - quando não ira retornar nada, nenhum valor em especifico//
    static void imprimeOi(){
        System.out.println("Oi");
    }
}