public class Vetor {
    public static void main(String[] args) {
        int[] vet = new int[10];
        
        vet[0] = 10;
        vet[1] = vet[0] + 10;
        vet[2] = vet[1] + 10;
        vet[3] = vet[2] + 10;
        vet[4] = vet[3] + 10;
        vet[5] = vet[4] + 10;
        vet[6] = vet[5] + 10;
        vet[7] = vet[6] + 10;
        vet[8] = vet[7] + 10;
        vet[9] = vet[8] + 10;

        System.out.println(vet[9]);
    }

}