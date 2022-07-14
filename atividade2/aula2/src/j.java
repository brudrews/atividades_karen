import java.util.Scanner;

public class j {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double din, dolar,euro,le;

        System.out.println("Quantidade de dinheiro que você possui em reais: ");
        din = sc.nextDouble();

        dolar=din/4.97;
        euro=din/5.25;
        le=din/6.26;
        System.out.printf("\nQuantidade de dinheiro que você possui em dólar: %.2f ",dolar);
        System.out.printf("\nQuantidade de dinheiro que você possui em euro:%.2f ",euro);
        System.out.printf("\nQuantidade de dinheiro que você possui em libra esterlina:%.2f ",le);

        sc.close();
    }
}