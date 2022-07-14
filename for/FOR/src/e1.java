import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabuada, num;
		
		System.out.println("Digite um número:");
		num = sc.nextInt();
		
		for(int i = 0; i<10; i++) {

				System.out.println(tabuada= num * (i+1));
		}
		
		sc.close();
		
	}
	
}
