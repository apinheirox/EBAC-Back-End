import java.util.Scanner;

public class ConversaoWrapper {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo o valor numérico do console
        System.out.println("Digite um valor numérico:");
        int valorPrimitivo = scanner.nextInt();

        // Convertendo o valor primitivo para o tipo Wrapper (Integer)
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Imprimindo o valor convertido no console
        System.out.println("O valor convertido para Wrapper é: " + valorWrapper);

        // Fechando o scanner
        scanner.close();
    }
}

