package serviços;
import dominios.InvestimentoCliente;

public class AtualizarValorDoInvestimento {

    public void ajusteValorInvestimento(InvestimentoCliente investimento, String clienteProfile){
        CalcularInvestimento investe = new CalcularInvestimento();
        investimento.setQuantidadeInvestida(investe.calculoValorDeRetirada(investimento, clienteProfile));
    }
}