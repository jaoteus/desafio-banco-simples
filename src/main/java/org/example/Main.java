package org.example;

public class Main {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static double saldoContaCorrente =  0.0;
    public static double valor;
    private static final String numeroConta = "1234-5";
    private static String cpf;
    private static String nome;
    public static String idade;
    private static String email;
    private static String numero;
    public static String opcao;
    public static boolean loopCriarConta = true;

    public static void main(String[] args) {
        while (loopCriarConta) {
            System.out.print("Digite seu nome: ");
            nome = scanner.next();
            System.out.print("Digite seu email: ");
            email = scanner.next();
            System.out.print("Digite seu numero: ");
            numero = scanner.next();
            System.out.print("Digite seu cpf: ");
            cpf = scanner.next();
            loopCriarConta = false;
        }

        while (true) {
            System.out.println("1 - ver conta");
            System.out.println("2 - depositar");
            System.out.println("3 - sacar");
            opcao = scanner.next();
            if (opcao.equals("1")){
                mostrarDados();
            } else if (opcao.equals("2")){
                System.out.print("Digite o valor que deseja depositar: ");
                valor = scanner.nextDouble();
                depositar(valor);
                System.out.println("Valor de" + valor + " depositado com sucesso!");
            }

        }
    }

    public static void depositar(double valorParaDepositar){
        saldoContaCorrente = saldoContaCorrente + valorParaDepositar;
    }

    public static boolean daParaSacar(){
        return false;
    }

    public static void sacar(){

    }

    public static void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Numero: " + numero);
        System.out.println("cpf: " + cpf);
        System.out.println("Saldo: " + saldoContaCorrente);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("idade: " + idade);
    }
}