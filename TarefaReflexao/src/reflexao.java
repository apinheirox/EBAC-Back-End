import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

// Definição da annotation Tabela
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Tabela {
    String nome();
}

// Classe de exemplo com a annotation Tabela
@Tabela(nome = "clientes")
class Cliente {
    // Conteúdo da classe Cliente
}

public class Main {
    public static void main(String[] args) {
        // Obtendo a classe Cliente
        Class<?> classeCliente = Cliente.class;

        // Obtendo todas as annotations da classe Cliente
        Annotation[] annotations = classeCliente.getAnnotations();

        // Iterando sobre as annotations para encontrar a annotation Tabela
        for (Annotation annotation : annotations) {
            if (annotation instanceof Tabela) {
                // Convertendo a annotation para o tipo Tabela
                Tabela tabela = (Tabela) annotation;

                // Imprimindo o nome da tabela
                System.out.println("Nome da tabela: " + tabela.nome());
            }
        }
    }
}

