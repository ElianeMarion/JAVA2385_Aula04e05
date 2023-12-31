import java.util.Scanner;

public class Exercicio1Lista {
    public static void main(String[] args) {
        /*Escrever um programa que leia um número não determinado de valores e calcule
         a média aritmética dos valores lidos, a quantidade de valores positivos, a
         quantidade de valores negativos e o percentual de valores negativos e positivos.
         Mostre os resultados.
        * */

        //while (laço pré condicional) do...while (laço pós condicional) for (laço contado)

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        int numero, qtdPositivos = 0 , qtdNegativos = 0;
        double percNegativos, percPositivos, soma = 0, media;
        String continuar;
        do{
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();
            //soma para calcular média aritmética
            soma += numero;
            //Quantidade de números positivos e negativos
            if(numero >= 0)
                qtdPositivos++;
            else
                qtdNegativos++;
            System.out.println("Deseja digitar outro número: ");
            continuar = leitorTexto.nextLine();
        }while (continuar.equalsIgnoreCase("s"));
        //Media e os percentuais fora do laço
        media = soma / (qtdNegativos + qtdPositivos);
        System.out.println("A média é: " + media);
        System.out.println("\nA quantidade de números positivos digitados foi: " + qtdPositivos
                        + "\nA quantidade de números negativos digitados foi: " + qtdNegativos);

        //percentual de valores negativos e positivos
        percPositivos = (qtdPositivos * 100) / (qtdPositivos + qtdNegativos);
        percNegativos = (qtdNegativos * 100) / (qtdPositivos + qtdNegativos);
        System.out.println("\nPercentual de números positivos digitados foi: " + percPositivos
                           +"\nPercentual de números positivos digitados foi: " + percNegativos);
    }
}
