
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saltotal = 0, medpechom=0, medpecmul=0, salario, maiorsal = 0;
        int codigo, quantpec, codmaiorsal = 0, contHomem = 0, contMulher = 0, totalPecas = 0;
        String genero;

        System.out.print("Digite o salário mínimo: ");
        double salmin = sc.nextDouble();

        System.out.print("\n");
        
        for (int i = 1; i <= 3; i++){
            System.out.print("seu código: ");
            codigo = sc.nextInt();

            System.out.print("quantidade de peças que você fez: ");
            quantpec = sc.nextInt();

            System.out.print("seu gênero: ");
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

           
            System.out.print("\nCódigo: " + codigo);
            System.out.print("\nSalário: " + salario + "\n");
        }

        System.out.print("Total de salários: " + saltotal);
        System.out.print("\nTotal de peças produzidas: " + totalPecas);
        System.out.print("\nMédia de peças fabricadas por homens: " + (medpechom / contHomem));
        System.out.print("\nMédia de peças fabricada por mulheres: " + (medpecmul / contMulher));

        System.out.print("\n\nCódigo do operário com maior salário: " +codmaiorsal);
        
        sc.close();
    }
}