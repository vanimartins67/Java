public class Vetor3 {
    
    
    public static void main(String[] args) {
        String[] frutas = {"Banana", "Maçã", "Kiwi", "Mamão"};
        
        String fruta_preferida = frutas[1];
        System.out.println("Minha fruta preferida é: " + fruta_preferida);

        for(int i=0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
    }
}
