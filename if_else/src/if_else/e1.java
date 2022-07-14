package if_else;
import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int resp,a,b,soma,c;
		double raiz;
		
		System.out.println("digite 1 se voce quer somar dois números ou 2 se voce quer descobrir a raiz quadrada de um numero:");
		resp=sc.nextInt();
		

		if (resp==1) {
			System.out.println("digite um numero:");
			a=sc.nextInt();
			System.out.println("digite um numero:");
			b=sc.nextInt();
			soma=a+b;
			System.out.println("o resultado eh:"+soma);
		}	
		else {
			System.out.println("digite um numero:");
			c=sc.nextInt();
			raiz = Math.sqrt(c);
			System.out.println("a raiz eh:"+raiz);
		}
		sc.close();
}
}
