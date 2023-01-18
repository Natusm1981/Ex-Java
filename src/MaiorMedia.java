import java.util.Locale;
import java.util.Scanner;
//Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
public class MaiorMedia {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int [] numeros = new int[5];
        int maiorNumero = 0;
        float media = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite a nota " + (i+1)+": ");
            numeros[i] = entrada.nextInt();
            if(i==0)
                maiorNumero = numeros[0];
            if(numeros[i]>maiorNumero)
                maiorNumero = numeros[i];
            media += numeros[i];
        }
        entrada.close();
        System.out.println("Maior numero é: "+ maiorNumero);
        System.out.println("A média dos números é: " + (media / numeros.length));


    }
}