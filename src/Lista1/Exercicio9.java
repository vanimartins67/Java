package Lista1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores invertidos: " + a + " e " + b);
        scanner.close();
    }
}