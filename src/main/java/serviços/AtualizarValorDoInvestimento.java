package serviços;
import dominios.InvestimentoCliente;

public class AtualizarValorDoInvestimento {

    public void ajusteValorInvestimento(InvestimentoCliente investimento){
        CalcularInvestimento investe = new CalcularInvestimento();
        investimento.setQuantidadeInvestida(investe.calculoValorDeRetirada(investimento));
    }
}