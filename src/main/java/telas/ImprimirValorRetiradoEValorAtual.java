package telas;
import dominios.InvestimentoCliente;

public class ImprimirValorRetiradoEValorAtual {

    public static void  quantidadeRetirada(double quantidadeRetirada, InvestimentoCliente investimento){
        System.out.printf(("%nQuantidade retirada no valor: %.2f%nSaldo Atual na Conta: %.2f%n"), quantidadeRetirada, investimento.getQuantidadeInvestida());
    }

}
