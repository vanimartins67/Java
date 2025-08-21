package Lista1;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opção:");
        System.out.println("1 - Soma de 2 números");
        System.out.println("2 - Diferença entre 2 números (maior pelo menor)");
        System.out.println("3 - Produto entre 2 números");
        System.out.println("4 - Divisão entre 2 números");
        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        double resultado;

        if (opcao == 1) {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 2) {
            if (num1 > num2) {
                resultado = num1 - num2;
            } else {
                resultado = num2 - num1;
            }
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 3) {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 4) {
            if (num2 == 0) {
                System.out.println("Erro: denominador não pode ser zero.");
            } else {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}