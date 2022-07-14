package matie;
import java.util.Scanner;

public class e6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        
        System.out.println("num 1: ");
        n1 = sc.nextInt();
        
        if(n1 % 2 == 0) {
        	System.out.println("numero par");
        }
        if(n1 % 2 != 0) {
        	System.out.println("numero impar");
        }
        	sc.close();
        }
}
