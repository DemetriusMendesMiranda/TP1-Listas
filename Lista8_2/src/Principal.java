
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numPro = ler.nextInt();
        int numCli = ler.nextInt();
        int numSer = ler.nextInt();
        
        Produto[] produtos = new Produto[numPro];
        Cliente[] clientes = new Cliente[numCli];
        Servico[] servicos = new Servico[numSer];

        for (int i = 0; i < numPro; i++) {
            int codigo = ler.nextInt();
            String nome = ler.next();
            double preco = ler.nextDouble();
            produtos[i] = new Produto(codigo, nome, preco);
        }
        
        for (int i = 0; i < numCli; i++) {
            String cpf = ler.next();
            String nome = ler.next();
            String endereco = ler.next();
            clientes[i] = new Cliente(cpf, nome, endereco);
        }
        
        for (int i = 0; i < numSer; i++) {
            String tipoServico = ler.next();
            double preco = ler.nextDouble();
            String data = ler.next();
            servicos[i] = new Servico(preco, data, tipoServico);
        }
        
        Classificador classificador = new Classificador();
        
        classificador.ordena(produtos);
        for (Produto p : produtos) {
            System.out.println(p);
        }
        
        classificador.ordena(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        
        classificador.ordena(servicos);
        for (Servico s : servicos) {
            System.out.println(s);
        }
    }

}
