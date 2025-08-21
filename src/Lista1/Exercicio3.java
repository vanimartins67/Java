package Lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("O número %d é maior que o número %d.", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("O número %d é maior que o número %d.", num2, num1);
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}