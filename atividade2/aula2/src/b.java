import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite um numero: ");
        n1=sc.nextInt();

        System.out.println("Digite um numero: ");
        n2=sc.nextInt();

        System.out.println("Digite um numero: ");
        n3=sc.nextInt();

        System.out.println("multiplicação dos numeros: "+(n1*n2*n3));

        sc.close();
    }
}
