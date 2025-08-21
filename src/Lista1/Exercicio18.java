package Lista1;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro maior que zero:");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido.");
        } else {
            int soma = 0;
            int numeroTemp = numero;
            
            while (numeroTemp > 0) {
                soma += numeroTemp % 10;
                numeroTemp /= 10;
            }

            System.out.println("Soma dos algarismos: " + soma);
        }
        scanner.close();
    }
}