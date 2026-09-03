package Poo.A_introducaoClasses.teste;


import Poo.A_introducaoClasses.dominio.Estudante;

public class EstudanteTeste {
    static void main() {
        Estudante[] estudante = new Estudante[4];
        estudante[0]=new Estudante();
        estudante[1]=new Estudante();
        estudante[2]=new Estudante();
        estudante[3]=new Estudante();


        estudante[0].nome="Nathan";
        estudante[0].sexo="Masculino";
        estudante[0].idade=19;
        estudante[0].media=6.00;
        estudante[0].turma=3;

        estudante[1].nome="Bruno";
        estudante[1].sexo="Masculino";
        estudante[1].idade=20;
        estudante[1].media=5.00;
        estudante[1].turma=3;

        estudante[2].nome="Larissa";
        estudante[2].sexo="Feminino";
        estudante[2].idade=19;
        estudante[2].media=6.04;
        estudante[2].turma=3;

        estudante[3].nome="Joao";
        estudante[3].sexo="Masculino";
        estudante[3].idade=20;
        estudante[3].media=3.00;
        estudante[3].turma=3;


        /*for(int i=0;i<estudante.length;i++){
            System.out.println(estudante[i].nome);
            System.out.println(estudante[i].sexo);
            System.out.println(estudante[i].idade);
            System.out.println(estudante[i].media);
            System.out.println(estudante[i].turma);
            System.out.println();
        }*/

        for(int i=0;i<estudante.length;i++){
            if(estudante[i].media>=6.00){
                System.out.println("Aluno aprovado: "+estudante[i].nome);

            }else if(estudante[i].media>=4.50){
                System.out.println("Aluno em recuparacao: "+estudante[i].nome);

            }else{
                System.out.println("Aluno reprovado: "+estudante[i].nome);

            }
            System.out.println("Media final: "+estudante[i].media);
            System.out.println();
        }





    }
}
