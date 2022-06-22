package serviços.operações;
import dominios.InvestimentoCorretora;
import telas.consultas.ConsultarInvestimentosDoCliente;
import dominios.Client;
import dominios.InvestimentoCliente;
import dominios.TiposDeInvestimento;
import repositorio.InvestimentsRepository;

import java.time.LocalTime;

public class Investir {
    public void investir(Client usuario, double quantidadeComprada, String investimentoAdquirido, InvestimentoCorretora investimento){
        InvestimentoCliente investimentoCliente = new InvestimentoCliente(usuario.getUsername(), TiposDeInvestimento.valueOf(investimentoAdquirido), investimento, quantidadeComprada, usuario.getProfile(), LocalTime.now(), LocalTime.now());
        InvestimentsRepository.addInvestimento(investimentoCliente);
        ConsultarInvestimentosDoCliente consultar = new ConsultarInvestimentosDoCliente();
        consultar.consultar(usuario.getUsername());
    }
}