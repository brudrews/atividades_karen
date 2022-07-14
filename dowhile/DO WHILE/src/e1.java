import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i=2, resultado=0;
		
		System.out.println("Digite um número maior que 1:");
		int num = sc.nextInt();
		do{
			if(num==2) {
				resultado=0;
			}else {
				if(num%i==0) {
					resultado++;
				}
				i++;
			}
		}while(i<num);
		
		if(resultado==0) {
			System.out.println("numero eh primo");
		}else {
			System.out.println("numero não primo");
		}
				
		sc.close();
	}
}
