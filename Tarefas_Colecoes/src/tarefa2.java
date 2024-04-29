import java.util.HashMap;
import java.util.Map;
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

        // Criando um mapa para armazenar o número de pessoas por gênero
        Map<Character, Integer> generos = new HashMap<>();
        generos.put('M', 0); // Inicialmente, zero homens
        generos.put('F', 0); // Inicialmente, zero mulheres

        // Iterando sobre os dados e contando o número de pessoas por gênero
        for (int i = 0; i < dados.length; i += 2) {
            char sexo = dados[i + 1].charAt(0);
            if (sexo == 'M' || sexo == 'm') {
                generos.put('M', generos.get('M') + 1); // Incrementando o contador de homens
            } else if (sexo == 'F' || sexo == 'f') {
                generos.put('F', generos.get('F') + 1); // Incrementando o contador de mulheres
            }
        }

        // Exibindo o número de pessoas por gênero no console
        System.out.println("Número de pessoas por gênero:");
        System.out.println("Masculino: " + generos.get('M'));
        System.out.println("Feminino: " + generos.get('F'));

        // Fechando o scanner
        scanner.close();
    }
}

