package Aula5;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media = 0, soma = 0;

        System.out.println("Por favor informe a quantidade de alunos: ");
        int qtdAlunos = leitor.nextInt();

        double[] vetorNota = new double[qtdAlunos];
        String[] nomeAlunos = {"Ana","Guilheme", "Thiago"};
        vetorNota[0] = 5.5;
        vetorNota[2] = 7.0;

        for(int i = 0; i < vetorNota.length; i++)
        {
            System.out.println("Digite a nota do " + (i+1) +"º aluno: ");
            vetorNota[i] = leitor.nextDouble();
        }
        //soma = vetorNota[0]+ vetorNota[1]+vetorNota[2];
        for(int i = 0; i < vetorNota.length; i++){
            soma += vetorNota[i];
        }
        System.out.println("Soma das notas: " + soma);
        media = soma / vetorNota.length;

        for (int i = 0; i < vetorNota.length; i++ )
            System.out.println("Nota do aluno " + (i+1) + ": " + vetorNota[i]);
        System.out.println("\nA média da sala é: " + media);


        for (int i = 0; i < vetorNota.length; i++ )
            System.out.println("Nota do(a) " + nomeAlunos[i] + ": " + vetorNota[i]);
    }


}
