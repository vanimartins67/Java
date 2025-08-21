package Lista1;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura (m):");
        double altura = scanner.nextDouble();
        System.out.println("Digite o sexo (M para masculino, F para feminino):");
        char sexo = scanner.next().charAt(0);
        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido.");
        }
        scanner.close();
    }
}