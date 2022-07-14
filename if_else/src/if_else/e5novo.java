package if_else;
import java.util.Scanner;

public class e5novo {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int sal, trab;
		double sn;

		System.out.println("1\r\n"
				+ "Escriturário\r\n"
				+ "2\r\n"
				+ "Secretário\r\n"
				+ "3\r\n"
				+ "Caixa\r\n"
				+ "4\r\n"
				+ "Gerente\r\n"
				+ "5\r\n"
				+ "Diretor\r\n"
				+ "\r\n"
				+ "");
		
		System.out.println("qual é o código de seu trabalho:");
		trab=sc.nextInt();
		System.out.println("qual é o seu salário atual:");
		sal=sc.nextInt();
		
		if (trab==1) {
		sn= (sal+(sal*0.5));	
			System.out.println("Escriturário, aumento de 50%, novo salário:"+sn);
		}
		else if (trab==2) {
			sn= (sal+(sal*0.35));	
				System.out.println("Secretário, aumento de 35%, novo salário:"+sn);
		}
		else if (trab==3) {
			sn= (sal+(sal*0.2));	
				System.out.println("Caixa, aumento de 20%, novo salário:"+sn);
		}
		else if (trab==4) {
			sn= (sal+(sal*0.1));	
				System.out.println("Gerente, aumento de 10%, novo salário:"+sn);
		}
		else if (trab==5) {	
				System.out.println("Diretor, sem aumento");
		}
		sc.close();
	}
}
