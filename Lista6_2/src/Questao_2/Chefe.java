package Questao_2;

public class Chefe extends Funcionario {

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
