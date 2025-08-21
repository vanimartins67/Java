package Lista1;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base maior do trapézio:");
        double baseMaior = scanner.nextDouble();
        System.out.println("Digite a base menor do trapézio:");
        double baseMenor = scanner.nextDouble();
        System.out.println("Digite a altura do trapézio:");
        double altura = scanner.nextDouble();

        if (baseMaior <= 0 || baseMenor <= 0) {
            System.out.println("As bases devem ser maiores que zero.");
        } else {
            double area = ((baseMaior + baseMenor) * altura) / 2;
            System.out.printf("Área do trapézio: %.2f\n", area);
        }
        scanner.close();
    }
}