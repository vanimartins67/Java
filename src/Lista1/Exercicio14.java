package Lista1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida.");
        } else {
            double media = (nota1 + nota2) / 2;
            System.out.printf("Média: %.2f\n", media);
        }
        scanner.close();
    }
}