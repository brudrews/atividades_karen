import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int liv;
		double op1, op2;
		
		System.out.println("quantidade de livros que deseja comprar: ");
		liv = sc.nextInt();
		
		op1=(liv*0.25)+ 7.50;
		op2= (liv*0.50)+2.50;
		
	
		if (op1<op2) {
			System.out.println("melhor escolher a promoção 1: ");
		}
		else if (op1>op2){
			System.out.println("melhor escolher a promoção 2: ");
		}
		sc.close();
	}

}
