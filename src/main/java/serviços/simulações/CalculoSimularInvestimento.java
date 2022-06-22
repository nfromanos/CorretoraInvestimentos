package serviços.simulações;
import dominios.InvestimentoCorretora;
import serviços.PegarInvestimento;

public class CalculoSimularInvestimento {

    public static String simulacaoInvestimento(String tipoInvestimento, String ativoInvestimento, double valorInvestido, int segundos){
        InvestimentoCorretora investimentocorretora = PegarInvestimento.pegarInvestimento(tipoInvestimento, ativoInvestimento);
        double variacaoAtivo = investimentocorretora.getVariacaoDoAtivo();
        double valorSimulado = valorInvestido * Math.pow(variacaoAtivo, segundos);
        return String.format("Sua simulação no valor inicial de R$%.2f no período de %d segundos retornou o valor de: R$%.2f", valorInvestido, segundos, valorSimulado);
    }
}