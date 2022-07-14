import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod, vei, acid, contcid = 0, maior=0,menor=0, codmaior = 0, codmenor=0;
		int medvei, numacid=0, medacid=0, menos2=0, somavei=0;
		do {
			System.out.println("código da cidade:");
			cod = sc.nextInt();
			System.out.println("número de veículos de passeio:");
			vei = sc.nextInt();
			System.out.println("número de acidentes de trânsito com vítimas:");
			acid = sc.nextInt();
			
			if(acid>maior) {
				codmaior=cod;
				maior=acid;
			}
			if(acid<menor) {
				codmenor=cod;
				menor=acid;
			}
			
			somavei+= vei;
			medvei=somavei/5;
			
			if(vei<2000) {
				numacid= numacid+acid;
				menos2++;
			}
			
			contcid++;
		}while(contcid<=4);
		
		if(menos2!=0) {
			medacid=numacid/menos2;
		}
		System.out.println("Maior índice de acidentes:"+maior+"pertence a cidade de código:"+codmaior);
		System.out.println("Menor índice de acidentes:"+menor+"pertence a cidade de código:"+codmenor);
		System.out.println("Média de veículos nas cinco cidades juntas:"+medvei);
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos"+medacid);
}
}