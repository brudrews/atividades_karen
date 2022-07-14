import java.util.Scanner;

public class l {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double custo, ing, alc;

        System.out.println("Digite o valor do custo do espetáculo: ");
        custo = sc.nextDouble();

        System.out.println("Digite o valor do ingresso: ");
        ing = sc.nextDouble();

        alc=custo/ing;
        System.out.printf("Quantidade de ingressos vendidos para que o custo seja alcançado: %.2f", alc);

        sc.close();
    }
}
