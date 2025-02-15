
public class Cliente implements Classificavel {

    private String cpf;
    private String nome;
    private String endereco;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        Cliente compara = (Cliente) obj;
        return this.nome.compareTo(compara.nome) < 0;
    }

    @Override
    public String toString() {
        return "" + cpf + " " + nome + " " + endereco;
    }
}
