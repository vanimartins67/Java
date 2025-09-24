package Lista2;
import java.util.Scanner;

public class Lista2Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}