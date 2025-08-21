package Lista1;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite o tempo de serviço (anos):");
        int tempoServico = scanner.nextInt();

        if (idade >= 65) {
            System.out.println("Pode se aposentar.");
        } else if (tempoServico >= 30) {
            System.out.println("Pode se aposentar.");
        } else if (idade >= 60 && tempoServico >= 25) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Não pode se aposentar.");
        }
        scanner.close();
    }
}