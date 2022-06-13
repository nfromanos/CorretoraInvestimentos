package serviços.operações;
import telas.consultas.ConsultarInvestimentosDoCliente;
import dominios.Client;
import dominios.Investimento;
import dominios.TiposDeInvestimento;
import repositorio.InvestimentsRepository;

import java.time.LocalTime;
import java.util.Scanner;

public class RealizarInvestimento {

    public void investir(Client usuario, double quantidadeComprada, String investimentoAdquirido){
        Investimento investimento = new Investimento(usuario.getUsername(), TiposDeInvestimento.valueOf(investimentoAdquirido), quantidadeComprada, LocalTime.now(), LocalTime.now());
        InvestimentsRepository.addInvestimento(investimento);
        ConsultarInvestimentosDoCliente.consultarInvestimentosDoCliente(usuario);
    }
}