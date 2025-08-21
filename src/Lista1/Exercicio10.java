package Lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int quadrado = numero * numero;
            double raiz = Math.sqrt(numero);
            System.out.println("Quadrado: " + quadrado);
            System.out.printf("Raiz quadrada: %.2f\n", raiz);
        } else {
            System.out.println("Número inválido.");
        }
        scanner.close();
    }
}