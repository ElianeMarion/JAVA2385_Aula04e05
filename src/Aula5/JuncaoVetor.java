package Aula5;

import java.util.Scanner;

public class JuncaoVetor {
    public static void main(String[] args) {
        /*Efetuar a leitura de dois vetores com 6 posições cada.
        * Criar um 3º vetor que será a junção dos dois anteriores*/

        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[6];
        int[] vetorB = new int[6];
        int[] vetorC = new int[12];
        int i;
        System.out.println("==== Prenchendo o Vetor A ====");
        for(i=0; i<6; i++){
            System.out.println("Digite o " + (i+1) + " número: ");
            vetorA[i] = leitor.nextInt();
        }
        System.out.println("==== Prenchendo o Vetor B ====");
        for(i=0; i<6; i++){
            System.out.println("Digite o " + (i+1) + " número: ");
            vetorB[i] = leitor.nextInt();
        }
        for(i=0; i<6; i++){
            vetorC[i] = vetorA[i]; //vetorC[1] = vetorA[1]
            vetorC[i+6] = vetorB[i]; //vetorC[1+6] = vetorB[1]
        }
        System.out.println("==== Exibindo o vetor C ====");
        for(i=0; i<12; i++)
            System.out.println(vetorC[i]);

        //Exibir todos os elementos de índice par do vetorC
        System.out.println("==== Exibindo os elementos de índice par do vetor C ====");
        for(i=0; i<12; i+=2){
            System.out.print("vetorC["+ i +"]" + vetorC[i] + " ");
        }
        for(i=0; i<12; i++){
            if(vetorC[i] %2 == 0)
                System.out.print("vetorC["+ i +"] = " + vetorC[i] + " ");
        }
    }
}
