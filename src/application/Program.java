package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Listar Contas");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("1 - Corrente | 2 - Poupança");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();

                    if (tipo == 1) {
                        sc.nextLine();
                        System.out.print("Senha: ");
                        String senha = sc.nextLine();
                        contas.add(new ContaCorrente(nome, saldo, senha));
                    } else {
                        contas.add(new ContaPoupanca (nome, saldo));
                    }
                    break;

                case 2:
                    for (Conta c : contas) {
                        c.exibirDados();
                    }
                    break;

                case 3:
                    System.out.print("Nome da conta: ");
                    String nomeDep = sc.nextLine();

                    for (Conta c : contas) {
                        if (c.getTitular().equals(nomeDep)) {
                            System.out.print("Valor: ");
                            double valor = sc.nextDouble();
                            c.depositar(valor);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Nome da conta: ");
                    String nomeSaque = sc.nextLine();

                    for (Conta c : contas) {
                        if (c.getTitular().equals(nomeSaque)) {
                            System.out.print("Valor: ");
                            double valor = sc.nextDouble();
                            c.sacar(valor);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Conta origem: ");
                    String origem = sc.nextLine();

                    System.out.print("Conta destino: ");
                    String destino = sc.nextLine();

                    Conta contaOrigem = null;
                    Conta contaDestino = null;

                    for (Conta c : contas) {
                        if (c.getTitular().equals(origem)) {
                            contaOrigem = c;
                        }
                        if (c.getTitular().equals(destino)) {
                            contaDestino = c;
                        }
                    }

                    if (contaOrigem != null && contaDestino != null) {
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        contaOrigem.transferir(contaDestino, valor);
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
	
}
