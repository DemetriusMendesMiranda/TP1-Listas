
package Questao_1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String placa_vei1 = ler.next();
        String marca_vei1 = ler.next();
        String modelo_vei1 = ler.next();
        String cor_vei1 = ler.next();
        int ano_vei1 = ler.nextInt();
        
        Veiculo veiculo01 = new Veiculo(placa_vei1,marca_vei1,modelo_vei1,cor_vei1,ano_vei1);
        
        int id_mot1 = ler.nextInt();
        String nome_mot1 = ler.next();
        String telefone_mot1 = ler.next();
        String cnh_mot1 = ler.next();
        
        Motorista motorista01 = new Motorista(id_mot1, nome_mot1, telefone_mot1, cnh_mot1);
        
        int id_cli01 = ler.nextInt();
        String nome_cli01 = ler.next();
        String telefone_cli01 = ler.next();
        String rg_cli01 = ler.next();
        String cpf_cli01 = ler.next();
        
        Cliente cliente01 = new Cliente(id_cli01, nome_cli01, telefone_cli01, rg_cli01, cpf_cli01);
        
        int id_cham01 = ler.nextInt();
        String data_cham01 = ler.next();
        String tipo_cham01 = ler.next();
        String origem_cham01 = ler.next();
        String destino_cham01 = ler.next();
        float hora_part_cham01 = ler.nextFloat();
        float hora_cheg_cham01 = ler.nextFloat();
        double km_inic_cham01 = ler.nextDouble();
        double km_fin_cham01 = ler.nextDouble();
        double valor_cham01 = ler.nextDouble();
        
        Chamado chamado01 = new Chamado(id_cham01, data_cham01, tipo_cham01, origem_cham01, destino_cham01, hora_part_cham01, hora_cheg_cham01, km_inic_cham01, km_fin_cham01, valor_cham01, veiculo01, cliente01, motorista01);
        
        System.out.println(chamado01.getId_chamado());
        System.out.println(chamado01.getDestino());
        System.out.println(chamado01.getVeiculo1().getPlaca_veiculo());
        System.out.println(chamado01.getCliente1().getRg_cliente());
        System.out.println(chamado01.getMotorista1().getNome_motorista());
    }
    
}

class Motorista {

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

class Cliente {

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

class Veiculo {

    private String placa_veiculo;
    private String marca_veiculo;
    private String modelo_veiculo;
    private String cor_veiculo;
    private int ano;

    public Veiculo(String placa_veiculo, String marca_veiculo, String modelo_veiculo, String cor_veiculo, int ano) {
        this.placa_veiculo = placa_veiculo;
        this.marca_veiculo = marca_veiculo;
        this.modelo_veiculo = modelo_veiculo;
        this.cor_veiculo = cor_veiculo;
        this.ano = ano;
    }

    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public String getMarca_veiculo() {
        return marca_veiculo;
    }

    public void setMarca_veiculo(String marca_veiculo) {
        this.marca_veiculo = marca_veiculo;
    }

    public String getModelo_veiculo() {
        return modelo_veiculo;
    }

    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }

    public String getCor_veiculo() {
        return cor_veiculo;
    }

    public void setCor_veiculo(String cor_veiculo) {
        this.cor_veiculo = cor_veiculo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}

class Chamado {

    private int id_chamado;
    private String data_chamado;
    private String tipo_chamado;
    private String origem;
    private String destino;
    private float horario_partida;
    private float horario_retorno;
    private double km_inicial;
    private double km_final;
    private double valor_total;
    private Veiculo veiculo1;
    private Cliente cliente1;
    private Motorista motorista1;

    public Chamado(int id_chamado, String data_chamado, String tipo_chamado, String origem, String destino, float horario_partida, float horario_retorno, double km_inicial, double km_final, double valor_total, Veiculo veiculo1, Cliente cliente1, Motorista motorista1) {
        this.id_chamado = id_chamado;
        this.data_chamado = data_chamado;
        this.tipo_chamado = tipo_chamado;
        this.origem = origem;
        this.destino = destino;
        this.horario_partida = horario_partida;
        this.horario_retorno = horario_retorno;
        this.km_inicial = km_inicial;
        this.km_final = km_final;
        this.valor_total = valor_total;
        this.veiculo1 = veiculo1;
        this.cliente1 = cliente1;
        this.motorista1 = motorista1;
    }

    public int getId_chamado() {
        return id_chamado;
    }

    public void setId_chamado(int id_chamado) {
        this.id_chamado = id_chamado;
    }

    public String getData_chamado() {
        return data_chamado;
    }

    public void setData_chamado(String data_chamado) {
        this.data_chamado = data_chamado;
    }

    public String getTipo_chamado() {
        return tipo_chamado;
    }

    public void setTipo_chamado(String tipo_chamado) {
        this.tipo_chamado = tipo_chamado;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getHorario_partida() {
        return horario_partida;
    }

    public void setHorario_partida(float horario_partida) {
        this.horario_partida = horario_partida;
    }

    public float getHorario_retorno() {
        return horario_retorno;
    }

    public void setHorario_retorno(float horario_retorno) {
        this.horario_retorno = horario_retorno;
    }

    public double getKm_inicial() {
        return km_inicial;
    }

    public void setKm_inicial(double km_inicial) {
        this.km_inicial = km_inicial;
    }

    public double getKm_final() {
        return km_final;
    }

    public void setKm_final(double km_final) {
        this.km_final = km_final;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Veiculo getVeiculo1() {
        return veiculo1;
    }

    public void setVeiculo1(Veiculo veiculo1) {
        this.veiculo1 = veiculo1;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public Motorista getMotorista1() {
        return motorista1;
    }

    public void setMotorista1(Motorista motorista1) {
        this.motorista1 = motorista1;
    }

}
