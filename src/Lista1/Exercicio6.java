package Lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Em que turno você estuda?");
        System.out.println("Digite M para Matutino");
        System.out.println("Digite V para Vespertino");
        System.out.println("Digite N para Noturno");
        String turno = scanner.next();
        
        if (turno.equals("M") || turno.equals("m")) {
            System.out.println("Bom Dia!");
        } else if (turno.equals("V") || turno.equals("v")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equals("N") || turno.equals("n")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }
        scanner.close();
    }
}