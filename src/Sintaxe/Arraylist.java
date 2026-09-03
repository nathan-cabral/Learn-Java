package Sintaxe;
import java.util.ArrayList;

public class Arraylist {
    static void main() {


    ArrayList<String>nomes=new ArrayList<>();
    nomes.add("Nathan");
    nomes.add("Joao");
    nomes.add("Maria");
    nomes.add("Josias");

    System.out.println(nomes.get(0));
    nomes.remove(0);
    System.out.println(nomes.get(0));

    }
}
