import java.util.Scanner;

public class k {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double hora, min, hm, tmin,ms;

        System.out.println("Digite uma hora: ");
        hora = sc.nextDouble();
        System.out.println("Digite os minutos: ");
        min = sc.nextDouble();

        hm=hora*60;
        System.out.println("a hora em minutos: "+hm);
        tmin= min+hm;
        System.out.println("total dos minutos: "+tmin);
        ms=tmin*60;
        System.out.println("total dos minutos em segundos: "+ms);

        sc.close();
    }
}