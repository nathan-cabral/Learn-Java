package Poo.B_introducaoMetodos.teste;

import Poo.B_introducaoMetodos.dominio.calculadora;

public class calculadoraTeste01 {
    static void main() {
        calculadora calc=new calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(220,2);
        double resultDividir=calc.dividirDoisNumeros(5,0);
        if(resultDividir==0){
            System.out.println("Impossivel calcular. N2=0");
        }else{
            System.out.println(resultDividir);
        }

    }
}
