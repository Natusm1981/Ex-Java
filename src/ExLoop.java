import java.util.Locale;
import java.util.Scanner;

//Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)


public class ExLoop {
    
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        String nome;
        int idade;

        while(true){
            System.out.println("Digite seu nome: (0 para o loop)");
            nome = entrada.next();
            if(nome.equals("0"))
                break;
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();
            System.out.println("Olá " + nome + ", tudo bem? você tem " + idade + " anos!");
        }

        System.out.println("Fim do Loop");
        entrada.close();

    }
}
