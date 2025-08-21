package Lista1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas:");
        double horas = scanner.nextDouble();
        double salarioBruto = horas * 40.50;
        double imposto = 0;

        if (salarioBruto > 2500) {
            imposto = (salarioBruto - 2500) * 0.11;
        }

        double salarioLiquido = salarioBruto - imposto;
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
        scanner.close();
    }
}