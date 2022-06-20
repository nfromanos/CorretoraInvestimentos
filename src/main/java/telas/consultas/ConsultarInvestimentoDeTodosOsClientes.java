package telas.consultas;
import dominios.Investimento;

import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class ConsultarInvestimentoDeTodosOsClientes extends ConsultarClientes {

    public void consultar() {
        for (Investimento investimento : listaDeInvestimentos) {
            System.out.printf("%nLogin:%s Investimento:%s Quantidade:%f", investimento.getUsername(), investimento.getTipoDoInvestimento(), investimento.getQuantidadeInvestida());
        }
    }
}
