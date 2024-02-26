package org.example;

public class Main {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static double saldoContaCorrente;
    public static double valor;
    private static final String numeroConta = "1234-5";
    private static String cpf;
    private static String nome;
    private static String email;
    private static String numero;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Digite seu nome: ");
            nome = scanner.next();
            System.out.println("Digite seu email: ");
            email = scanner.next();
            System.out.println("Digite seu numero: ");
            numero = scanner.next();
            System.out.println("Digite seu cpf: ");
            cpf = scanner.next();
        }
    }

    public static void depositar(){

    }

    public static void sacar(){

    }

    public static void mostrarDados(){

    }
}