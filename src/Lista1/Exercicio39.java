package Lista1;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a área em metros quadrados:");
        double area = scanner.nextDouble();
        double litros = area / 6;
        
        int latas = (int) Math.ceil(litros / 18);
        double precoLatas = latas * 80.00;
        
        int galoes = (int) Math.ceil(litros / 3.6);
        double precoGaloes = galoes * 25.00;
        
        int latasOtimizadas = (int) (litros / 18);
        double resto = litros % 18;
        int galoesOtimizados = (int) Math.ceil(resto / 3.6);
        double precoMisto = (latasOtimizadas * 80.00) + (galoesOtimizados * 25.00);

        System.out.println("Apenas latas de 18L:");
        System.out.println("Quantidade: " + latas + " latas");
        System.out.printf("Preço: R$ %.2f\n", precoLatas);
        
        System.out.println("Apenas galões de 3.6L:");
        System.out.println("Quantidade: " + galoes + " galões");
        System.out.printf("Preço: R$ %.2f\n", precoGaloes);
        
        System.out.println("Mistura otimizada:");
        System.out.println("Quantidade: " + latasOtimizadas + " latas e " + galoesOtimizados + " galões");
        System.out.printf("Preço: R$ %.2f\n", precoMisto);
        scanner.close();
    }
}