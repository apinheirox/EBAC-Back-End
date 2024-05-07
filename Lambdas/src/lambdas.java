import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SeparadorMulheres {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os nomes e sexos separados por vírgulas
        System.out.println("Digite os nomes e sexos separados por vírgulas (ex: João,Maria,M,F):");
        String input = scanner.nextLine();

        // Separando os nomes e sexos usando a vírgula como delimitador
        String[] dados = input.split(",");

        // Criando uma lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();

        // Iterando sobre os dados e criando objetos Pessoa
        for (int i = 0; i < dados.length; i += 2) {
            String nome = dados[i];
            char sexo = dados[i + 1].charAt(0);
            pessoas.add(new Pessoa(nome, sexo));
        }

        // Separando as mulheres usando expressões lambda
        List<Pessoa> mulheres = pessoas.stream()
                                      .filter(pessoa -> pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f')
                                      .collect(Collectors.toList());

        // Imprimindo as mulheres
        System.out.println("Mulheres:");
        mulheres.forEach(pessoa -> System.out.println(pessoa.getNome()));

        // Fechando o scanner
        scanner.close();
    }

    // Classe Pessoa
    static class Pessoa {
        private String nome;
        private char sexo;

        // Construtor
        public Pessoa(String nome, char sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }

        // Métodos getters
        public String getNome() {
            return nome;
        }

        public char getSexo() {
            return sexo;
        }
    }
}
