package Lista1;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();
        double preco = 0;

        if (codigo == 100) {
            preco = 12.00;
        } else if (codigo == 102) {
            preco = 18.50;
        } else if (codigo == 103) {
            preco = 25.50;
        } else if (codigo == 104) {
            preco = 17.00;
        } else if (codigo == 105) {
            preco = 9.50;
        } else if (codigo == 106) {
            preco = 6.00;
        } else {
            System.out.println("Código inválido.");
            scanner.close();
            return;
        }

        double total = preco * quantidade;
        System.out.printf("Total a pagar: R$ %.2f\n", total);
        scanner.close();
    }
}