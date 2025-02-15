
package Questao_2;

public class FolhaPagamento {
    public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario[] funcionarios) {
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Endereço: " + cidade);
        System.out.println("Mês: " + mes);
        System.out.println();
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println();
        }
    }
}
