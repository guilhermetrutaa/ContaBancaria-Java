import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


class ContaBancaria {
    private String nome;
    private double saldo;


    public ContaBancaria(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Déposito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.print("O valor do déposito tem que ser maior que 0!");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve sair maior do que 0");
            return false;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo Insuficiente. Saldo atual: R$ " + String.format("%.2f", this.saldo));
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Saldo: R$ " + String.format("%.2f", saldo);
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ContaBancaria> listaConta = new ArrayList<>();

        int opcao;

        do {
            System.out.println("---- Cnta Bancaria ----");
            System.out.println("1. Criar Conta");
            System.out.println("2. Verificar Saldo");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        criarConta(scanner, listaConta);
                        break; //
                    case 2:
                        listarContas(listaConta);
                        break; //
                    case 3:
                        depositarConta(scanner, listaConta);
                        break; //
                    case 4:
                        sacarConta(scanner, listaConta);
                        break; //
                    case 0:
                        System.out.println("Saindo do sistema. Até mais!");
                        break; //
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número para a opção!");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void criarConta(Scanner scanner, ArrayList<ContaBancaria> lista) {
        System.out.println("\n--- Criar Conta Bancária ---");
        System.out.print("Digite o nome da sua conta: ");
        String nome = scanner.nextLine();
        int saldo = 0;


        ContaBancaria novaConta = new ContaBancaria(nome, saldo);
        lista.add(novaConta);

        System.out.println("Conta Bancaria criada com Sucesso!\n" + "Nome: " + nome + " | " + "Saldo: R$ " + saldo);
    }

    public static void listarContas(ArrayList<ContaBancaria> lista) {
        System.out.println("\n---- Conta Bancaria ----");
        if (lista.isEmpty()) {
            System.out.println("Não tem nenhuma conta bancaria registrada no sistema!");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i));
            }
        }
    }

    public static  void depositarConta(Scanner scanner, ArrayList<ContaBancaria> lista) {
        listarContas(lista);
        if (lista.isEmpty()) {
            return;
        }

        System.out.print("Digite o número da conta que deseja depositar: ");
        try {
            int indiceConta = scanner.nextInt();
            scanner.nextLine();

            if (indiceConta > 0 && indiceConta <= lista.size()) {
                ContaBancaria contaSelecionada = lista.get(indiceConta - 1);

                System.out.print("Digite o valor que deseja depositar: R$ ");
                double valorDeposito = scanner.nextDouble();
                scanner.nextLine();

                contaSelecionada.depositar(valorDeposito);
                System.out.println("Novo saldo da conta " + contaSelecionada.getSaldo() + ": R$ " + String.format("%.2f", contaSelecionada.getSaldo()));
            } else {
                System.out.println("Número da conta inválido!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número para a conta e um valor para o depósito.");
            scanner.nextLine();
        }
    }

    public static void sacarConta(Scanner scanner, ArrayList<ContaBancaria> lista) {
        listarContas(lista);
        if (lista.isEmpty()) {
            return;
        }

        System.out.print("Digite o número da conta que deseja sacar: ");
        try {
            int indiceConta = scanner.nextInt();
            scanner.nextLine();

            if(indiceConta > 0 && indiceConta <= lista.size()) {
                ContaBancaria contaSelecionada = lista.get(indiceConta - 1);

                System.out.print("Digite o valor que deseja sacar: R$ ");
                double valorSaque = scanner.nextDouble();
                scanner.nextLine();

                contaSelecionada.sacar(valorSaque);
                System.out.println("Novo saldo da coonta " + contaSelecionada.getSaldo() + ": R$ " + String.format("%.2f", contaSelecionada.getSaldo()));
            } else {
                System.out.println("Número da conta inválido");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número para a conta e um valor para o saque");
            scanner.nextLine();
        }
    }
}