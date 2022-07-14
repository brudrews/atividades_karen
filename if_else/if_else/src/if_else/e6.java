package if_else;
import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;

        System.out.println("\n1 - Imposto" + "\n2 - Novo salário" + "\n3 - Classificação" + "\nR: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("\nsalário atual: ");
            salario = sc.nextDouble();

            if (salario < 500) {
                System.out.print("\nImposto: " + (salario * 0.05));
            } else if (salario <= 850) {
                System.out.print("\nImposto: " + (salario * 0.10));
            } else {
                System.out.print("\nImposto: " + (salario * 0.15));
            }
            
        } else if (opcao == 2) {
            System.out.print("\nsalário atual: ");
            salario = sc.nextDouble();

            if (salario < 400) {
                salario = salario + 100;
            } else if (salario < 750) {
                salario = salario + 75;
            } else if (salario < 1500) {
                salario = salario + 50;
            } else {
                salario = salario + 25;
            }
            
            System.out.print("\nSeu novo salário será de: " + salario);
            
        } else if (opcao == 3) {
            System.out.print("\nsalário atual: ");
            salario = sc.nextDouble();

            if (salario <= 700) {
                System.out.print("\nmal remunerado!");
            } else {
                System.out.print("\nbem remunerado!");
            }
        }

        sc.close();
    }
}