import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        double num2  = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        double produto;
        double soma;
        double cubo;

        produto = num1*(num2/2);
        soma = (3*(num1)+num3);
        cubo = Math.pow(num3,3);

            System.out.printf("O produto é: %.2f\n", produto);
            System.out.printf("A soma é: %.2f\n", soma);
            System.out.printf("O cubo é: %.2f\n", cubo);

        scanner.close();

    


    }
}
