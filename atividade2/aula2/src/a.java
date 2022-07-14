import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite um numero: ");
        n1=sc.nextInt();

        System.out.println("Digite um numero: ");
        n2=sc.nextInt();

        System.out.println("subtração do 1° pelo 2°: "+(n1-n2));

        sc.close();
    }
}

