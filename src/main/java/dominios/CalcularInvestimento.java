package dominios;
import repositorio.InvestimentsRepository;
import java.time.Duration;
import java.time.LocalTime;

public class CalcularInvestimento {

    public double calculoValorDeRetirada(InvestimentsRepository investimento, Client usuario){
        long diferencaDoTempoDaCompraEVendaDoInvestimento = Duration.between(investimento.getTempoCompraOlhado(), LocalTime.now()).toSeconds();
        investimento.setTempoCompraOlhado(LocalTime.now());
        String ativo = Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado();
        double varicaoDoInvestimento = TiposDeInvestimento.valueOf(ativo).getVariacaoDoAtivo();
        double valorDoInvestimento = investimento.getQuantidadeInvestida() * (Math.pow((varicaoDoInvestimento), diferencaDoTempoDaCompraEVendaDoInvestimento));
        if(Duration.between(investimento.getTEMPO_COMPRA_INVESTIMENTO(), LocalTime.now()).toSeconds() > 90){
            valorDoInvestimento = 0;
        }
        return valorDoInvestimento;
    }

}
