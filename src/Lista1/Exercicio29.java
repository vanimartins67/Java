package Lista1;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();
        System.out.println("Digite o estado (MG, SP, RJ ou MS):");
        char estado1 = scanner.next().charAt(0);
        char estado2 = scanner.next().charAt(0);
        double imposto = 0;

        if (estado1 == 'M' && estado2 == 'G') {
            imposto = valor * 0.07;
        } else if (estado1 == 'S' && estado2 == 'P') {
            imposto = valor * 0.12;
        } else if (estado1 == 'R' && estado2 == 'J') {
            imposto = valor * 0.15;
        } else if (estado1 == 'M' && estado2 == 'S') {
            imposto = valor * 0.08;
        } else {
            System.out.println("Estado inválido.");
            scanner.close();
            return;
        }

        double precoFinal = valor + imposto;
        System.out.printf("Preço final: R$ %.2f\n", precoFinal);
        scanner.close();
    }
}