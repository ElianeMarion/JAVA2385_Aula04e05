import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Aula 04 - Laços");
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        double altura, media, somaAlturas = 0;
        int qtdAlunos;
        String continuar = "S";
        while (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Sim"))
        {
            media = 0;
            qtdAlunos = 1; //Inicialização da variável de teste
            System.out.println("Por favor digite a quantidade de alunos da turma: ");
            int numeroAlunosTurma = leitor.nextInt();
            //Solicitar a altura dos alunos de uma turma e tirar a média de altura da sala
            while(qtdAlunos <= numeroAlunosTurma) { //Verificar qual a condição de repetição
                System.out.println("Digite a altura do " + qtdAlunos + "º aluno");
                altura = leitor.nextDouble();
                somaAlturas = somaAlturas + altura;
                qtdAlunos++; //incremento ou alteração da variável de controle
            }
            media = somaAlturas/numeroAlunosTurma;
            System.out.println("A media de altura dos alunos é de " + media);

            System.out.println("Deseja cadastrar a média de altura dos alunos de outra turma?");
            continuar = leitorTexto.nextLine();
        }


   /*     System.out.println("Digite a altura do 2º aluno");
        altura = leitor.nextDouble();
        somaAlturas = somaAlturas + altura;

        System.out.println("Digite a altura do 3º aluno");
        altura = leitor.nextDouble();
        somaAlturas = somaAlturas + altura;

        System.out.println("Digite a altura do 4º aluno");
        altura = leitor.nextDouble();
        somaAlturas = somaAlturas + altura;

        System.out.println("Digite a altura do 5º aluno");
        altura = leitor.nextDouble();
        somaAlturas = somaAlturas + altura;

        System.out.println("Digite a altura do 6º aluno");
        altura = leitor.nextDouble();
        somaAlturas = somaAlturas + altura;*/



    }
}