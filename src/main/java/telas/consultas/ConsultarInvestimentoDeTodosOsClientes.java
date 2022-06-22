package telas.consultas;
import dominios.InvestimentoCliente;
import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class ConsultarInvestimentoDeTodosOsClientes implements ConsultarTodosOsClientes {
    public void consultar() {
        for (InvestimentoCliente investimento : listaDeInvestimentos) {
            System.out.printf("%nLogin:%s Investimento:%s Quantidade:%f", investimento.getUsername(), investimento.getTipoDoInvestimento(), investimento.getQuantidadeInvestida());
        }
    }
}
