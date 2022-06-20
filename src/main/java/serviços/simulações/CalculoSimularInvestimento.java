package serviços.simulações;
import dominios.TiposDeInvestimento;

public class CalculoSimularInvestimento {

    public static String simulacaoInvestimento(String tipoInvestimento, double valorInvestido, int segundos){
        double variacaoAtivo = TiposDeInvestimento.valueOf(tipoInvestimento).getVariacaoDoAtivo();
        double valorSimulado = valorInvestido * Math.pow(variacaoAtivo, segundos);
        return String.format("Sua simulação no valor inicial de R$%.2f no período de %d segundos retornou o valor de: R$%.2f", valorInvestido, segundos, valorSimulado);
    }
}
