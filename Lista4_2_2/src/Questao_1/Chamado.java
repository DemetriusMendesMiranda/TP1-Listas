package Questao_1;

public class Chamado {

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
