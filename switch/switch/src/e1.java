
import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c;
		double sal, novoSal = 0, reaj = 0;
		
		System.out.println("Digite o c�digo de seu cargo: "
				+ "\n1-Escritur�rio "
				+ "\n2-Secret�rio "
				+ "\n3-Caixa "
				+ "\n4-Gerente "
				+ "\n5-Diretor");
		c = sc.nextInt();
		
		System.out.println("Digite seu sal�rio atual: ");
		sal = sc.nextDouble();
		
		switch(c) {
		case 1:
			 reaj = sal*0.5;
			 novoSal = sal+reaj;
			 break;
		case 2:
			 reaj = sal*0.35;
			 novoSal = sal+reaj;
			 break;
		case 3:
			 reaj = sal*0.2;
			 novoSal = sal+reaj;
			 break;
		case 4:
			 reaj = sal*0.1;
			 novoSal = sal+reaj;
			 break;
		default:
			System.out.println("n�o tem aumento");
			break;
		}
		System.out.println("seu novo sal�rio eh:" +novoSal);
		System.out.println("o valor de seu aumento eh:" +reaj);
		
		sc.close();
	}

}
