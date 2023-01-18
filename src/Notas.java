//Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int nota;

        while(true){
            System.out.println("Digite uma nota entre 0 e 10");
            nota = entrada.nextInt();
            if(nota < 0 || nota > 10){
                System.out.println("Valor incorreto, digite um valor entre 0 e 10.");
            }
            else 
                break;
        }
        entrada.close();
        System.out.println("Você digitou a nota " + nota);


    }
}
