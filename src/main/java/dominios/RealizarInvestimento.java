package dominios;
import telas.MenuInveste;
import repositorio.InvestimentsRepository;
import java.time.LocalTime;
import java.util.Scanner;

public class RealizarInvestimento {

//    Tem que investir e retirar o investimento

    public void investir(Scanner scanner, Client usuario, MenuInveste menuInveste){
        String opcaoDeInvestimentoSelecionado = menuInveste.menuInvestir(usuario, scanner);
        double quantidadeDoAtivo = menuInveste.quantidadeAtivo(scanner);
        InvestimentsRepository investimento = new InvestimentsRepository(usuario.getUsername(), TiposDeInvestimento.valueOf(opcaoDeInvestimentoSelecionado), quantidadeDoAtivo, LocalTime.now(), LocalTime.now());
        InvestimentsRepository.addInvestimento(investimento);
        InvestimentsRepository.consultarInvestimentosDoCliente(usuario);
    }
}