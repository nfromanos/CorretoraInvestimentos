package serviços.operações;
import telas.consultas.ConsultarInvestimentosDoCliente;
import dominios.Client;
import dominios.Investimento;
import dominios.TiposDeInvestimento;
import telas.InserirInvestimentoRecomendado;
import repositorio.InvestimentsRepository;
import telas.InserirQuantidadeAtivoComprado;

import java.time.LocalTime;
import java.util.Scanner;

public class RealizarInvestimento {

    public void investir(Scanner scanner, Client usuario, InserirQuantidadeAtivoComprado quantidadeComprada, InserirInvestimentoRecomendado investimentoRecomendado){
        String opcaoDeInvestimentoSelecionado = investimentoRecomendado.getInvestimentoRecomendado(usuario, scanner);
        double quantidadeDoAtivo = quantidadeComprada.quantidadeAtivo(scanner);
        Investimento investimento = new Investimento(usuario.getUsername(), TiposDeInvestimento.valueOf(opcaoDeInvestimentoSelecionado), quantidadeDoAtivo, LocalTime.now(), LocalTime.now());
        InvestimentsRepository.addInvestimento(investimento);
        ConsultarInvestimentosDoCliente.consultarInvestimentosDoCliente(usuario);
    }
}