import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a=1;
		
		while(a>0) {
			System.out.println("digite um numero:");
			a = sc.nextInt();
			
		if (a<=0) {
			break;
		}
		System.out.println("valor:"+a+"\nseu quadrado:"+Math.pow(a,2)+"\na sua raiz quadrada:"+(Math.sqrt(a))+"\nseu cubo:"+(Math.cbrt(a)));
		}
		
		sc.close();
	}
}
