package Questao_2;

public class Funcionario {

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
        return "Nome: " + nome + "\nData de Nascimento: " + datanasci + "\nSalário: " + salario;
    }

}
