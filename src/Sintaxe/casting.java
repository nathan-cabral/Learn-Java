package Sintaxe;

public class casting {
    static void main() {

        double result=0.05;
        int resultInt=(int)result;
        System.out.println(resultInt);

        int meuInt=10;
        double meuDouble=meuInt;
        System.out.println(meuDouble);

        //String para numero IMPORTANTE
        String MString="10",MString2="20";
        int meuInt2=Integer.parseInt(MString);
        int meuInt3=Integer.parseInt(MString2);
        System.out.println(meuInt3+meuInt2);


    }
}
