package matie;
import java.util.Scanner;

public class um {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, medponderada;

        System.out.println("nota trabalho: ");
        n1 = sc.nextDouble();
        System.out.println("nota avaliação: ");
        n2 = sc.nextDouble();
        System.out.println("nota exame final: ");
        n3 = sc.nextDouble();

        medponderada = ((2*n1)+(3*n2)+(5*n3))/10;
        System.out.println("media ponderada: "+medponderada);

        if (medponderada >= 8){
            System.out.println("conceito A");
        }
        if (medponderada >=7 && medponderada<8){
            System.out.println("conceito B");
        }
         if (medponderada >=6 && medponderada<7){
            System.out.println("conceito C");
        }
        if (medponderada >=5 && medponderada<6){
            System.out.println("conceito D");
        }
         if (medponderada >=0 && medponderada<5){
            System.out.println("conceito E");
        }

    }
}
