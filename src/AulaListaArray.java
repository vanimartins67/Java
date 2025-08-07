import java.util.ArrayList;
import java.util.List;

public class AulaListaArray {
    public static void main(String[] args) {
       
        
    List<Double> notas = new ArrayList<>();

        notas.add(7.5);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(9.0);
        notas.add(5.5);

        System.out.println("Tamanho da lista de notas: " + notas.size());
        
        // Remover a nota na posição 2
        notas.remove(2);
        System.out.println("Tamanho após remoção: " + notas.size());
        
        // Exibir a nota na posição 3
        System.out.println("Nota na posição 3: " + notas.get(2));
        
        // Atualizar a nota na posição 4
        notas.set(3, 10.0);
        
        // Exibir a nova nota na posição 4
        System.out.println("Nova nota na posição 4: " + notas.get(3));
    }



    



}}