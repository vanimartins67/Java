
import java.util.Scanner;

public class exemplo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        System.out.println("O número digitado foi: " + number);

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}