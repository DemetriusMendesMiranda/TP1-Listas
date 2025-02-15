
public class Amigo extends Contato {

    private int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        if (grau == 1){
            return imprimirBasico() + "\nGrau: Melhor Amigo";
        }
        else if(grau == 2){
            return imprimirBasico() + "\nGrau: Amigo";
        }
        else{
            return imprimirBasico() + "\nGrau: Conhecido";
        }
    }

    public int getGrau() {
        return grau;
    }
}
