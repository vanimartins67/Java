package Lista1;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário:");
        double salario = scanner.nextDouble();
        System.out.println("Digite o valor da prestação:");
        double prestacao = scanner.nextDouble();

        if (prestacao > salario * 0.2) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }
        scanner.close();
    }
}