import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cod, p;
		double q, grama = 0, pp = 0, i, pi = 0, pt;
		
		System.out.println("código do produto comprado (entre 1 e 10): ");
		cod = sc.nextInt();
		
		System.out.println("Digite o peso do produto em quilos: ");
		q = sc.nextDouble();
		
		System.out.println("código do país de origem (entre 1 e 3): ");
		p = sc.nextInt();
		
		if (cod >=1 && cod <=4) {
			grama=q*1000;
			pp=grama*10;
		}
		else if (cod >=5 && cod <=7) {
			grama=q*1000;
			pp=grama*25;
		}
		else if (cod >=8 && cod <=10) {
			grama=q*1000;
			pp=grama*35;
		}
		
		switch (p) {
			case 2:
				i= pp*0.15;
				pi= i+pp;
				break;
			case 3:
				i= pp*0.25;
				pi= i+pp;
				break;
			default:
				System.out.println("não tem imposto");
				break;
		}
		System.out.println("o peso em grama do produto eh:" +grama);
		System.out.println("o valor total do produto eh:" +pp);
		System.out.println("o valor total do produto com imposto eh:" +pi);
		sc.close();
	}

}
