import java.util.ArrayList;
import java.util.Scanner;

public class SeparadorPorGenero {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando duas listas para armazenar nomes separados por gênero
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        // Solicitando e lendo o nome e o sexo da pessoa até que o usuário decida parar
        while (true) {
            System.out.println("Digite o nome da pessoa (ou digite 'fim' para encerrar):");
            String nome = scanner.nextLine();
            
            // Verificando se o usuário deseja encerrar
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpa o buffer do scanner

            // Armazenando o nome na lista apropriada com base no sexo
            if (sexo == 'M' || sexo == 'm') {
                masculino.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
            }
        }

        // Exibindo os grupos masculino e feminino
        System.out.println("Grupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        // Fechando o scanner
        scanner.close();
    }
}

