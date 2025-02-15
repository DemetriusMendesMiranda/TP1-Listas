package Questao_1;

public class Moto extends Veiculo {

    private int qtcilindradas;

    public Moto() {

    }

    public Moto(String placa, int nportas, float preco, int qtcilindradas) {
        super(placa, nportas, preco);
        this.qtcilindradas = qtcilindradas;
    }

    public int getQtcilindradas() {
        return qtcilindradas;
    }

    public void setQtcilindradas(int qtcilindradas) {
        this.qtcilindradas = qtcilindradas;
    }


    public String toString() {
        return super.toString() + " Quantidade de cilindradas: " + qtcilindradas;
    }

}
