import java.util.Scanner;

public class h {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sal, c1,c2 , c1f, c2f, restsal;

        System.out.println("Digite seu salário: ");
        sal = sc.nextDouble();

        System.out.println("sua 1° conta: ");
        c1 =sc.nextDouble();

        System.out.println("sua 2° conta: ");
        c2 =sc.nextDouble();

        c1f = c1+(c1*0.02);
        c2f = c2+(c2*0.02);
        restsal = sal-c1f-c2f;

        System.out.println("restará do seu salário: "+restsal);

        sc.close();
    }
}
