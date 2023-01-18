import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite um numero para calcular seu fatorial: ");
        int numero = entrada.nextInt();
        int resultado = numero;
        for(int i = numero; i > 1; i--){
            resultado = resultado * (i-1);
        }
        entrada.close();
        System.out.println("O fatorial de " + numero + " é:" + resultado);

    }
}

