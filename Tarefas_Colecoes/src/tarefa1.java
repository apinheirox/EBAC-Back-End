import java.util.Arrays;
import java.util.Scanner;

public class OrdenadorNomes {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os nomes separados por vírgulas
        System.out.println("Digite os nomes separados por vírgulas:");
        String input = scanner.nextLine();

        // Separando os nomes usando a vírgula como delimitador
        String[] nomes = input.split(",");

        // Removendo espaços em branco em excesso antes e depois de cada nome
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordenando os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibindo os nomes ordenados no console
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fechando o scanner
        scanner.close();
    }
}
