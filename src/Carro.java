import java.util.Scanner;
 
public class Carro {
 
    Scanner scan = new Scanner(System.in);
 
    private int portas;
    private String placa;
 
    public String getPlaca(){
        return placa;
    }
 
    public int getPortas(){
        return portas;
    }
   
    public void setPlaca(String placa){
        this.placa = placa;
    }
 
    public void setPortas(int portas){
        this.portas = portas;
    }
    public static void main(String[] args){
        Carro car1 = new Carro();
        car1.portas = 4;
        car1.placa = "HSX-4444";
        System.out.println(car1.placa);
 
        car1.setPlaca("H20-1111");
        System.out.println(car1.placa);
 
        car1.setPortas(7);
        System.out.println(car1.portas);
        
    }
}
 