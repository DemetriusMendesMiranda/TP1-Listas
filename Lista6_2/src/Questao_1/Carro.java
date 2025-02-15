package Questao_1;

public class Carro extends Veiculo {

    private String cor;

    public Carro() {

    }

    public Carro(String placa, int nportas, float preco, String cor) {
        super(placa, nportas, preco);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + " Cor: " + cor;
    }

}
