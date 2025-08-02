import java.util.Scanner;

public class Exerc2 {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num = scanner.nextInt();

    if (num > 10){
        System.out.println("O número é maior do que 10.");
    }
    else if (num < 10){
        System.out.println("O número é menor do que 10.");
    }

    scanner.close()
    
}
