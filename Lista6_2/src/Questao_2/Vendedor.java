package Questao_2;

public class Vendedor extends Funcionario {

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
