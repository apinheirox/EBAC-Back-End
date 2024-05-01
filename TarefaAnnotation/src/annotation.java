import java.lang.annotation.*;

// Definição da annotation Tabela
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Tabela {
    String nome();
}

// Classe exemplo que utiliza a annotation Tabela
@Tabela(nome = "clientes")
class Cliente {
    // Métodos e propriedades da classe Cliente
}

public class Main {
    public static void main(String[] args) {
        // Acessando a annotation na classe Cliente
        Tabela annotation = Cliente.class.getAnnotation(Tabela.class);

        if (annotation != null) {
            String nomeTabela = annotation.nome();
            System.out.println("O nome da tabela da classe Cliente é: " + nomeTabela);
        } else {
            System.out.println("A classe Cliente não possui a annotation Tabela.");
        }
    }
}
