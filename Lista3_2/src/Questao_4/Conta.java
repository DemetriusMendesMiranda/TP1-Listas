package Questao_4;

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
