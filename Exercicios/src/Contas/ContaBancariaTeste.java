package Contas;

import java.util.Scanner;

public class ContaBancariaTeste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ContaBancaria[] contas = new ContaBancaria[4];
        ContaEspecial contaEspecial1 = new ContaEspecial("Luis", 111, 1000.0);
        ContaEspecial contaEspecial2 = new ContaEspecial("Henrique", 222, 500.0);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("João", 333, 15);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("Maria", 444, 20);

        contas[0] = contaEspecial1;
        contas[1] = contaEspecial2;
        contas[2] = contaPoupanca1;
        contas[3] = contaPoupanca2;

        System.out.println("Digite o valor do depósito para cada conta:\n");

        for (int i = 0; i < contas.length; i++) {
            double valor;

            System.out.print("Digite o valor do depósito: ");
            valor = input.nextDouble();
            System.out.println();

            contas[i].depositar(valor);

            System.out.println(contas[i].toString());
        }

        System.out.println("Digite o valor do saque para cada conta:\n");

        for (int i = 0; i < contas.length; i++) {
            double valor;

            System.out.print("Digite o valor do saque: ");
            valor = input.nextDouble();
            System.out.println();

            if (contas[i] instanceof ContaEspecial) {
                ContaEspecial aux = (ContaEspecial) contas[i];
                aux.sacar(valor);
            }
            else {
                contas[i].sacar(valor);
            }

            System.out.println(contas[i].toString());
        }

        System.out.println("Calculando o novo saldo para contas poupança:\n");

        for (int i = 0; i < contas.length; i++) {

            if (contas[i] instanceof ContaPoupanca) {
                ContaPoupanca aux = (ContaPoupanca) contas[i];
                aux.calcularNovoSaldo(0.10);
            }

            System.out.println(contas[i].toString());
        }
    }
}