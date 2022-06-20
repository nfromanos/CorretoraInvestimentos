package telas.consultas;
import dominios.Investimento;
import serviços.AtualizarValorDoInvestimento;

import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class ConsultarInvestimentosDoCliente implements ConsultarCliente {
    public void consultar(String clienteSelecionado) {
        for (Investimento investimento : listaDeInvestimentos) {
            if (investimento.getUsername().equals(clienteSelecionado)) {
                AtualizarValorDoInvestimento atualizar = new AtualizarValorDoInvestimento();
                atualizar.ajusteValorInvestimento(investimento, investimento.getProfile());
                System.out.printf("%nLogin:%s Investimento:%s Quantidade:%.2f Hora da Compra:%s%n", investimento.getUsername(), investimento.getTipoDoInvestimento(), investimento.getQuantidadeInvestida(), investimento.getTempoCompraInvestimento());
            }
        }
    }
}
