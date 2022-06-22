package serviços.operações;
import telas.ImprimirValorRetiradoEValorAtual;
import telas.consultas.ConsultarInvestimentosDoCliente;
import dominios.Client;
import dominios.InvestimentoCliente;

import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class Retirar {

    public void retirar(double quantidadeRetirada, Client usuario, String ativo){
        ConsultarInvestimentosDoCliente consultar = new ConsultarInvestimentosDoCliente();
        consultar.consultar(usuario.getUsername());
        for (InvestimentoCliente investimento : listaDeInvestimentos) {
            if(investimento.getUsername().equals(usuario.getUsername()) && investimento.getInvestimento().getNomeDoInvestimento().equals(ativo)){
                double quantidadeNova = investimento.getQuantidadeInvestida() - quantidadeRetirada;
                investimento.setQuantidadeInvestida(quantidadeNova);
                ImprimirValorRetiradoEValorAtual.quantidadeRetirada(quantidadeRetirada, investimento);
            }
        }
    }
}
