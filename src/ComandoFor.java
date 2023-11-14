import java.util.Scanner;

public class ComandoFor {
    public static void main(String[] args) {
        System.out.println("Aula 04 - Laços");
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        double altura, media, somaAlturas = 0;
        int qtdAlunos;

            media = 0;
             //Inicialização da variável de teste
            System.out.println("Por favor digite a quantidade de alunos da turma: ");
            int numeroAlunosTurma = leitor.nextInt();
            //Solicitar a altura dos alunos de uma turma e tirar a média de altura da sala
            for(qtdAlunos = 1; qtdAlunos <= numeroAlunosTurma; qtdAlunos++) { //Verificar qual a condição de repetição
                System.out.println("Digite a altura do " + qtdAlunos + "º aluno");
                altura = leitor.nextDouble();
                somaAlturas = somaAlturas + altura;
                //incremento ou alteração da variável de controle ++ => incrementa 1
                //x += 2 ou x = x + 2;  i-- => i = i -1 => i-= 1
            }
            media = somaAlturas/numeroAlunosTurma;
            System.out.println("A media de altura dos alunos é de " + media);



    }
}
