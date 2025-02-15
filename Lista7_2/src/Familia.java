
public class Familia extends Contato {

    private String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nParentesco: " + parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }
}
