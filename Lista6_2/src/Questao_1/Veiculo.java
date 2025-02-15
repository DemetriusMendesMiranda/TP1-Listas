package Questao_1;

public class Veiculo {

    protected String placa;
    protected int nportas;
    protected float preco;

    public Veiculo() {
    }

    public Veiculo(String placa, int nportas, float preco) {
        this.placa = placa;
        this.nportas = nportas;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNportas() {
        return nportas;
    }

    public void setNportas(int nportas) {
        this.nportas = nportas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Placa: " + placa + " Número de portas: " + nportas + " Preço: " + preco;
    }

}
