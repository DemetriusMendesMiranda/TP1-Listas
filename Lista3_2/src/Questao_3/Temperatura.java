package Questao_3;

public class Temperatura {

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
