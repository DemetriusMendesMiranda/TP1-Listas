package Questao_4;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numconta1 = ler.nextInt();
        int senhaconta1 = ler.nextInt();
        String nome1 = ler.next();
        double saldoini1 = ler.nextDouble();

        int numconta2 = ler.nextInt();
        int senhaconta2 = ler.nextInt();
        String nome2 = ler.next();
        double saldoini2 = ler.nextDouble();

        Conta conta1 = new Conta(numconta1, senhaconta1, nome1, saldoini1);
        Conta conta2 = new Conta(numconta2, senhaconta2, nome2, saldoini2);

        int opcao = 0;
        while (opcao != 5) {
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    int senhabotada = ler.nextInt();
                    if (senhabotada == conta1.getSenha()) {
                        System.out.println(conta1.getSaldo()+"0");
                    } else {
                        System.out.println("senha incorreta");
                    }
                    break;
                case 2:
                    double valorsaque = ler.nextDouble();
                    int senhabotada2 = ler.nextInt();
                    if (conta1.saque(valorsaque, senhabotada2)) {
                        System.out.println("saque realizado");
                    } else {
                        System.out.println("saque não realizado");
                    }
                    break;
                case 3:
                    double valordeposito = ler.nextDouble();
                    int senhabotada3 = ler.nextInt();
                    if (conta1.deposito(valordeposito, senhabotada3)) {
                        System.out.println("depósito realizado");
                    } else {
                        System.out.println("depósito não realizado");
                    }
                    break;
                case 4:
                    String nomebotado = ler.next();
                    if (nomebotado.equals(conta2.getNomeCliente())) {
                        double valortransferencia = ler.nextDouble();
                        int senhabotada4 = ler.nextInt();
                        if (conta1.tranferencia(valortransferencia, senhabotada4, conta2)) {
                            System.out.println("transferência realizada");
                        } else {
                            System.out.println("transferência não realizada");
                        }
                    } else {
                        System.out.println("nenhum usuário encontrado");
                    }
                    break;
            }
        }
    }

}

class Conta {

    private int numeroConta, senha;
    private double saldo;
    private String nomeCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numeroConta, int senha, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public boolean saque(double valorsaque, int senhabot) {
        if (valorsaque > 0 && valorsaque < saldo && senhabot == senha) {
            saldo = saldo - valorsaque;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposito(double valordeposito, int senhabot) {
        if (valordeposito > 0 && senhabot == senha) {
            saldo = saldo + valordeposito;
            return true;
        } else {
            return false;
        }
    }

    public boolean tranferencia(double valortransferencia, int senhabot, Conta conta2) {
        if (valortransferencia > 0 && valortransferencia < saldo && senhabot == senha) {
            saldo = saldo - valortransferencia;
            conta2.saldo+= valortransferencia;
            return true;
        } else {
            return false;
        }
    }
}

