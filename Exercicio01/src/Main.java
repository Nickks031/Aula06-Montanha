//Nome: Nicolas Ribeiro
//Matricula: 1222010390

public class Main {

    // 1. Assinatura
    public static int maior(int a, int b) {

        // 2. Lógica interna
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        // 3. Uso no main
        int maximo = maior(10, 42);

        System.out.println("O maior número é: " + maximo);
    }
}