package matie;
import java.util.Scanner;

public class e2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, meda, falta;

        System.out.println("nota 1: ");
        n1 = sc.nextDouble();
        System.out.println("nota 2: ");
        n2 = sc.nextDouble();
        System.out.println("nota 3: ");
        n3 = sc.nextDouble();

        meda= (n1+n2+n3)/3;
        System.out.println("media aritmetica: "+meda);

        if (meda >=7 && meda <10){
            System.out.println("aprovado");
        }
        if (meda >=3 && meda <7){
            System.out.println("exame");
            falta = (6-meda);
            System.out.println("falta para vc ser aprovado: "+falta);
        }
        if (meda <= 3){
            System.out.println("reprovado");
        }

        sc.close();
    }
}
