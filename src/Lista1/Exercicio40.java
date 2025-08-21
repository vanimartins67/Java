package Lista1;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor por hora:");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite as horas trabalhadas no mês:");
        double horas = scanner.nextDouble();
        
        double salarioBruto = valorHora * horas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;
        
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("IR (11%%): R$ %.2f\n", ir);
        System.out.printf("INSS (8%%): R$ %.2f\n", inss);
        System.out.printf("Sindicato (5%%): R$ %.2f\n", sindicato);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
        scanner.close();
    }
}