package Questao_3;

import java.util.Scanner;

public class Converte {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double temp1 = ler.nextDouble();

        Temperatura usuario1 = new Temperatura(temp1);

        usuario1.converteCel_Fah();
        System.out.println(usuario1.toString());
        usuario1.converteFah_Cel();
        System.out.println(usuario1.toString());
    }

}

class Temperatura {

    private double temperatura;
    int aux = 0;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String toString() {
        String result = "";
        if (aux == 1) {
            result = result + "temperatura: " + temperatura + " graus fahrenheit";
        } else {
            result = result + "temperatura: " + temperatura + " graus celsius";
        }
        return result;
    }

    public void converteCel_Fah() {
        temperatura = ((temperatura * 9.0) / 5.0) + 32;
        aux = 1;
    }

    public void converteFah_Cel() {
        temperatura = ((temperatura - 32) * 5.0) / 9.0;
        aux = 0;
    }
}

