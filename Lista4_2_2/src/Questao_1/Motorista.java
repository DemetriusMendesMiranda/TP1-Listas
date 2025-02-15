package Questao_1;

public class Motorista {

    private int id_motorista;
    private String nome_motorista;
    private String telefone_motorista;
    private String cnh;

    public Motorista(int id_motorista, String nome_motorista, String telefone_motorista, String cnh) {
        this.id_motorista = id_motorista;
        this.nome_motorista = nome_motorista;
        this.telefone_motorista = telefone_motorista;
        this.cnh = cnh;
    }

    public int getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(int id_motorista) {
        this.id_motorista = id_motorista;
    }

    public String getNome_motorista() {
        return nome_motorista;
    }

    public void setNome_motorista(String nome_motorista) {
        this.nome_motorista = nome_motorista;
    }

    public String getTelefone_motorista() {
        return telefone_motorista;
    }

    public void setTelefone_motorista(String telefone_motorista) {
        this.telefone_motorista = telefone_motorista;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

}
