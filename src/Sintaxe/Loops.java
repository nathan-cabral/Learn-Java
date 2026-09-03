package Sintaxe;
import java.util.ArrayList;

public class Loops {
    static void main() {

        ArrayList<String>nomes=new ArrayList<>();
        nomes.add("Nathan");
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Matias");
        nomes.add("Jeremias");
        nomes.add("Carlos");

        for(int i=0;i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }

        for(String nome:nomes){
            System.out.println(nome);
        }

        int cont=0;
        while(cont<10){
            System.out.println(cont);
            cont++;
        }

    }
}
