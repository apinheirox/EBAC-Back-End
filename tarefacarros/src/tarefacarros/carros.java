import java.util.ArrayList;
import java.util.List;

// Interface comum para todos os tipos de carros
interface Carro {
    void exibirInfo();
}

// Implementação da classe CarroSedan
class CarroSedan implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Sedan - Categoria popular");
    }
}

// Implementação da classe CarroSUV
class CarroSUV implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro SUV - Categoria utilitário esportivo");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de carros usando generics
        List<Carro> listaCarros = new ArrayList<>();

        // Adicionando diferentes tipos de carros à lista
        listaCarros.add(new CarroSedan());
        listaCarros.add(new CarroSUV());

        // Iterando sobre a lista e exibindo informações de cada carro
        for (Carro carro : listaCarros) {
            carro.exibirInfo();
        }
    }
}
