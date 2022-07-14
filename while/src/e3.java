import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int digitado=0, soma=0, quantDigitados =0, maior = 0, menor = 0, quantpares=0, somapares=0, impares=0;
		double mediaPares = 0, porcentImpares = 0; 

		while(digitado != 30000) {
			System.out.println("Digite um número:");
			digitado = sc.nextInt();
			
			if(digitado == 30000) {
				break;
			}
			quantDigitados++;
			soma += digitado;
			if(digitado > maior) {
				maior = digitado;
			}
			if(quantDigitados == 1) {
				menor = digitado;
			}
			if(digitado < menor) {
				menor = digitado;
			}
			
			//media dos pares
			
			if(digitado%2==0) {
				somapares+=digitado;
				quantpares++;
			}		
			
			mediaPares=somapares/quantpares;
			
			//porcentagem de impares
			impares=quantDigitados-quantpares;
			porcentImpares=impares*100/quantDigitados;
			
		}

		System.out.println("Quantidade de digitados: " + quantDigitados);
		System.out.println("Soma dos digitados: " + soma);
		System.out.println("maior de digitados: " + maior);
		System.out.println("menor de digitados: " + menor);
		System.out.println("média de digitados pares: " +mediaPares );
		System.out.println("porcentagem de digitados impares: " +porcentImpares);
		
		sc.close();
	}

}
