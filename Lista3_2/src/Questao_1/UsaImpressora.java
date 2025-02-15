package Questao_1;


import java.util.Scanner;

public class UsaImpressora {

    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        impressora.bluetooth = true;
        impressora.wifi = true;
        impressora.colorida = true;
        impressora.ligada = false;
        impressora.papel = true;
        impressora.digitalizadora = true;
        impressora.copiadora = false;

        Scanner ler = new Scanner(System.in);

        impressora.modelo = ler.next();
        impressora.cor = ler.next();
        impressora.tipoPapel = ler.next();

        impressora.status();
        impressora.ligar();
        impressora.digitalizar();
        impressora.copiar();
        impressora.desligar();
        impressora.imprimir();
    }
}


class Impressora {

    String modelo, cor, tipoPapel;
    boolean bluetooth, wifi, colorida, ligada, papel, digitalizadora, copiadora;

    public void ligar() {
        if (ligada == false) {
            System.out.println("ligando...");
            ligada = true;
        }
    }

    public void desligar() {
        if (ligada == true) {
            System.out.println("desligando...");
            ligada = false;
        }
    }

    public void imprimir() {
        if (ligada == true && papel == true) {
            System.out.println("imprimindo...");
        } else if (ligada == true && papel == false) {
            System.out.println("sem papel");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void digitalizar() {
        if (ligada == true && digitalizadora == true) {
            System.out.println("digitalização sendo realizada...");
        } else if (ligada == true && digitalizadora == false) {
            System.out.println("não é possível digitalizar...");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void copiar() {
        if (ligada == true && copiadora == true) {
            System.out.println("cópia sendo realizada...");
        } else if (ligada == true && copiadora == false) {
            System.out.println("não é possível copiar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void status() {
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(tipoPapel);
        if (bluetooth == true) {
            System.out.println("bluetooth on");
        } else {
            System.out.println("bluetooth off");
        }
        if (wifi == true) {
            System.out.println("wifi on");
        } else {
            System.out.println("wifi off");
        }
        if (colorida == true) {
            System.out.println("impressão colorida");
        } else {
            System.out.println("impressão preto e branco");
        }
        if (ligada == true) {
            System.out.println("impressora on");
        } else {
            System.out.println("impressora off");
        }
        if (papel == true) {
            System.out.println("tem papel");
        } else {
            System.out.println("não tem papel");
        }
        if (digitalizadora == true) {
            System.out.println("digitalizadora on");
        } else {
            System.out.println("digitalizadora off");
        }
        if (copiadora == true) {
            System.out.println("copiadora on");
        } else {
            System.out.println("copiadora off");
        }
    }
}

