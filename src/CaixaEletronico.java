import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        //1 - Abertura de uma conta: nome do cliente, saldo inicial
        //2 - Exibir saldo => mostrar o saldo
        //3 - Depositar => solicitar um valor e alterar o saldo (+)
        //4 - Sacar => solicitar um valor e alterar o saldo (-) se houver saldo
        //5 - Sair

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        int opcao;
        String nome;
        double saldo = 0, valor;
        do{
            System.out.println("\n ========== CAIXA ELETRÔNICO =========\n");
            System.out.println("Opções:" +
                    "\n1 - Abertura de conta" +
                    "\n2 - Saldo" +
                    "\n3 - Depósito" +
                    "\n4 - Saque" +
                    "\n5 - Sair");
            System.out.println("Digite o opção desejada: ");
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("\nAbertura de conta\n");
                    System.out.println("Informe o nome do cliente: ");
                    nome = leitorTexto.nextLine();
                    System.out.println("Informe o saldo inicial depositado pelo cliente: ");
                    saldo = leitor.nextDouble();
                    break;
                case 2:
                    System.out.println("\nSaldo\n");
                    System.out.println("Saldo atual = " + saldo);
                    break;
                case 3:
                    System.out.println("\nDepósito\n");
                    System.out.println("Informe o valor a ser depositado: ");
                    valor = leitor.nextDouble();
                    saldo += valor; //saldo = saldo + valor
                    break;
                case 4:
                    System.out.println("\nSaque\n");
                    System.out.println("Informe o valor a ser sacado: ");
                    valor = leitor.nextDouble();
                    if(saldo >= valor)
                        saldo -= valor; //saldo = saldo + valor
                    else
                        System.out.println("Saldo insuficiente");
                    break;
                case 5:
                    System.out.println("\nObrigada por utilizar nosso sistema!\n");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 5); //opcao > 1 && opcao <5

    }
}
