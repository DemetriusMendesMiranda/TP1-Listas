
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsoContatos {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>();

        int opcao;
        do {

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    int tipo = ler.nextInt();

                    String nome = ler.next();
                    String apelido = ler.next();
                    String email = ler.next();
                    String aniversario = ler.next();

                    if (tipo == 1) {
                        int grau = ler.nextInt();
                        contatos.add(new Amigo(nome, apelido, email, aniversario, grau));
                    } else if (tipo == 2) {
                        String parentesco = ler.next();
                        contatos.add(new Familia(nome, apelido, email, aniversario, parentesco));
                    } else {
                        String tipoTrabalho = ler.next();
                        contatos.add(new Colegas(nome, apelido, email, aniversario, tipoTrabalho));
                    }
                    break;

                case 2:
                    for (Contato c : contatos) {
                        System.out.println(c.imprimirContato());
                    }
                    break;

                case 3:
                    for (Contato c : contatos) {
                        if (c instanceof Familia) {
                            System.out.println(c.imprimirContato());
                        }
                    }
                    break;

                case 4:
                    for (Contato c : contatos) {
                        if (c instanceof Amigo) {
                            System.out.println(c.imprimirContato());
                        }
                    }
                    break;

                case 5:
                    for (Contato c : contatos) {
                        if (c instanceof Colegas) {
                            System.out.println(c.imprimirContato());
                        }
                    }
                    break;

                case 6:
                    for (Contato c : contatos) {
                        if ((c instanceof Amigo && ((Amigo) c).getGrau() == 1) ||
                            (c instanceof Familia && ((Familia) c).getParentesco().equalsIgnoreCase("irmão")) ||
                            (c instanceof Colegas && ((Colegas) c).getTipo().equalsIgnoreCase("colega"))) {
                            System.out.println(c.imprimirContato());
                        }
                    }
                    break;

                case 7:
                    int indice = ler.nextInt();
                    if (indice >= 1 && indice <= contatos.size()) {
                        System.out.println(contatos.get(indice-1).imprimirContato());
                    } 
                    break;

                case 8:
                    break;
            }
        } while (opcao != 8);

        ler.close();
    }
    
}

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

class Amigo extends Contato {

    private int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        if (grau == 1){
            return imprimirBasico() + "\nGrau: Melhor Amigo";
        }
        else if(grau == 2){
            return imprimirBasico() + "\nGrau: Amigo";
        }
        else{
            return imprimirBasico() + "\nGrau: Conhecido";
        }
    }

    public int getGrau() {
        return grau;
    }
}

class Colegas extends Contato {

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

class Familia extends Contato {

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
