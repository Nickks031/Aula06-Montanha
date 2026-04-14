import java.util.Scanner;

public class MotorDeIMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== MOTOR DE IMC: PRECISÃO + ENGENHARIA ===");
        
        System.out.print("Digite o seu peso em kg (ex: 75,0): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a sua altura em metros (ex: 1,75): ");
        double altura = entrada.nextDouble();

        double valorIMC = calcularIMC(peso, altura);

        String diagnostico = classificarIMC(valorIMC);

        // 4. Exibe os resultados na tela
        System.out.printf("\nResultado numérico puro do IMC: %.2f\n", valorIMC);
        System.out.println("Diagnóstico: " + diagnostico);

        entrada.close();
    }
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Normal";
        } else if (imc >= 25.0 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}