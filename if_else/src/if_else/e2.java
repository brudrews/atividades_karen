package if_else;
import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int d,m,a,h,min;
		String me = null;
		
		System.out.println("digite a data:");
		d=sc.nextInt();
		System.out.println("digite o mes em números:");
		m=sc.nextInt();
		System.out.println("digite o ano:");
		a=sc.nextInt();
		System.out.println("digite a hora:");
		h=sc.nextInt();
		System.out.println("digite o minuto:");
		min=sc.nextInt();
		
		if(m==1) {
			me="janeiro";
		}
		else if (m==2) {
			me="fevereiro";
		}
		else if(m==3) {
			me="março";
		}
		else if(m==4) {
			me="abril";
		}
		else if(m==5) {
			me="maio";
		}
		else if(m==6) {
			me="junho";
		}
		else if(m==7) {
			me="julho";
		}
		else if(m==8) {
			me="agosto";
		}
		else if(m==9) {
			me="setembro";
		}
		else if(m==10) {
			me="outubro";
		}
		else if(m==11) {
			me="novembro";
		}
		else if(m==12) {
			me="dezembro";
		}
	
		
		System.out.println(d+ "/" +me+ "/" +a+ " e " +h+":"+min);
	
		sc.close();
	}

}

