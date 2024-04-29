// Classe abstrata Pessoa
abstract class Pessoa {
    protected String nome;
    protected String endereco;

    // Construtor
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Método abstrato para obter informações específicas da pessoa
    public abstract String getInfo();
}

// Subclasse concreta PessoaFisica
class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    // Implementação do método abstrato
    public String getInfo() {
        return "Nome: " + nome + ", Endereço: " + endereco + ", CPF: " + cpf;
    }
}

// Subclasse concreta PessoaJuridica
class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    // Implementação do método abstrato
    public String getInfo() {
        return "Nome: " + nome + ", Endereço: " + endereco + ", CNPJ: " + cnpj;
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes

        // Criando uma pessoa física
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A", "123.456.789-00");
        System.out.println("Informações da Pessoa Física:");
        System.out.println(pessoaFisica.getInfo());

        // Criando uma pessoa jurídica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa X", "Av. B", "12.345.678/0001-00");
        System.out.println("\nInformações da Pessoa Jurídica:");
        System.out.println(pessoaJuridica.getInfo());
    }
}
