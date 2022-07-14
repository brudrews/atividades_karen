import java.util.Scanner;

public class c {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n1, n2;

    System.out.println("Digite um número que não seja 0: ");
    n1 = sc.nextInt();

    System.out.println("Digite um número: ");
    n2 = sc.nextInt();

    System.out.println("divisão do 1° pelo 2°: " + (n1 / n2));

    sc.close();
}
}