package serviços;
import dominios.Client;
import dominios.Investimento;
import dominios.Profile;
import dominios.TiposDeInvestimento;

import java.time.Duration;
import java.time.LocalTime;

public class CalcularInvestimento {

    public double calculoValorDeRetirada(Investimento investimento, Client usuario){
        long diferencaDoTempoDaCompraEVendaDoInvestimento = Duration.between(investimento.getTempoCompraOlhado(), LocalTime.now()).toSeconds();
        investimento.setTempoCompraOlhado(LocalTime.now());
        String ativo = Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado();
        double varicaoDoInvestimento = TiposDeInvestimento.valueOf(ativo).getVariacaoDoAtivo();
        double valorDoInvestimento = investimento.getQuantidadeInvestida() * (Math.pow((varicaoDoInvestimento), diferencaDoTempoDaCompraEVendaDoInvestimento));
        if(Duration.between(investimento.getTempoCompraInvestimento(), LocalTime.now()).toSeconds() > 90){
            valorDoInvestimento = 0;
        }
        return valorDoInvestimento;
    }

}
