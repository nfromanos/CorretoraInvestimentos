package serviços;
import dominios.InvestimentoCliente;


import java.time.Duration;
import java.time.LocalTime;

public class CalcularInvestimento {

    public double calculoValorDeRetirada(InvestimentoCliente investimento){
        long diferencaDoTempoDaCompraEVendaDoInvestimento = Duration.between(investimento.getTempoCompraOlhado(), LocalTime.now()).toSeconds();
        investimento.setTempoCompraOlhado(LocalTime.now());
        double varicaoDoAtivo = investimento.getInvestimento().getVariacaoDoAtivo();
        double valorDoInvestimento = investimento.getQuantidadeInvestida() * (Math.pow((varicaoDoAtivo), diferencaDoTempoDaCompraEVendaDoInvestimento));
        if(Duration.between(investimento.getTempoCompraInvestimento(), LocalTime.now()).toSeconds() > 120){
            valorDoInvestimento = 0;
        }
        return valorDoInvestimento;
    }

}
