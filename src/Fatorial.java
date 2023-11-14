import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        //Solicitar um numero para o usuario e calcular o fatorial
        //4! = 4 * 3 * 2 * 1
        //5! = 5 * 4 * 3 * 2 * 1
        Scanner leitor = new Scanner(System.in);
        int numero, fat = 1;
        System.out.println("Digite um valor para calcular o fatorial: ");
        numero = leitor.nextInt();
        System.out.print(numero + "! = ");
        for(int i = numero; i > 1;  i--){
            //calculo do fatorial
            fat =  fat * i;
        }
        /*
        * i   |   fat
        * 4   |    4
        * 3   |    12
        * 2   |    24
        * 1   |    24
        * 0
        * */

        System.out.println(fat);

        //Efetuar a leitura de uma nota até que uma nota válida seja digitada.
        double nota, nota2, media;
        do {
            System.out.println("Digite uma nota");
            nota = leitor.nextDouble();
        }while(nota < 0 || nota > 10); //enquanto cond for verdadeira

        do{
            System.out.println("Digite segunda nota");
            nota2 = leitor.nextDouble();
        }while(nota2 < 0 || nota2 > 10);

        media = (nota + nota2)/2;
        System.out.println("Media = " + media);


    }
}
