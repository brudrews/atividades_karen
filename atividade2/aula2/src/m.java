import java.util.Scanner;

public class m {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salm, qw, vqw,vp,vpd;

        System.out.println("Digite o valor do salário mínimo: ");
        salm = sc.nextDouble();

        System.out.println("Digite a quantidade de quilowatts consumida: ");
        qw = sc.nextDouble();

        vqw=salm/5;
        System.out.println("valor de cada quilowatts: "+vqw);
        vp=qw*vqw;
        System.out.println("valor a ser pago: "+vp);
        vpd= vp-(vp*0.15);
        System.out.println("valor a ser pago com desconto: "+vpd);

        sc.close();
    }
}
