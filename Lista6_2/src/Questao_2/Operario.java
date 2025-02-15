package Questao_2;

public class Operario extends Funcionario {

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
