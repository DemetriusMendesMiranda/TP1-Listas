package Questao_1;

public class Cliente {

    private int id_cliente;
    private String rg_cliente;
    private String cpf;
    private String nome_cliente;
    private String telefone_cliente;

    public Cliente(int id_cliente, String nome_cliente, String telefone_cliente, String rg_cliente, String cpf) {
        this.id_cliente = id_cliente;
        this.nome_cliente = nome_cliente;
        this.telefone_cliente = telefone_cliente;
        this.rg_cliente = rg_cliente;
        this.cpf = cpf;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getRg_cliente() {
        return rg_cliente;
    }

    public void setRg_cliente(String rg_cliente) {
        this.rg_cliente = rg_cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

}
