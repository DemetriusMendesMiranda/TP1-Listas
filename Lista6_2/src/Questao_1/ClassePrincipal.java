
package Questao_1;

import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Veiculo veiculo1 = new Veiculo();
        
        String placa1 = ler.next();
        int nportas1 = ler.nextInt();
        float preco1 = ler.nextFloat();
        
        veiculo1.setPlaca(placa1);
        veiculo1.setNportas(nportas1);
        veiculo1.setPreco(preco1);
        
        String placa_car = ler.next();
        int nportas_car = ler.nextInt();
        float preco_car = ler.nextFloat();
        String cor_car = ler.next();
        
        Carro carro1 = new Carro(placa_car, nportas_car, preco_car, cor_car);
        
        String placa_moto = ler.next();
        int nportas_moto = ler.nextInt();
        float preco_moto = ler.nextFloat();
        int cilindradas = ler.nextInt();
        
        Moto moto1 = new Moto(placa_moto, nportas_moto, preco_moto, cilindradas);
        
        System.out.println(veiculo1.toString());
        System.out.println(carro1.toString());
        System.out.println(moto1.toString());

    }
    
}

class Veiculo {

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
        return "Placa: " + placa + " Número de portas: " + nportas + " Preço: R$" + preco;
    }

}

class Carro extends Veiculo {

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

class Moto extends Veiculo {

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