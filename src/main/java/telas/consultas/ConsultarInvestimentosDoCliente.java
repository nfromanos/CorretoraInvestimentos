package telas.consultas;
import dominios.InvestimentoCliente;
import serviços.AtualizarValorDoInvestimento;
import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class ConsultarInvestimentosDoCliente implements ConsultaUnica {
    public void consultar(String clienteSelecionado) {
        for (InvestimentoCliente investimento : listaDeInvestimentos) {
            if (investimento.getUsername().equals(clienteSelecionado) && investimento.getQuantidadeInvestida() > 0) {
                AtualizarValorDoInvestimento atualizar = new AtualizarValorDoInvestimento();
                atualizar.ajusteValorInvestimento(investimento);
                System.out.printf("%nLogin:%s%nTipo do Investimento:%s%sQuantidade:%.2f%nHora da Compra:%s%n", investimento.getUsername(), investimento.getTipoDoInvestimento(), investimento.getInvestimento(), investimento.getQuantidadeInvestida(), investimento.getTempoCompraInvestimento());
            }
        }
    }
}