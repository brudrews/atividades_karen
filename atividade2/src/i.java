import java.util.Scanner;

public class i {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double ht, salm, he, salb, vht, vhe, reche, salrec;

        System.out.println("Número de horas trabalhadas: ");
        ht = sc.nextDouble();

        System.out.println("Valor do salário mínimo: ");
        salm = sc.nextDouble();

        System.out.println("Número de horas extras trabalhadas: ");
        he = sc.nextDouble();

        vht = salm/8;
        vhe = salm/4;
        salb = ht * vht;
        reche = he * vhe;
        salrec = salb + reche;

        System.out.println("salário a receber: " + salrec);

        sc.close();
    }
}