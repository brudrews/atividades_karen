import java.util.Scanner;

public class d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preco;

        System.out.println("Digite o preço de um produto: ");
        preco = sc.nextDouble();

        System.out.println("novo preço do produto: " + (preco*0.9));

        sc.close();
    }
    }