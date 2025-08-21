package Lista1;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o custo de fábrica:");
        double custoFabrica = scanner.nextDouble();
        double comissao = 0;
        double impostos = 0;

        if (custoFabrica <= 12000) {
            comissao = custoFabrica * 0.05;
        } else if (custoFabrica <= 25000) {
            comissao = custoFabrica * 0.10;
            impostos = custoFabrica * 0.15;
        } else {
            comissao = custoFabrica * 0.15;
            impostos = custoFabrica * 0.20;
        }

        double custoConsumidor = custoFabrica + comissao + impostos;
        System.out.printf("Custo ao consumidor: R$ %.2f\n", custoConsumidor);
        scanner.close();
    }
}