package Poo.B_introducaoMetodos.dominio;

public class calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 2);
        System.out.println("Metodo somar finalizado");
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 2);
        System.out.println("Metodo subtrair finalizado");
    }

    public void multiplicaDoisNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double dividirDoisNumeros(double n1,double n2){
        if(n2==0){
            return 0;
        }else{
            return n1/n2;
        }
    }

    //AULA 48

}
