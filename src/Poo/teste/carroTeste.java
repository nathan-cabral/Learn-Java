package Poo.teste;

import java.util.Scanner;

import Poo.dominio.Carro;

public class carroTeste {
    static void main() {
        Carro[] carro = new Carro[10];
        carro[0] = new Carro();
        carro[1] = new Carro();
        carro[2] = new Carro();
        carro[3] = new Carro();
        carro[4] = new Carro();
        carro[5] = new Carro();
        carro[6] = new Carro();
        carro[7] = new Carro();
        carro[8] = new Carro();
        carro[9] = new Carro();

        carro[0].modelo = "Onix";
        carro[0].ano = 2023;
        carro[0].placa = "ONI23";
        carro[0].Kmrodado = 80505;
        carro[0].preco = 60000;

        carro[1].modelo = "Mobi";
        carro[1].ano = 2026;
        carro[1].placa = "MO26";
        carro[1].Kmrodado = 64500;
        carro[1].preco = 65000;

        carro[2].modelo = "Argo";
        carro[2].ano = 2024;
        carro[2].placa = "AR24";
        carro[2].Kmrodado = 34898;
        carro[2].preco = 57500;

        carro[3].modelo = "Kicks";
        carro[3].ano = 2024;
        carro[3].placa = "KI24";
        carro[3].Kmrodado = 157675;
        carro[3].preco = 80000;

        carro[4].modelo = "Celta";
        carro[4].ano = 2018;
        carro[4].placa = "CE18";
        carro[4].Kmrodado = 243909;
        carro[4].preco = 20000;

        carro[5].modelo = "Up";
        carro[5].ano = 2018;
        carro[5].placa = "UP18";
        carro[5].Kmrodado = 87909;
        carro[5].preco = 55500;

        carro[6].modelo = "Sandero";
        carro[6].ano = 2020;
        carro[6].placa = "SAN20";
        carro[6].Kmrodado = 55456;
        carro[6].preco = 67200;

        carro[7].modelo = "Kwid";
        carro[7].ano = 2024;
        carro[7].placa = "KW24";
        carro[7].Kmrodado = 20045;
        carro[7].preco = 70000;

        carro[8].modelo = "Polo";
        carro[8].ano = 2026;
        carro[8].placa = "PO26";
        carro[8].Kmrodado = 0;
        carro[8].preco = 120006;

        carro[9].modelo = "Touro";
        carro[9].ano = 2020;
        carro[9].placa = "TO20";
        carro[9].Kmrodado = 110039;
        carro[9].preco = 7300;


        /*Scanner input=new Scanner(System.in);
        int ano=input.nextInt();
        double Kmrodado=input.nextDouble();
        String modelo=input.next();*/

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seus dados");
        System.out.println("Nome: ");
        String nameUser = input.next();
        System.out.println("CPF: ");
        int cpfUser = input.nextInt();
        int escolha = 1;
        String modelCar = "";
        int anoCar = 0, cont = 0;
        double kmCar = 0.0, precoCar = 0.0;
        while (escolha != 0) {
            System.out.println("FILTROS: ");
            System.out.println("1-MODELO\n" +
                    "2-ANO\n" +
                    "3-KILOMETRAGEM\n" +
                    "4-PRECO\n" +
                    "0-SEM FILTROS");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Modelo : ");
                    modelCar = input.next();
                    cont++;
                    break;
                case 2:
                    System.out.println("Ano : ");
                    anoCar = input.nextInt();
                    cont++;
                    break;
                case 3:
                    System.out.println("Kilometragem : ");
                    kmCar = input.nextDouble();
                    cont++;
                    break;
                case 4:
                    System.out.println("Preco : ate R$");
                    precoCar = input.nextDouble();
                    cont++;
                    break;
                default:
                    break;

            }

        }

        int[] posicaoCar = new int[10];

        if (cont != 0) {

            for (int i = 0; i < carro.length; i++) {
                if (carro[i].modelo.equals(modelCar)) {
                    posicaoCar[i] = i;
                }
                if (carro[i].ano == anoCar) {
                    posicaoCar[i] = i;
                }
                if (carro[i].Kmrodado == kmCar) {
                    posicaoCar[i] = i;
                }
                if (carro[i].preco <= precoCar) {
                    posicaoCar[i] = i;
                }
            }
        }
        if(cont!=0) {

            for (int i = 0; i < carro.length; i++) {
                if (posicaoCar[i] == i) {
                    System.out.println("MODELO: " + carro[i].modelo);
                    System.out.println("ANO: " + carro[i].ano);
                    System.out.println("PLACA: " + carro[i].placa);
                    System.out.println("KILOMETRAGEM: " + carro[i].Kmrodado);
                    System.out.println("PRECO: R$" + carro[i].preco);
                    System.out.println();
                }

            }

        }else{
            for(int i=0;i<carro.length;i++){
                System.out.println("MODELO: " + carro[i].modelo);
                System.out.println("ANO: " + carro[i].ano);
                System.out.println("PLACA: " + carro[i].placa);
                System.out.println("KILOMETRAGEM: " + carro[i].Kmrodado);
                System.out.println("PRECO: R$" + carro[i].preco);
                System.out.println();
            }
        }


    }
}
