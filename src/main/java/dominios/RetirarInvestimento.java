package dominios;
import repositorio.InvestimentsRepository;
import telas.ValorARetirar;

import java.util.Scanner;
import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class RetirarInvestimento {

    public void retirarInvestimento(double quantidadeRetirada, Client usuario){
        InvestimentsRepository.consultarInvestimentosDoCliente(usuario);
        for (InvestimentsRepository investimento : listaDeInvestimentos) {
            if(investimento.getUsername().equals(usuario.getUsername())){
                double quantidadeNova = investimento.getQuantidadeInvestida() - quantidadeRetirada;
                investimento.setQuantidadeInvestida(quantidadeNova);
                System.out.printf("%nQuantidade retirada no valor: %.2f%nSaldo Atual na Conta: %.2f%n", quantidadeRetirada, investimento.getQuantidadeInvestida());
            }
        }
    }
}
