// Interface Carro
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

// Interface FabricaCarro
interface FabricaCarro {
    Carro criarCarro();
}

// Implementação da fábrica de carros Sedan
class FabricaCarroSedan implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new CarroSedan();
    }
}

// Implementação da fábrica de carros SUV
class FabricaCarroSUV implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new CarroSUV();
    }
}

// Teste do padrão Abstract Factory
public class Main {
    public static void main(String[] args) {
        // Criando uma fábrica de carros Sedan
        FabricaCarro fabricaSedan = new FabricaCarroSedan();
        Carro sedan = fabricaSedan.criarCarro();
        sedan.exibirInfo();

        // Criando uma fábrica de carros SUV
        FabricaCarro fabricaSUV = new FabricaCarroSUV();
        Carro suv = fabricaSUV.criarCarro();
        suv.exibirInfo();
    }
}

