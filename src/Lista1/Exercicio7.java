package Lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de aquisição do produto:");
        double valorAquisicao = scanner.nextDouble();
        double valorVenda;

        if (valorAquisicao < 50) {
            valorVenda = valorAquisicao * 1.45;
        } else {
            valorVenda = valorAquisicao * 1.30;
        }

        System.out.printf("Valor de venda: R$ %.2f\n", valorVenda);
        scanner.close();
    }
}