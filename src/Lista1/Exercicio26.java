package Lista1;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        boolean formaTriangulo = true;
        
        if (a >= b + c) {
            formaTriangulo = false;
        }
        if (b >= a + c) {
            formaTriangulo = false;
        }
        if (c >= a + b) {
            formaTriangulo = false;
        }

        if (!formaTriangulo) {
            System.out.println("Não forma um triângulo.");
        } else {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        }
        scanner.close();
    }
}