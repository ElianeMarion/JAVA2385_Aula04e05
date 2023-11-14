import java.util.Scanner;

public class ComandoDoWhile {
    public static void main(String[] args) {
        System.out.println("Aula 04 - Laços");
        Scanner leitor = new Scanner(System.in);

        double altura, media, somaAlturas = 0;
        int qtdAlunos = 1; //Inicialização da variável de teste

        //Solicitar a altura dos alunos de uma turma e tirar a média de altura da sala
        do { //Verificar qual a condição de repetição
            System.out.println("Digite a altura do " + qtdAlunos + "º aluno");
            altura = leitor.nextDouble();
            somaAlturas = somaAlturas + altura;
            qtdAlunos++; //incremento ou alteração da variável de controle
        }while(qtdAlunos <= 6);

        media = somaAlturas/6;
        System.out.println("A media de altura dos alunos é de " + media);
    }
}
