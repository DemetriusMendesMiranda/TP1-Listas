package Questao_2;

class Retangulo {

    private int comprimento = 1;
    private int largura = 1;

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int perimetro() {
        return 2 * (comprimento + largura);
    }

    public int area() {
        return comprimento * largura;
    }
}
