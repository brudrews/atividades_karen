
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saltotal = 0, medpechom=0, medpecmul=0, salario, maiorsal = 0;
        int codigo, quantpec, codmaiorsal = 0, contHomem = 0, contMulher = 0, totalPecas = 0;
        String genero;

        System.out.print("Digite o sal�rio m�nimo: ");
        double salmin = sc.nextDouble();

        System.out.print("\n");
        
        for (int i = 1; i <= 3; i++){
            System.out.print("seu c�digo: ");
            codigo = sc.nextInt();

            System.out.print("quantidade de pe�as que voc� fez: ");
            quantpec = sc.nextInt();

            System.out.print("seu g�nero: ");
            genero = sc.next();

            if(quantpec <= 30){
                salario = salmin;
            } else if(quantpec <= 50){
                salario = salmin + ((salmin * 0.03) * (quantpec-30));
            } else {
                salario = salmin + ((salmin * 0.05) * (quantpec-30));
            }

            if(i == 1){
                maiorsal = salario;
                codmaiorsal = codigo;
            } else {
                if(salario > maiorsal){
                    maiorsal = salario;
                    codmaiorsal = codigo;
                }
            }

            if(genero.equals("homem")){
                contHomem++;
                medpechom += quantpec;
            } else {
                contMulher++;
                medpecmul += quantpec;
            }

            saltotal += salario;
            totalPecas += quantpec;

           
            System.out.print("\nC�digo: " + codigo);
            System.out.print("\nSal�rio: " + salario + "\n");
        }

        System.out.print("Total de sal�rios: " + saltotal);
        System.out.print("\nTotal de pe�as produzidas: " + totalPecas);
        System.out.print("\nM�dia de pe�as fabricadas por homens: " + (medpechom / contHomem));
        System.out.print("\nM�dia de pe�as fabricada por mulheres: " + (medpecmul / contMulher));

        System.out.print("\n\nC�digo do oper�rio com maior sal�rio: " +codmaiorsal);
        
        sc.close();
    }
}