// Classe Carro
public class Carro {

    // Propriedades
    String marca;
    String modelo;
    int anoFabricacao;
    String cor;
    int velocidade;

    // Método para acelerar
    void acelerar(int aumento) {
        velocidade += aumento;
        System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
    }

    // Método para frear
    void frear(int reducao) {
        velocidade -= reducao;
        System.out.println("Freando. Velocidade atual: " + velocidade + " km/h");
    }

    // Método para exibir informações
    void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidade + " km/h");
    }

    // Método principal
    public static void main(String[] args) {
        // Criando um objeto carro
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.anoFabricacao = 2020;
        meuCarro.cor = "Prata";
        meuCarro.velocidade = 0;

        // Exibindo informações iniciais do carro
        System.out.println("Informações iniciais do carro:");
        meuCarro.exibirInfo();

        // Acelerando o carro
        meuCarro.acelerar(50);

        // Freando o carro
        meuCarro.frear(20);

        // Exibindo informações atualizadas do carro
        System.out.println("\nInformações atualizadas do carro:");
        meuCarro.exibirInfo();
    }
}

