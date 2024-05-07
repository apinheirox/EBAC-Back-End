package br.com.rpires.dao;

import java.util.ArrayList;
import java.util.List;

public class ContratoDao implements IContratoDao {

    private List<Contrato> contratos; // Simulação de um banco de dados

    public ContratoDao() {
        // Inicializa a lista de contratos
        this.contratos = new ArrayList<>();
    }

    @Override
    public void salvar(Contrato contrato) {
        // Adiciona o contrato à lista de contratos
        this.contratos.add(contrato);
    }

    @Override
    public Contrato buscar(int id) {
        // Percorre a lista de contratos e busca o contrato com o id especificado
        for (Contrato contrato : this.contratos) {
            if (contrato.getId() == id) {
                return contrato; // Retorna o contrato encontrado
            }
        }
        return null; // Retorna null se o contrato não for encontrado
    }

    @Override
    public void excluir(int id) {
        // Percorre a lista de contratos e remove o contrato com o id especificado
        this.contratos.removeIf(contrato -> contrato.getId() == id);
    }

    @Override
    public void atualizar(Contrato contratoAtualizado) {
        // Percorre a lista de contratos e atualiza o contrato com o id correspondente
        for (int i = 0; i < this.contratos.size(); i++) {
            Contrato contrato = this.contratos.get(i);
            if (contrato.getId() == contratoAtualizado.getId()) {
                this.contratos.set(i, contratoAtualizado); // Atualiza o contrato na lista
                break; // Encerra o loop após encontrar e atualizar o contrato
            }
        }
    }
}
