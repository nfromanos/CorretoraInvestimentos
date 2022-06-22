package Factorys;
import dominios.Client;
import dominios.InvestimentoCliente;
import dominios.InvestimentoCorretora;
import dominios.TiposDeInvestimento;
import repositorio.InvestimentsRepository;

import java.time.LocalTime;

public class FactoryInvestimentos {
    public static void factoryInvestimentos(Client usuario, double quantidadeComprada, String investimentoAdquirido, InvestimentoCorretora investimento){
        InvestimentoCliente investimentoCliente = new InvestimentoCliente(usuario.getUsername(), TiposDeInvestimento.valueOf(investimentoAdquirido), investimento, quantidadeComprada, usuario.getProfile(), LocalTime.now(), LocalTime.now());
        InvestimentsRepository.addInvestimento(investimentoCliente);
    }
}
