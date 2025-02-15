package Questao_1;

public class Veiculo {

    private String placa_veiculo;
    private String marca_veiculo;
    private String modelo_veiculo;
    private String cor_veiculo;
    private int ano;

    public Veiculo(String placa_veiculo, String marca_veiculo, String modelo_veiculo, String cor_veiculo, int ano) {
        this.placa_veiculo = placa_veiculo;
        this.marca_veiculo = marca_veiculo;
        this.modelo_veiculo = modelo_veiculo;
        this.cor_veiculo = cor_veiculo;
        this.ano = ano;
    }

    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public String getMarca_veiculo() {
        return marca_veiculo;
    }

    public void setMarca_veiculo(String marca_veiculo) {
        this.marca_veiculo = marca_veiculo;
    }

    public String getModelo_veiculo() {
        return modelo_veiculo;
    }

    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }

    public String getCor_veiculo() {
        return cor_veiculo;
    }

    public void setCor_veiculo(String cor_veiculo) {
        this.cor_veiculo = cor_veiculo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
