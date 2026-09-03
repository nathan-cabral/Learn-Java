package Poo.teste;

import Poo.dominio.professor;

public class professorTeste01 {
    static void main() {
        professor professor = new professor();
        professor.idade = 59;
        professor.nome = "Geraldo";
        professor.sexo = "Masculino";
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }

}
