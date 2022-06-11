package dominios;
import telas.MenuInveste;
import repositorio.InvestimentsRepository;
import java.time.LocalTime;
import java.util.Scanner;

public class RealizarInvestimento {

//    Tem que investir e retirar o investimento

    public void investir(double quantidadeDoAtivo, Client usuario){
        InvestimentsRepository investimento = new InvestimentsRepository(usuario.getUsername(), TiposDeInvestimento.valueOf(opcaoDeInvestimentoSelecionado), quantidadeDoAtivo, LocalTime.now(), LocalTime.now());
        InvestimentsRepository.addInvestimento(investimento);
        InvestimentsRepository.consultarInvestimentosDoCliente(usuario);
    }
}