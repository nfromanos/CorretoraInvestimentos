package serviços;
import dominios.Client;
import dominios.Investimento;

public class AtualizarValorDoInvestimento {

    public void ajusteValorInvestimento(Investimento investimento, String clienteProfile){
        CalcularInvestimento investe = new CalcularInvestimento();
        investimento.setQuantidadeInvestida(investe.calculoValorDeRetirada(investimento, clienteProfile));
    }
}