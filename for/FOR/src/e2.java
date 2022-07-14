import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, peso = 0, altura = 0, pesomaior=0, quantalt=0, quantjog=0, jogmenor = 0, medidade=0, somaidade=0, somaalt=0, medalt=0;
		double porc;
		
		for(int i = 0; i<11; i++) {
			
			System.out.println("Digite sua idade:");
			idade = sc.nextInt();
			System.out.println("Digite seu peso:");
			peso = sc.nextInt();
			System.out.println("Digite sua altura:");
			altura = sc.nextInt();
			
			if(idade<18) {
			jogmenor++;
			}
			if(peso>=80) {
				pesomaior++;
			}
			
		
		quantjog++;
		somaalt+=altura;
		porc=pesomaior*100/quantjog;
		somaidade += idade;
		medidade= somaidade/quantjog;
		medalt= somaalt/quantjog;
		
		System.out.println("quantidade de jogadores menores de 18:"+jogmenor);
		System.out.println("média das idades:"+medidade);
		System.out.println("média das alturas:"+medalt);
		System.out.println("porcentagem de jogadores com mais de 80kg:"+medalt);
		
		if(peso>=80) {
			pesomaior++;
		}
		
		porc=pesomaior*100/quantjog;
	}
		sc.close();
		
	}
	
}