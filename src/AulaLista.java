import java.util.ArrayList;
import java.util.List;


public class AulaLista {
    public static void main(String[] args) {
       
        
        List<String> listanomes = new ArrayList<>();

        listanomes.add("Alan");
        listanomes.add("Luan");
        listanomes.add("Maria");
        listanomes.add("Carlos");
        listanomes.add("Luis");
        listanomes.add("Yan");

        System.out.println(listanomes.size());
        listanomes.remove(2);
        System.out.println(listanomes.size());
        System.out.println(listanomes.get(3));


        String nome = listanomes.get(2);
        System.out.println(nome);
        listanomes.set(4, "José");

        String novo_nome = listanomes.get(4);
        System.out.println(novo_nome);
        
    }
}
