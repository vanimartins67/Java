package Lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int b = scanner.nextInt();

        int maior;
        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }
        
        int diferenca;
        if (a > b) {
            diferenca = a - b;
        } else {
            diferenca = b - a;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Diferença: " + diferenca);
        scanner.close();
    }
}