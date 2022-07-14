package if_else;
import java.util.Scanner;

public class e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hi, hf,mi,mf,ht,mt;
		
		System.out.println("hora de inicio do jogo:");
		hi=sc.nextInt();
		System.out.println("minuto de inicio do jogo:");
		mi=sc.nextInt();
		System.out.println("hora de fim do jogo:");
		hf=sc.nextInt();
		System.out.println("minuto de fim do jogo:");
		mf=sc.nextInt();
		
		ht=(hf-hi);
		mt=(mi-mf);
		
		System.out.println("Duração do jogo em horas:"+ht);
		System.out.println("Duração do jogo em minutos:"+mt);
		sc.close();
	}

}
