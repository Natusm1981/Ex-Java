import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número para ver sua tabuada de 1 a 10: ");
        int numero = entrada.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        entrada.close();

    }
}
