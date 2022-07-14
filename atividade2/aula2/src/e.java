import java.util.Scanner;

public class e {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sal, com, vendas, salfi;

        System.out.println("Digite seu salário fixo: ");
        sal = sc.nextDouble();

        System.out.println("Digite o valor de suas vendas: ");
        vendas = sc.nextDouble();

        com=vendas*0.04;
        System.out.println("Sua comissão é: " +com);

        salfi=sal+com;
        System.out.println("Seu salário final é: "+salfi);

        sc.close();
    }
}