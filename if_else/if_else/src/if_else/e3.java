package if_else;
import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int d,d1,d2,d3;

		System.out.println("digite uma data (ddmm)");
		d=sc.nextInt();
		System.out.println("digite o ano dela");
		d1=sc.nextInt();
		System.out.println("digite uma data (ddmm)");
		d2=sc.nextInt();
		System.out.println("digite o ano dela");
		d3=sc.nextInt();
		
		if(d1<d3) {
			System.out.println("a primeira data é a maior");
		}
		else if(d3<d1) {
			System.out.println("a segunda data é a maior");
		}
		
		sc.close();
	}

}
