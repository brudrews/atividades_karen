import java.util.Scanner;

public class e4 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeQW = 1, consumidores = 0;
        double valorASerPago = 0, faturamentoTotal = 0;

        while (true) {
            System.out.print("Qual o valor do seu sal�rio m�nimo?\n ");
            double salario = sc.nextDouble();

            System.out.print("Quantos QuiloWatts gastou?\n: ");
            quantidadeQW = sc.nextInt();

            if (quantidadeQW == 0) {
                break;
            }
            ;

            System.out.print("Escolha seu tipo de consumidor:1 - Residencialn2 - Comercial3 - Industrial: ");
            int tipoConsumidor = sc.nextInt();

            System.out.print("\nValor do QuiloWatt: " + (salario / 8));

            switch (tipoConsumidor) {
            case 1:
                valorASerPago = (((salario / 8) * quantidadeQW) + ((salario / 8) * quantidadeQW) * 0.05);
                System.out.print("\nAcr�scimo: 5% \nValor a ser pago: " + valorASerPago + "\n\n");
                break;

            case 2:
                valorASerPago = (((salario / 8) * quantidadeQW) + ((salario / 8) * quantidadeQW) * 0.10);
                System.out.print("\nAcr�scimo: 10% \nValor a ser pago: " + valorASerPago + "\n\n");
                break;

            case 3:
                valorASerPago = (((salario / 8) * quantidadeQW) + ((salario / 8) * quantidadeQW) * 0.15);
                System.out.print("\nAcr�scimo: 15% \nValor a ser pago: " + valorASerPago + "\n\n");
                break;
            }

            if (valorASerPago >= 500 && valorASerPago <= 1000) {
                consumidores++;
            }

            faturamentoTotal += valorASerPago;
        }

        System.out.print("\nFaturamento geral da empresa: " + faturamentoTotal
                + "\nQuantidade de consumidres que gastam de R$ 500,00 � R$ 1000,00: " + consumidores);

        sc.close();
    }
}