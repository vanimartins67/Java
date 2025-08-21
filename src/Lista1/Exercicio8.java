package Lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.printf("Raiz quadrada: %.2f\n", raiz);
        } else {
            System.out.println("Número inválido.");
        }
        scanner.close();
    }
}