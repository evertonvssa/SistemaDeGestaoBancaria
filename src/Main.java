import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n SISTEMA DE GESTÃO BANCÁRIA");
            System.out.println("1 - Cadastrar Conta Corrente");
            System.out.println("2 - Cadastrar Conta Poupança");
            System.out.println("3 - Cadastrar Conta Investimento");
            System.out.println("0 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao != 0) {
                System.out.print("Digite o número da conta: ");
                String numero = scanner.nextLine();
                System.out.print("Digite o nome do titular: ");
                String titular = scanner.nextLine();
                System.out.print("Digite o saldo inicial: R$ ");
                double saldo = scanner.nextDouble();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o limite do cheque especial: R$ ");
                        double limite = scanner.nextDouble();
                        scanner.nextLine();
                        ContaCorrente cc = new ContaCorrente(numero, titular, saldo, limite);
                        System.out.println("\n--- Dados da Conta Corrente Cadastrada ---");
                        cc.mostrarDados(true);
                        break;

                    case 2:
                        System.out.print("Digite a taxa de rendimento mensal (%): ");
                        double taxaRendimento = scanner.nextDouble();
                        scanner.nextLine();
                        ContaPoupanca cp = new ContaPoupanca(numero, titular, saldo, taxaRendimento);
                        System.out.println("\n--- Dados da Conta Poupança Cadastrada ---");
                        cp.mostrarDados(true);
                        break;

                    case 3:
                        System.out.print("Digite a taxa de administração (%): ");
                        double taxaAdm = scanner.nextDouble();
                        scanner.nextLine();
                        ContaInvestimento ci = new ContaInvestimento(numero, titular, saldo, taxaAdm);
                        System.out.println("\n--- Dados da Conta Investimento Cadastrada ---");
                        ci.mostrarDados(true);
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            }

        } while (opcao != 0);

        System.out.println("\nSistema encerrado.");
        scanner.close();
    }
}