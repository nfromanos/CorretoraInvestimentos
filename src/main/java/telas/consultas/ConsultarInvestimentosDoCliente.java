package telas.consultas;
import dominios.InvestimentoCliente;
import serviços.AtualizarValorDoInvestimento;
import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class ConsultarInvestimentosDoCliente implements ConsultaUnica {
    public void consultar(String clienteSelecionado) {
        for (InvestimentoCliente investimento : listaDeInvestimentos) {
            if (investimento.getUsername().equals(clienteSelecionado)) {
                AtualizarValorDoInvestimento atualizar = new AtualizarValorDoInvestimento();
                atualizar.ajusteValorInvestimento(investimento);
                System.out.printf("%nLogin:%s%n Tipo do Investimento:%s%n Ativo investido:%s%n Quantidade:%.2f%n Hora da Compra:%s%n", investimento.getUsername(), investimento.getTipoDoInvestimento(), investimento.getInvestimento(), investimento.getQuantidadeInvestida(), investimento.getTempoCompraInvestimento());
            }
        }
    }
}