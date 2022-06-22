package serviços.operações;
import Factorys.FactoryInvestimentos;
import dominios.InvestimentoCorretora;
import telas.consultas.ConsultarInvestimentosDoCliente;
import dominios.Client;
import dominios.InvestimentoCliente;
import dominios.TiposDeInvestimento;
import repositorio.InvestimentsRepository;

import java.time.LocalTime;

public class Investir {
    public void investir(Client usuario, double quantidadeComprada, String investimentoAdquirido, InvestimentoCorretora investimento){
        FactoryInvestimentos.factoryInvestimentos( usuario, quantidadeComprada, investimentoAdquirido, investimento);
        ConsultarInvestimentosDoCliente consultar = new ConsultarInvestimentosDoCliente();
        consultar.consultar(usuario.getUsername());
    }
}