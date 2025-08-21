package Lista1;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida (Km):");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o consumo de gasolina (litros):");
        double litros = scanner.nextDouble();

        double consumo = distancia / litros;

        if (consumo < 8) {
            System.out.println("Venda o carro!");
        } else if (consumo <= 14) {
            System.out.println("Econômico!");
        } else {
            System.out.println("Super econômico!");
        }
        scanner.close();
    }
}