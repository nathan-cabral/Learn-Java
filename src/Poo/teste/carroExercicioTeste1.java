package Poo.teste;

import Poo.dominio.carroExercicio;

public class carroExercicioTeste1 {
    static void main() {
        carroExercicio carro01=new carroExercicio();
        carroExercicio carro02=new carroExercicio();
        carro01.ano=2020;
        carro01.nome="Hillux";
        carro01.modelo="caminhonete";
        carro02.nome="tracker";
        carro02.ano=2021;
        carro02.modelo="SUV";
        System.out.println(carro01.ano+" "+carro01.modelo+" "+carro01.nome);
        System.out.println(carro02.ano+" "+carro02.modelo+" "+carro02.nome);
    }
}
