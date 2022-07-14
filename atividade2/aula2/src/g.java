import java.util.Scanner;

public class g {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();

        for(int i = 0; i<=10; i++){
            System.out.println(num*i);
        }

        System.out.println(" ");

        sc.close();
    }
}
