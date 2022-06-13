package serviços.operações;
import telas.imprimirValorRetiradoEValorAtual;
import telas.consultas.ConsultarInvestimentosDoCliente;
import dominios.Client;
import dominios.Investimento;

import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class RetirarInvestimento {

    public void retirarInvestimento(double quantidadeRetirada, Client usuario){
        ConsultarInvestimentosDoCliente.consultarInvestimentosDoCliente(usuario);
        for (Investimento investimento : listaDeInvestimentos) {
            if(investimento.getUsername().equals(usuario.getUsername())){
                double quantidadeNova = investimento.getQuantidadeInvestida() - quantidadeRetirada;
                investimento.setQuantidadeInvestida(quantidadeNova);
                imprimirValorRetiradoEValorAtual.quantidadeRetirada(quantidadeRetirada, investimento);
            }
        }
    }
}
