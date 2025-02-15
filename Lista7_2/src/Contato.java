
abstract class Contato {

    protected String nome;
    protected String apelido;
    protected String email;
    protected String data_ani;

    public Contato(String nome, String apelido, String email, String data_ani) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.data_ani = data_ani;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData_ani() {
        return data_ani;
    }

    public void setData_ani(String data_ani) {
        this.data_ani = data_ani;
    }

    public String imprimirBasico() {
        return "Nome: " + nome + "\nApelido: " + apelido + "\nEmail: " + email + "\nAniversário: " + data_ani;
    }

    public abstract String imprimirContato();
}
