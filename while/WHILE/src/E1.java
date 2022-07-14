import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int contMes = 0;
	double salc, salj;
	
	System.out.println("Digite seu salário: ");
	salc = sc.nextDouble();
	
	salj=salc/3;
	
	while(salj<salc) {
		salc=salc+(salc*0.02);
		salj=salj+(salj*0.05);
		
		contMes++;
	}
	System.out.println("a quantidade de meses necessária eh: "+contMes);
	
sc.close();
}
}