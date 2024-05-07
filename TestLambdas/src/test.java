import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SeparadorMulheresTest {

    @Test
    public void testSepararMulheres() {
        // Criando uma lista de pessoas com nomes e sexos
        List<SeparadorMulheres.Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new SeparadorMulheres.Pessoa("João", 'M'));
        pessoas.add(new SeparadorMulheres.Pessoa("Maria", 'F'));
        pessoas.add(new SeparadorMulheres.Pessoa("Pedro", 'M'));
        pessoas.add(new SeparadorMulheres.Pessoa("Ana", 'F'));

        // Chamando o método para separar as mulheres
        List<SeparadorMulheres.Pessoa> mulheres = pessoas.stream()
                                                          .filter(pessoa -> pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f')
                                                          .collect(Collectors.toList());

        // Verificando se todas as pessoas na lista de mulheres são do sexo feminino
        for (SeparadorMulheres.Pessoa mulher : mulheres) {
            assertEquals('F', mulher.getSexo());
        }
    }
}

