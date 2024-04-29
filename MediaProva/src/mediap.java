import java.util.Scanner;

public class VerificadorAprovacao {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo as notas
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        double nota4 = scanner.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verificando a situação do aluno
        if (media >= 7.0) {
            System.out.println("Parabéns! Você está aprovado.");
        } else if (media >= 5.0) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você está reprovado.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
