package Questao_2;

public class Horista extends Funcionario {

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
