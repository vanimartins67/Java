package Lista1;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso (kg):");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura (m):");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do Peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Saudável");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Peso em excesso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }
        scanner.close();
    }
}