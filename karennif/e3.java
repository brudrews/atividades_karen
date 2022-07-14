package matie;
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.println("num 1: ");
        n1 = sc.nextDouble();
        System.out.println("num 2: ");
        n2 = sc.nextDouble();

        if(n1<n2){
            System.out.println("o maior numero eh: " +n2);
        }
        if(n1>n2){
            System.out.println("o maior numero eh: " +n1);
        }
    }
}
