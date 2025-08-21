package Lista1;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho de laboratório (0 a 10):");
        double lab = scanner.nextDouble();
        System.out.println("Digite a nota da avaliação semestral (0 a 10):");
        double aval = scanner.nextDouble();
        System.out.println("Digite a nota do exame final (0 a 10):");
        double exame = scanner.nextDouble();

        if (lab < 0) {
            System.out.println("Nota do laboratório inválida. Deve ser maior ou igual a 0.");
        } else if (lab > 10) {
            System.out.println("Nota do laboratório inválida. Deve ser menor ou igual a 10.");
        } else if (aval < 0) {
            System.out.println("Nota da avaliação inválida. Deve ser maior ou igual a 0.");
        } else if (aval > 10) {
            System.out.println("Nota da avaliação inválida. Deve ser menor ou igual a 10.");
        } else if (exame < 0) {
            System.out.println("Nota do exame inválida. Deve ser maior ou igual a 0.");
        } else if (exame > 10) {
            System.out.println("Nota do exame inválida. Deve ser menor ou igual a 10.");
        } else {
        
            double media = (lab * 2 + aval * 3 + exame * 5) / 10;
            System.out.printf("Média: %.2f\n", media);
            
            if (media < 3) {
                System.out.println("Reprovado.");
            } else if (media < 6) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Aprovado.");
            }
        }
        scanner.close();
    }
}