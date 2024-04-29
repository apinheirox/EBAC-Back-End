import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparadorGenero {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os nomes e sexos separados por vírgulas
        System.out.println("Digite os nomes e sexos separados por vírgulas (ex: João,Maria,M,M,F):");
        String input = scanner.nextLine();

        // Separando os nomes e sexos usando a vírgula como delimitador
        String[] dados = input.split(",");

        // Criando listas para armazenar os nomes separados por gênero
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        // Iterando sobre os dados e armazenando os nomes nas listas apropriadas
        for (int i = 0; i < dados.length; i += 2) {
            String nome = dados[i];
            char sexo = dados[i + 1].charAt(0);
            if (sexo == 'M' || sexo == 'm') {
                masculino.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                feminino.add(nome);
            }
        }

        // Exibindo os nomes separados por gênero no console
        System.out.println("Pessoas do gênero masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nPessoas do gênero feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        // Fechando o scanner
        scanner.close();
    }
}


