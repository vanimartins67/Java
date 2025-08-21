package Lista1;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();
        
        if (ano % 400 == 0) {
            System.out.println(ano + " é bissexto.");
        } else if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
        scanner.close();
    }
}