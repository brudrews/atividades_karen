import java.util.Scanner;

public class f {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salmin, sal, qsm;

        System.out.println("Digite o valor do salário mínimo: ");
        salmin = sc.nextDouble();

        System.out.println("Digite o valor de seu salário: ");
        sal = sc.nextDouble();

        qsm = sal/salmin;
        System.out.printf("Quantidade de salários mínimos que você ganha: %.2f", qsm);

        sc.close();
    }
}
