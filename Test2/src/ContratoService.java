package br.com.rpires;

import br.com.rpires.dao.IContratoDao;
import br.com.rpires.dao.mocks.ContratoDaoMock;
import br.com.rpires.service.ContratoService;
import br.com.rpires.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        // Simulando um contrato existente
        int idContratoExistente = 1;
        Assert.assertNotNull(service.buscar(idContratoExistente));
        // Simulando um contrato inexistente
        int idContratoInexistente = 999;
        Assert.assertNull(service.buscar(idContratoInexistente));
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        // Simulando um contrato existente
        int idContratoExistente = 1;
        service.excluir(idContratoExistente);
        Assert.assertNull(service.buscar(idContratoExistente));
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        // Simulando um contrato existente
        int idContratoExistente = 1;
        String novoConteudo = "Contrato atualizado";
        service.atualizar(idContratoExistente, novoConteudo);
        Assert.assertEquals(novoConteudo, service.buscar(idContratoExistente).getConteudo());
    }
}
