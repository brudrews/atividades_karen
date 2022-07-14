import java.util.Scanner;

public class n {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saco,racaoRestante, racaoKg;

        System.out.println("Digite o peso do saco de ração em kg: ");
        saco = sc.nextDouble();

        System.out.println("Digite a quantidade para cada gato em gramas: ");
        double gato = sc.nextDouble();

        racaoRestante = saco - ((gato / 1000) * 5);

        System.out.println("Ração restante no pacote: " + racaoRestante + "Kg");
        sc.close();
    }
}
