
package Questao_2;

import java.util.Scanner;

public class ClassePrincipal {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome = ler.next();
        String endereco = ler.next();
        String mes = ler.next();
        
        Chefe chefe1 = new Chefe(ler.next(),ler.next(), ler.nextFloat(), ler.next());
        
        Vendedor vendedor1 = new Vendedor(ler.next(), ler.next(), ler.nextFloat(), ler.nextFloat(), ler.nextInt());
        
        vendedor1.setSalario(vendedor1.getSalario()+(vendedor1.getComissaovenda()*vendedor1.getQntvendas()));
        
        Operario operario1 = new Operario(ler.next(),ler.next(), ler.nextFloat(), ler.nextFloat(), ler.nextInt());
        
        operario1.setSalario(operario1.getQntproduzida()*operario1.getValorproducao());
        
        Horista horista1 = new Horista(ler.next(), ler.next(), ler.nextFloat(), ler.nextFloat(), ler.nextInt());
        
        horista1.setSalario(horista1.getTotalhoras()*horista1.getValorhora());
        
        Funcionario[] funcionarios = {chefe1, vendedor1, operario1, horista1};
        
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        
        folhaPagamento.mostrarPagamentos(nome, endereco, mes, funcionarios);
    }
    
}

class Funcionario {

    private String nome;
    private String datanasci;
    private float salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String datanasci, float salario) {
        this.nome = nome;
        this.datanasci = datanasci;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasci() {
        return datanasci;
    }

    public void setDatanasci(String datanasci) {
        this.datanasci = datanasci;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + datanasci + "\nSalário: R$" + salario;
    }

}

class Chefe extends Funcionario {

    private String departamento;

    public Chefe() {

    }

    public Chefe(String nome, String datanasci, float salario, String departamento) {
        super(nome, datanasci, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento + "\nCargo: chefe";
    }

}

class Horista extends Funcionario {

    private float valorhora;
    private int totalhoras;

    public Horista() {

    }

    public Horista(String nome, String datanasci, float salario, float valorhora, int totalhoras) {
        super(nome, datanasci, salario);
        this.valorhora = valorhora;
        this.totalhoras = totalhoras;
    }

    public float getValorhora() {
        return valorhora;
    }

    public void setValorhora(float valorhora) {
        this.valorhora = valorhora;
    }

    public int getTotalhoras() {
        return totalhoras;
    }

    public void setTotalhoras(int totalhoras) {
        this.totalhoras = totalhoras;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: horista \nValor por Hora: R$" + valorhora + "\nTotal de horas: " + totalhoras;
    }

}

class Operario extends Funcionario {

    private float valorproducao;
    private int qntproduzida;

    public Operario() {

    }

    public Operario(String nome, String datanasci, float salario, float valorproducao, int qntproduzida) {
        super(nome, datanasci, salario);
        this.valorproducao = valorproducao;
        this.qntproduzida = qntproduzida;
    }

    public float getValorproducao() {
        return valorproducao;
    }

    public void setValorproducao(float valorproducao) {
        this.valorproducao = valorproducao;
    }

    public int getQntproduzida() {
        return qntproduzida;
    }

    public void setQntproduzida(int qntproduzida) {
        this.qntproduzida = qntproduzida;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Operário \nValor por Produção: R$" + valorproducao + "\nQuantidade produzida: " + qntproduzida;
    }

}

class Vendedor extends Funcionario {

    private float comissaovenda;
    private int qntvendas;

    public Vendedor() {

    }

    public Vendedor(String nome, String datanasci, float salario, float comissaovenda, int qntvendas) {
        super(nome, datanasci, salario);
        this.comissaovenda = comissaovenda;
        this.qntvendas = qntvendas;
    }

    public float getComissaovenda() {
        return comissaovenda;
    }

    public void setComissaovenda(float comissaovenda) {
        this.comissaovenda = comissaovenda;
    }

    public int getQntvendas() {
        return qntvendas;
    }

    public void setQntvendas(int qntvendas) {
        this.qntvendas = qntvendas;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nCargo: vendedor \nComissão por Venda: R$" + comissaovenda + "\nNúmero de vendas: " + qntvendas;
    }

}

class FolhaPagamento {
    public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario[] funcionarios) {
        System.out.println("Empresa: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Mês: " + mes);
        System.out.println();
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println();
        }
    }
}