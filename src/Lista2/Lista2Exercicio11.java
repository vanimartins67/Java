public class Lista2Exercicio11 {
    public static void main(String[] args) {
        int soma = 0;
        int count = 0;
        int numero = 0;
        
        while (count < 50 && numero <= 100) {
            if (numero % 2 == 0) {
                soma += numero;
                count++;
            }
            numero++;
        }
        
        System.out.println("Soma dos 50 primeiros números pares: " + soma);
    }
}