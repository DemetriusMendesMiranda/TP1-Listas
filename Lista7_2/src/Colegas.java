
public class Colegas extends Contato {

    private String tipo;

    public Colegas(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nRelacionamento de trabalho: " + tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
