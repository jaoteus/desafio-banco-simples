package org.example;

public class Main {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static double saldoContaCorrente = 0.0;
    public static double valor;
    private static final String numeroConta = "1234-5";
    private static String cpf;
    private static String nome;
    public static String idade;
    private static String email;
    private static String numero;
    public static String opcao;
    public static boolean loopCriarConta = true;
    public static boolean daParaSacar;

    public static void main(String[] args) {
        while (loopCriarConta) {
            System.out.print("Digite seu nome: ");
            nome = scanner.next();
            System.out.print("Digite seu email: ");
            email = scanner.next();
            System.out.print("Digite seu número: ");
            numero = scanner.next();
            System.out.print("Digite seu cpf: ");
            cpf = scanner.next();
            System.out.print("Digite sua idade: ");
            idade = scanner.next();
            loopCriarConta = false;
        }

        while (true) {
            System.out.println("1 - ver conta");
            System.out.println("2 - depositar");
            System.out.println("3 - sacar");
            System.out.println("s - sair");
            opcao = scanner.next();
            if (opcao.equals("1")) {
                mostrarDados();
            } else if (opcao.equals("2")) {
                System.out.print("Digite o valor que deseja depositar: ");
                valor = scanner.nextDouble();
                depositar(valor);
                System.out.println("Valor de " + valor + " depositado com sucesso!");
                valor = 0.0;
            } else if (opcao.equals("3")) {
                System.out.print("Digite o valor que deseja sacar: ");
                valor = scanner.nextDouble();
                daParaSacar(valor);
                if (daParaSacar) {
                    sacar(valor);
                } else {
                    System.out.println("Este valor não pode ser sacado!");
                }
            } else if (opcao.equals("4")) {
                System.out.println("Até mais, " + nome + "!");
                System.out.println("saindo...");
                break;
            }
        }
    }

    public static void depositar(double valorParaDepositar) {
        saldoContaCorrente = saldoContaCorrente + valorParaDepositar;
    }

    public static void daParaSacar(double valor) {
        if ((saldoContaCorrente = saldoContaCorrente - valor) < 0.0) {
            daParaSacar = false;
        } else {
            daParaSacar = true;
        }
    }

    public static void sacar(double valor) {
        saldoContaCorrente = saldoContaCorrente - valor;
    }

    public static void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Número: " + numero);
        System.out.println("cpf: " + cpf);
        System.out.println("Saldo: " + saldoContaCorrente + "R$");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("idade: " + idade);
    }
}