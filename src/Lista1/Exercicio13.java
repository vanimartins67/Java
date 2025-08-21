package Lista1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Maior: " + a);
        } else if (b > a) {
            System.out.println("Maior: " + b);
        } else {
            System.out.println("Números iguais.");
        }
        scanner.close();
    }
}