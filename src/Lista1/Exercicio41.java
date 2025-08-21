package Lista1;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        double a = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("Não é equação de segundo grau");
        } else {
            System.out.println("Digite o valor de b:");
            double b = scanner.nextDouble();
            System.out.println("Digite o valor de c:");
            double c = scanner.nextDouble();
            
            double delta = (b * b) - (4 * a * c);
            
            if (delta < 0) {
                System.out.println("Não existe raiz real");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Raiz única: " + raiz);
            } else {
                double raizDelta = 1;
                while (raizDelta * raizDelta < delta) {
                    raizDelta += 0.001;
                }
                
                double raiz1 = (-b + raizDelta) / (2 * a);
                double raiz2 = (-b - raizDelta) / (2 * a);
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }
        scanner.close();
    }
}