package Questao_2;

import java.util.Scanner;

public class Formas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Retangulo calculo1 = new Retangulo();
        Retangulo calculo2 = new Retangulo();

        int co1 = ler.nextInt();
        if (co1 > 0 && co1 < 20) {
            calculo1.setComprimento(co1);
        }
        int la1 = ler.nextInt();
        if (la1 > 0 && la1 < 20) {
            calculo1.setLargura(la1);
        }
        int co2 = ler.nextInt();
        if (co2 > 0 && co2 < 20) {
            calculo2.setComprimento(co2);
        }
        int la2 = ler.nextInt();
        if (la2 > 0 && la2 < 20) {
            calculo2.setLargura(la2);
        }

        System.out.println(calculo1.getComprimento() + " " + calculo1.getLargura() + " " + calculo1.perimetro() + " " + calculo1.area());
        System.out.println(calculo2.getComprimento() + " " + calculo2.getLargura() + " " + calculo2.perimetro() + " " + calculo2.area());

    }

}

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
