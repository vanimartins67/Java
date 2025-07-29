public class Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Valor de i: " + i);
            i++;
        }
        
        for (int j = 0; j < 10; j++) {
            System.out.println("Valor de j: " + j);
        }
        
        do {
            System.out.println("Valor de i no do-while: " + i);
            i++;
        } while (i < 15);
    }
}
