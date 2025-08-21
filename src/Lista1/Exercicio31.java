package Lista1;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else if (idade >= 18) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade não possui categoria.");
        }
        scanner.close();
    }
}